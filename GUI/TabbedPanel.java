import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.text.*;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.gui.TreeViewer;

class TabbedPanel extends JFrame {
	private JTextArea areaGrammar = new JTextArea(20,120);
	private JTextArea areaTest = new JTextArea(20,120);
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	private String currentFile = "Untitled";
	private boolean changed = false;
	JPanel treePanel = new JPanel();

	public TabbedPanel(){
			//Grammar Editor
			areaGrammar.setFont(new Font("Monospaced", Font.PLAIN, 12));
			JScrollPane scrollGrammar = new JScrollPane(areaGrammar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollGrammar, BorderLayout.CENTER);
			scrollGrammar.setVisible(true);

			//Test Editor
			areaTest.setFont(new Font("Monospaced", Font.PLAIN, 12));
			JScrollPane scrollTest = new JScrollPane(areaTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollTest, BorderLayout.CENTER);
			scrollTest.setVisible(true);

			//Buttons

			JMenuBar JMB = new JMenuBar();
			setJMenuBar(JMB);
			JMenu file = new JMenu("File");
			JMenu edit = new JMenu("Edit");

			JMB.add(file);
			JMB.add(edit);

			file.add(Open);
			file.add(Save);
			file.add(Quit);
			file.add(SaveAs);
			file.addSeparator();

			for(int i=0; i<4; i++)
				file.getItem(i).setIcon(null);

			edit.add(Cut);
			edit.add(Copy);
			edit.add(Paste);

			edit.getItem(0).setText("Cut out");
			edit.getItem(1).setText("Copy");
			edit.getItem(2).setText("Paste");

			JToolBar tool = new JToolBar();
			add(tool,BorderLayout.NORTH);
			tool.add(Open);tool.add(Save);
			tool.addSeparator();

			JButton cut = tool.add(Cut), cop = tool.add(Copy), pas = tool.add(Paste);
			//Symbols to add
			cut.setText(null); cut.setIcon(new ImageIcon("C:/Users/Freddie/workspace/antlr4/src/antlr4/Editor/cut.gif"));
			cop.setText(null); cop.setIcon(new ImageIcon("C:/Users/Freddie/workspace/antlr4/src/antlr4/Editor/copy.gif"));
			pas.setText(null); pas.setIcon(new ImageIcon("C:/Users/Freddie/workspace/antlr4/src/antlr4/Editor/paste.gif"));

			Save.setEnabled(false);
			SaveAs.setEnabled(false);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack();
			areaGrammar.addKeyListener(k1);
			setTitle(currentFile);
			setVisible(true);
			
			JTabbedPane tabbedPane = new JTabbedPane();
			Container contentPane = getContentPane();
			contentPane.add(tabbedPane, BorderLayout.CENTER);
			tabbedPane.addTab("Grammar Editor", scrollGrammar);
			tabbedPane.addTab("Grammar Test", scrollTest);
			tabbedPane.addTab("Antlr Tree", treePanel);
	}

	private KeyListener k1 = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			changed = true;
			Save.setEnabled(true);
			SaveAs.setEnabled(true);
		}
	};
	//Symbol to add
	Action Open = new AbstractAction("Open", new ImageIcon("C:/Users/Freddie/workspace/antlr4/src/antlr4/Editor/open.gif")) {
		public void actionPerformed(ActionEvent e) {
			saveOld();
			if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
				readInFile(dialog.getSelectedFile().getAbsolutePath());
			}
			SaveAs.setEnabled(true);
		}
	};
	//Symbol to add
	Action Save = new AbstractAction("Save", new ImageIcon("C:/Users/Freddie/workspace/antlr4/src/antlr4/Editor/save.gif")) {
		public void actionPerformed(ActionEvent e) {
			if(!currentFile.equals("Untitled"))
				saveFile(currentFile);
			else
				saveFileAs();
		}
	};

	Action SaveAs = new AbstractAction("Save as...") {
		public void actionPerformed(ActionEvent e) {
			saveFileAs();
		}
	};

	Action Quit = new AbstractAction("Quit") {
		public void actionPerformed(ActionEvent e) {
			saveOld();
			System.exit(0);
		}
	};

	ActionMap m = areaGrammar.getActionMap();
	Action Cut = m.get(DefaultEditorKit.cutAction);
	Action Copy = m.get(DefaultEditorKit.copyAction);
	Action Paste = m.get(DefaultEditorKit.pasteAction);

	private void saveFileAs() {
		if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
			saveFile(dialog.getSelectedFile().getAbsolutePath());
	}

	private void saveOld() {
		if(changed) {
			if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
				saveFile(currentFile);
		}
	}

	private void readInFile(String fileName) {
		try {
			FileReader r = new FileReader(fileName);
			areaGrammar.read(r,null);
			r.close();
			currentFile = fileName;
			setTitle(currentFile);
			changed = false;
		}
		catch(IOException e) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(this,"Editor can't find the file called "+fileName);
		}
	}

	private void saveFile(String fileName) {
		try {
			FileWriter w = new FileWriter(fileName);
			areaGrammar.write(w);
			w.close();
			currentFile = fileName;
			setTitle(currentFile);
			changed = false;
			Save.setEnabled(false);
		}
		catch(IOException e) {
		}
	}

	private void readToTree(){
		//ANTLR Tree
		ANTLRInputStream input = new ANTLRInputStream(areaTest.getText());
	  HelloLexer lexer  = new HelloLexer(input);
	  TokenStream tokenStream = new CommonTokenStream(lexer);
	  HelloParser parser = new HelloParser(tokenStream);
	  ParseTree tree = parser.r();

	  TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
	  viewr.setScale(1.5); //scale a little
	  treePanel.add(viewr);
	}
}
