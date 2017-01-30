
// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, STRUCT=2, TRUE=3, FALSE=4, INT=5, IF=6, ELSE=7, WHILE=8, RETURN=9, 
		CHAR=10, BOOLEAN=11, VOID=12, SCAN=13, PRINT=14, WS=15, CHR=16, ID=17, 
		NUM=18, STRING=19, COMMENT=20, COMA=21, AND=22, OR=23, LBRACE=24, RBRACE=25, 
		DOTCOMMA=26, RCORCH=27, LCORCH=28, LPARENT=29, RPARENT=30, EQ=31, DOT=32, 
		PLUS=33, MINUS=34, EXC=35, AST=36, SLSH=37, PRCNT=38, MTHAN=39, LTHAN=40, 
		EQMTHAN=41, EQLTHAN=42, EQEQ=43, NOTEQ=44;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_structDeclaration = 3, 
		RULE_varType = 4, RULE_methodDeclaration = 5, RULE_methodType = 6, RULE_parameter = 7, 
		RULE_parameterType = 8, RULE_block = 9, RULE_statement = 10, RULE_assignation = 11, 
		RULE_whileBlock = 12, RULE_returnBlock = 13, RULE_print = 14, RULE_scan = 15, 
		RULE_myIf = 16, RULE_location = 17, RULE_dotLocation = 18, RULE_declaredVariable = 19, 
		RULE_variable = 20, RULE_arrayVariable = 21, RULE_expressionInP = 22, 
		RULE_nExpression = 23, RULE_expression = 24, RULE_andExpression = 25, 
		RULE_equalsExpression = 26, RULE_relationExpression = 27, RULE_addSubsExpression = 28, 
		RULE_mulDivExpression = 29, RULE_prExpression = 30, RULE_basicExpression = 31, 
		RULE_basic = 32, RULE_arg = 33, RULE_methodCall = 34, RULE_as_op = 35, 
		RULE_md_op = 36, RULE_pr_op = 37, RULE_rel_op = 38, RULE_eq_op = 39, RULE_cond_op = 40, 
		RULE_literal = 41, RULE_int_literal = 42, RULE_char_literal = 43, RULE_bool_literal = 44;
	public static final String[] ruleNames = {
		"program", "declaration", "varDeclaration", "structDeclaration", "varType", 
		"methodDeclaration", "methodType", "parameter", "parameterType", "block", 
		"statement", "assignation", "whileBlock", "returnBlock", "print", "scan", 
		"myIf", "location", "dotLocation", "declaredVariable", "variable", "arrayVariable", 
		"expressionInP", "nExpression", "expression", "andExpression", "equalsExpression", 
		"relationExpression", "addSubsExpression", "mulDivExpression", "prExpression", 
		"basicExpression", "basic", "arg", "methodCall", "as_op", "md_op", "pr_op", 
		"rel_op", "eq_op", "cond_op", "literal", "int_literal", "char_literal", 
		"bool_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'struct'", "'true'", "'false'", "'int'", "'if'", "'else'", 
		"'while'", "'return'", "'char'", "'boolean'", "'void'", "'scan'", "'print'", 
		null, null, null, null, null, null, "','", "'&&'", "'||'", "'{'", "'}'", 
		"';'", "']'", "'['", "'('", "')'", "'='", "'.'", "'+'", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "STRUCT", "TRUE", "FALSE", "INT", "IF", "ELSE", "WHILE", 
		"RETURN", "CHAR", "BOOLEAN", "VOID", "SCAN", "PRINT", "WS", "CHR", "ID", 
		"NUM", "STRING", "COMMENT", "COMA", "AND", "OR", "LBRACE", "RBRACE", "DOTCOMMA", 
		"RCORCH", "LCORCH", "LPARENT", "RPARENT", "EQ", "DOT", "PLUS", "MINUS", 
		"EXC", "AST", "SLSH", "PRCNT", "MTHAN", "LTHAN", "EQMTHAN", "EQLTHAN", 
		"EQEQ", "NOTEQ"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HelloParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(HelloParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HelloParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CLASS);
			setState(91);
			match(ID);
			setState(92);
			match(LBRACE);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(93);
				declaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				structDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode DOTCOMMA() { return getToken(HelloParser.DOTCOMMA, 0); }
		public TerminalNode LCORCH() { return getToken(HelloParser.LCORCH, 0); }
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public TerminalNode RCORCH() { return getToken(HelloParser.RCORCH, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				varType();
				setState(107);
				match(ID);
				setState(108);
				match(DOTCOMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				varType();
				setState(111);
				match(ID);
				setState(112);
				match(LCORCH);
				setState(113);
				match(NUM);
				setState(114);
				match(RCORCH);
				setState(115);
				match(DOTCOMMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(HelloParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(HelloParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HelloParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(STRUCT);
			setState(120);
			match(ID);
			setState(121);
			match(LBRACE);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(122);
				varDeclaration();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(HelloParser.VOID, 0); }
		public TerminalNode STRUCT() { return getToken(HelloParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(130);
				match(INT);
				}
				break;
			case 2:
				{
				setState(131);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(132);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				{
				setState(133);
				match(STRUCT);
				setState(134);
				match(ID);
				}
				}
				break;
			case 5:
				{
				setState(135);
				structDeclaration();
				}
				break;
			case 6:
				{
				setState(136);
				match(VOID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(HelloParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(HelloParser.COMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			methodType();
			setState(140);
			match(ID);
			setState(141);
			match(LPARENT);
			setState(150);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) {
				{
				setState(142);
				parameter();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(143);
					match(COMA);
					setState(144);
					parameter();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(RPARENT);
			setState(153);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(HelloParser.VOID, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMethodType(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(HelloParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(HelloParser.RCORCH, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				parameterType();
				setState(158);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				parameterType();
				setState(161);
				match(ID);
				setState(162);
				match(LCORCH);
				setState(163);
				match(RCORCH);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParameterType(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HelloParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HelloParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LBRACE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(170);
				varDeclaration();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CHR) | (1L << ID) | (1L << NUM) | (1L << LPARENT) | (1L << MINUS) | (1L << EXC))) != 0)) {
				{
				{
				setState(176);
				statement();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public MyIfContext myIf() {
			return getRuleContext(MyIfContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode DOTCOMMA() { return getToken(HelloParser.DOTCOMMA, 0); }
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				myIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				returnBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				whileBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				methodCall();
				setState(188);
				match(DOTCOMMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				assignation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				expression(0);
				setState(192);
				match(DOTCOMMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public TerminalNode DOTCOMMA() { return getToken(HelloParser.DOTCOMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			location();
			setState(198);
			match(EQ);
			setState(201);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CHR:
			case ID:
			case NUM:
			case LPARENT:
			case MINUS:
			case EXC:
				{
				setState(199);
				expression(0);
				}
				break;
			case SCAN:
				{
				setState(200);
				scan();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			match(DOTCOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileBlock(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(WHILE);
			setState(206);
			match(LPARENT);
			setState(207);
			expression(0);
			setState(208);
			match(RPARENT);
			setState(209);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public TerminalNode DOTCOMMA() { return getToken(HelloParser.DOTCOMMA, 0); }
		public NExpressionContext nExpression() {
			return getRuleContext(NExpressionContext.class,0);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReturnBlock(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RETURN);
			{
			setState(212);
			nExpression();
			}
			setState(213);
			match(DOTCOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public TerminalNode DOTCOMMA() { return getToken(HelloParser.DOTCOMMA, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(PRINT);
			setState(216);
			match(LPARENT);
			setState(219);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(217);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(218);
				location();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(RPARENT);
			setState(222);
			match(DOTCOMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(HelloParser.SCAN, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SCAN);
			setState(225);
			match(LPARENT);
			setState(226);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public MyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMyIf(this);
		}
	}

	public final MyIfContext myIf() throws RecognitionException {
		MyIfContext _localctx = new MyIfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_myIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IF);
			setState(229);
			match(LPARENT);
			setState(230);
			expression(0);
			setState(231);
			match(RPARENT);
			setState(232);
			block();
			setState(235);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(233);
				match(ELSE);
				setState(234);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public DeclaredVariableContext declaredVariable() {
			return getRuleContext(DeclaredVariableContext.class,0);
		}
		public DotLocationContext dotLocation() {
			return getRuleContext(DotLocationContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_location);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				declaredVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				dotLocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotLocationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HelloParser.DOT, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public DotLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDotLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDotLocation(this);
		}
	}

	public final DotLocationContext dotLocation() throws RecognitionException {
		DotLocationContext _localctx = new DotLocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dotLocation);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				variable();
				{
				setState(242);
				match(DOT);
				setState(243);
				location();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				arrayVariable();
				{
				setState(246);
				match(DOT);
				setState(247);
				location();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaredVariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public DeclaredVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaredVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaredVariable(this);
		}
	}

	public final DeclaredVariableContext declaredVariable() throws RecognitionException {
		DeclaredVariableContext _localctx = new DeclaredVariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaredVariable);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				arrayVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(HelloParser.LCORCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(HelloParser.RCORCH, 0); }
		public ArrayVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArrayVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArrayVariable(this);
		}
	}

	public final ArrayVariableContext arrayVariable() throws RecognitionException {
		ArrayVariableContext _localctx = new ArrayVariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(258);
			match(LCORCH);
			setState(259);
			expression(0);
			setState(260);
			match(RCORCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionInPContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public ExpressionInPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpressionInP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpressionInP(this);
		}
	}

	public final ExpressionInPContext expressionInP() throws RecognitionException {
		ExpressionInPContext _localctx = new ExpressionInPContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionInP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LPARENT);
			setState(263);
			expression(0);
			setState(264);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNExpression(this);
		}
	}

	public final NExpressionContext nExpression() throws RecognitionException {
		NExpressionContext _localctx = new NExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nExpression);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CHR:
			case ID:
			case NUM:
			case LPARENT:
			case MINUS:
			case EXC:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expression(0);
				}
				break;
			case DOTCOMMA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(274);
					match(OR);
					setState(275);
					andExpression(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			equalsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(284);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(285);
					match(AND);
					setState(286);
					equalsExpression(0);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualsExpressionContext extends ParserRuleContext {
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqualsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEqualsExpression(this);
		}
	}

	public final EqualsExpressionContext equalsExpression() throws RecognitionException {
		return equalsExpression(0);
	}

	private EqualsExpressionContext equalsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualsExpressionContext _localctx = new EqualsExpressionContext(_ctx, _parentState);
		EqualsExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_equalsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			relationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalsExpression);
					setState(295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(296);
					eq_op();
					setState(297);
					relationExpression(0);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationExpressionContext extends ParserRuleContext {
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRelationExpression(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		return relationExpression(0);
	}

	private RelationExpressionContext relationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, _parentState);
		RelationExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_relationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			addSubsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpression);
					setState(307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(308);
					rel_op();
					setState(309);
					addSubsExpression(0);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddSubsExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public As_opContext as_op() {
			return getRuleContext(As_opContext.class,0);
		}
		public AddSubsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAddSubsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAddSubsExpression(this);
		}
	}

	public final AddSubsExpressionContext addSubsExpression() throws RecognitionException {
		return addSubsExpression(0);
	}

	private AddSubsExpressionContext addSubsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubsExpressionContext _localctx = new AddSubsExpressionContext(_ctx, _parentState);
		AddSubsExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_addSubsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			mulDivExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addSubsExpression);
					setState(319);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(320);
					as_op();
					setState(321);
					mulDivExpression(0);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulDivExpressionContext extends ParserRuleContext {
		public PrExpressionContext prExpression() {
			return getRuleContext(PrExpressionContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public Md_opContext md_op() {
			return getRuleContext(Md_opContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMulDivExpression(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		return mulDivExpression(0);
	}

	private MulDivExpressionContext mulDivExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, _parentState);
		MulDivExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_mulDivExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
			prExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
					setState(331);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(332);
					md_op();
					setState(333);
					prExpression(0);
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrExpressionContext extends ParserRuleContext {
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public PrExpressionContext prExpression() {
			return getRuleContext(PrExpressionContext.class,0);
		}
		public Pr_opContext pr_op() {
			return getRuleContext(Pr_opContext.class,0);
		}
		public PrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrExpression(this);
		}
	}

	public final PrExpressionContext prExpression() throws RecognitionException {
		return prExpression(0);
	}

	private PrExpressionContext prExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrExpressionContext _localctx = new PrExpressionContext(_ctx, _parentState);
		PrExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_prExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			basicExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prExpression);
					setState(343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(344);
					pr_op();
					setState(345);
					basicExpression();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasicExpressionContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public TerminalNode EXC() { return getToken(HelloParser.EXC, 0); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBasicExpression(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_basicExpression);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(LPARENT);
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(354);
				match(RPARENT);
				setState(355);
				basic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(MINUS);
				setState(357);
				basic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(EXC);
				setState(359);
				basic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				basic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicContext extends ParserRuleContext {
		public ExpressionInPContext expressionInP() {
			return getRuleContext(ExpressionInPContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBasic(this);
		}
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_basic);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				expressionInP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				location();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(HelloParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(HelloParser.COMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(ID);
			setState(372);
			match(LPARENT);
			setState(381);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << CHR) | (1L << ID) | (1L << NUM) | (1L << LPARENT) | (1L << MINUS) | (1L << EXC))) != 0)) {
				{
				setState(373);
				arg();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(374);
					match(COMA);
					setState(375);
					arg();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(383);
			match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public As_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAs_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAs_op(this);
		}
	}

	public final As_opContext as_op() throws RecognitionException {
		As_opContext _localctx = new As_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_as_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Md_opContext extends ParserRuleContext {
		public TerminalNode AST() { return getToken(HelloParser.AST, 0); }
		public TerminalNode SLSH() { return getToken(HelloParser.SLSH, 0); }
		public Md_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMd_op(this);
		}
	}

	public final Md_opContext md_op() throws RecognitionException {
		Md_opContext _localctx = new Md_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_md_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==AST || _la==SLSH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_opContext extends ParserRuleContext {
		public TerminalNode PRCNT() { return getToken(HelloParser.PRCNT, 0); }
		public Pr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPr_op(this);
		}
	}

	public final Pr_opContext pr_op() throws RecognitionException {
		Pr_opContext _localctx = new Pr_opContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pr_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(PRCNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode LTHAN() { return getToken(HelloParser.LTHAN, 0); }
		public TerminalNode MTHAN() { return getToken(HelloParser.MTHAN, 0); }
		public TerminalNode EQLTHAN() { return getToken(HelloParser.EQLTHAN, 0); }
		public TerminalNode EQMTHAN() { return getToken(HelloParser.EQMTHAN, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MTHAN) | (1L << LTHAN) | (1L << EQMTHAN) | (1L << EQLTHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(HelloParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(HelloParser.NOTEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==EQEQ || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				int_literal();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				char_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				bool_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HelloParser.NUM, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(HelloParser.CHR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(CHR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HelloParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HelloParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 25:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 26:
			return equalsExpression_sempred((EqualsExpressionContext)_localctx, predIndex);
		case 27:
			return relationExpression_sempred((RelationExpressionContext)_localctx, predIndex);
		case 28:
			return addSubsExpression_sempred((AddSubsExpressionContext)_localctx, predIndex);
		case 29:
			return mulDivExpression_sempred((MulDivExpressionContext)_localctx, predIndex);
		case 30:
			return prExpression_sempred((PrExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalsExpression_sempred(EqualsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpression_sempred(RelationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addSubsExpression_sempred(AddSubsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulDivExpression_sempred(MulDivExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean prExpression_sempred(PrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u019b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4\3"+
		"\5\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0094\n\7\f\7\16"+
		"\7\u0097\13\7\5\7\u0099\n\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\13\3\13\7\13\u00ae\n\13\f\13\16\13"+
		"\u00b1\13\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3\r"+
		"\5\r\u00cc\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ee\n\22\3\23\3\23\5\23"+
		"\u00f2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fc\n\24\3"+
		"\25\3\25\5\25\u0100\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\5\31\u010f\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0117\n\32\f\32\16\32\u011a\13\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0122\n\33\f\33\16\33\u0125\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u013a\n\35\f\35\16\35\u013d\13\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u0146\n\36\f\36\16\36\u0149\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u0152\n\37\f\37\16\37\u0155\13\37\3 \3 \3 \3 \3 "+
		"\3 \3 \7 \u015e\n \f \16 \u0161\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u016c"+
		"\n!\3\"\3\"\3\"\3\"\5\"\u0172\n\"\3#\3#\3$\3$\3$\3$\3$\7$\u017b\n$\f$"+
		"\16$\u017e\13$\5$\u0180\n$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3+\5+\u0193\n+\3,\3,\3-\3-\3.\3.\3.\2\t\62\64\668:<>/\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\2\13\4\2\7\7\f\16\4\2\7\7\f\r\4\2\7\7\f\f\3\2#$\3\2&\'\3\2),\3\2-.\3"+
		"\2\30\31\3\2\5\6\u019a\2\\\3\2\2\2\4j\3\2\2\2\6w\3\2\2\2\by\3\2\2\2\n"+
		"\u008b\3\2\2\2\f\u008d\3\2\2\2\16\u009d\3\2\2\2\20\u00a7\3\2\2\2\22\u00a9"+
		"\3\2\2\2\24\u00ab\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00cf\3"+
		"\2\2\2\34\u00d5\3\2\2\2\36\u00d9\3\2\2\2 \u00e2\3\2\2\2\"\u00e6\3\2\2"+
		"\2$\u00f1\3\2\2\2&\u00fb\3\2\2\2(\u00ff\3\2\2\2*\u0101\3\2\2\2,\u0103"+
		"\3\2\2\2.\u0108\3\2\2\2\60\u010e\3\2\2\2\62\u0110\3\2\2\2\64\u011b\3\2"+
		"\2\2\66\u0126\3\2\2\28\u0132\3\2\2\2:\u013e\3\2\2\2<\u014a\3\2\2\2>\u0156"+
		"\3\2\2\2@\u016b\3\2\2\2B\u0171\3\2\2\2D\u0173\3\2\2\2F\u0175\3\2\2\2H"+
		"\u0183\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u0189\3\2\2\2P\u018b\3\2"+
		"\2\2R\u018d\3\2\2\2T\u0192\3\2\2\2V\u0194\3\2\2\2X\u0196\3\2\2\2Z\u0198"+
		"\3\2\2\2\\]\7\3\2\2]^\7\23\2\2^b\7\32\2\2_a\5\4\3\2`_\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\33\2\2f\3\3\2\2\2gk\5\b"+
		"\5\2hk\5\6\4\2ik\5\f\7\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\5\3\2\2\2lm\5"+
		"\n\6\2mn\7\23\2\2no\7\34\2\2ox\3\2\2\2pq\5\n\6\2qr\7\23\2\2rs\7\36\2\2"+
		"st\7\24\2\2tu\7\35\2\2uv\7\34\2\2vx\3\2\2\2wl\3\2\2\2wp\3\2\2\2x\7\3\2"+
		"\2\2yz\7\4\2\2z{\7\23\2\2{\177\7\32\2\2|~\5\6\4\2}|\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0083\7\33\2\2\u0083\t\3\2\2\2\u0084\u008c\7\7\2\2\u0085\u008c"+
		"\7\f\2\2\u0086\u008c\7\r\2\2\u0087\u0088\7\4\2\2\u0088\u008c\7\23\2\2"+
		"\u0089\u008c\5\b\5\2\u008a\u008c\7\16\2\2\u008b\u0084\3\2\2\2\u008b\u0085"+
		"\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\13\3\2\2\2\u008d\u008e\5\16\b\2\u008e\u008f\7\23"+
		"\2\2\u008f\u0098\7\37\2\2\u0090\u0095\5\20\t\2\u0091\u0092\7\27\2\2\u0092"+
		"\u0094\5\20\t\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7 "+
		"\2\2\u009b\u009c\5\24\13\2\u009c\r\3\2\2\2\u009d\u009e\t\2\2\2\u009e\17"+
		"\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\7\23\2\2\u00a1\u00a8\3\2\2\2"+
		"\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\36\2\2\u00a5"+
		"\u00a6\7\35\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a2\3"+
		"\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\23\3\2\2\2\u00ab\u00af"+
		"\7\32\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b4\5\26\f\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00b9\7\33\2\2\u00b9\25\3\2\2\2\u00ba\u00c6\5\"\22\2\u00bb"+
		"\u00c6\5\34\17\2\u00bc\u00c6\5\32\16\2\u00bd\u00be\5F$\2\u00be\u00bf\7"+
		"\34\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c6\5\30\r\2\u00c1\u00c2\5\62\32\2"+
		"\u00c2\u00c3\7\34\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\5\36\20\2\u00c5"+
		"\u00ba\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2"+
		"\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\27\3\2\2\2\u00c7\u00c8\5$\23\2\u00c8\u00cb\7!\2\2\u00c9\u00cc\5\62\32"+
		"\2\u00ca\u00cc\5 \21\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\7\34\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\n\2\2\u00d0"+
		"\u00d1\7\37\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\7 \2\2\u00d3\u00d4\5"+
		"\24\13\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5\60\31\2\u00d7"+
		"\u00d8\7\34\2\2\u00d8\35\3\2\2\2\u00d9\u00da\7\20\2\2\u00da\u00dd\7\37"+
		"\2\2\u00db\u00de\7\25\2\2\u00dc\u00de\5$\23\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7 \2\2\u00e0\u00e1\7\34"+
		"\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3\u00e4\7\37\2\2\u00e4"+
		"\u00e5\7 \2\2\u00e5!\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\7\37\2\2"+
		"\u00e8\u00e9\5\62\32\2\u00e9\u00ea\7 \2\2\u00ea\u00ed\5\24\13\2\u00eb"+
		"\u00ec\7\t\2\2\u00ec\u00ee\5\24\13\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee#\3\2\2\2\u00ef\u00f2\5(\25\2\u00f0\u00f2\5&\24\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f4\5*\26\2\u00f4"+
		"\u00f5\7\"\2\2\u00f5\u00f6\5$\23\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\5,"+
		"\27\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u0100\5*\26\2"+
		"\u00fe\u0100\5,\27\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100)\3"+
		"\2\2\2\u0101\u0102\7\23\2\2\u0102+\3\2\2\2\u0103\u0104\7\23\2\2\u0104"+
		"\u0105\7\36\2\2\u0105\u0106\5\62\32\2\u0106\u0107\7\35\2\2\u0107-\3\2"+
		"\2\2\u0108\u0109\7\37\2\2\u0109\u010a\5\62\32\2\u010a\u010b\7 \2\2\u010b"+
		"/\3\2\2\2\u010c\u010f\5\62\32\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2"+
		"\2\u010e\u010d\3\2\2\2\u010f\61\3\2\2\2\u0110\u0111\b\32\1\2\u0111\u0112"+
		"\5\64\33\2\u0112\u0118\3\2\2\2\u0113\u0114\f\3\2\2\u0114\u0115\7\31\2"+
		"\2\u0115\u0117\5\64\33\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\63\3\2\2\2\u011a\u0118\3\2\2"+
		"\2\u011b\u011c\b\33\1\2\u011c\u011d\5\66\34\2\u011d\u0123\3\2\2\2\u011e"+
		"\u011f\f\3\2\2\u011f\u0120\7\30\2\2\u0120\u0122\5\66\34\2\u0121\u011e"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\65\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\b\34\1\2\u0127\u0128\58\35"+
		"\2\u0128\u012f\3\2\2\2\u0129\u012a\f\3\2\2\u012a\u012b\5P)\2\u012b\u012c"+
		"\58\35\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\67\3\2\2\2\u0131\u012f\3\2\2"+
		"\2\u0132\u0133\b\35\1\2\u0133\u0134\5:\36\2\u0134\u013b\3\2\2\2\u0135"+
		"\u0136\f\3\2\2\u0136\u0137\5N(\2\u0137\u0138\5:\36\2\u0138\u013a\3\2\2"+
		"\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c9\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\36\1\2\u013f"+
		"\u0140\5<\37\2\u0140\u0147\3\2\2\2\u0141\u0142\f\3\2\2\u0142\u0143\5H"+
		"%\2\u0143\u0144\5<\37\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148;\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u014a\u014b\b\37\1\2\u014b\u014c\5> \2\u014c\u0153"+
		"\3\2\2\2\u014d\u014e\f\3\2\2\u014e\u014f\5J&\2\u014f\u0150\5> \2\u0150"+
		"\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154=\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157"+
		"\b \1\2\u0157\u0158\5@!\2\u0158\u015f\3\2\2\2\u0159\u015a\f\3\2\2\u015a"+
		"\u015b\5L\'\2\u015b\u015c\5@!\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2"+
		"\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160?"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\37\2\2\u0163\u0164\t\4\2\2"+
		"\u0164\u0165\7 \2\2\u0165\u016c\5B\"\2\u0166\u0167\7$\2\2\u0167\u016c"+
		"\5B\"\2\u0168\u0169\7%\2\2\u0169\u016c\5B\"\2\u016a\u016c\5B\"\2\u016b"+
		"\u0162\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016cA\3\2\2\2\u016d\u0172\5.\30\2\u016e\u0172\5$\23\2\u016f\u0172"+
		"\5F$\2\u0170\u0172\5T+\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172C\3\2\2\2\u0173\u0174\5\62\32"+
		"\2\u0174E\3\2\2\2\u0175\u0176\7\23\2\2\u0176\u017f\7\37\2\2\u0177\u017c"+
		"\5D#\2\u0178\u0179\7\27\2\2\u0179\u017b\5D#\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\7 \2\2\u0182G\3\2\2\2\u0183\u0184\t\5\2\2\u0184"+
		"I\3\2\2\2\u0185\u0186\t\6\2\2\u0186K\3\2\2\2\u0187\u0188\7(\2\2\u0188"+
		"M\3\2\2\2\u0189\u018a\t\7\2\2\u018aO\3\2\2\2\u018b\u018c\t\b\2\2\u018c"+
		"Q\3\2\2\2\u018d\u018e\t\t\2\2\u018eS\3\2\2\2\u018f\u0193\5V,\2\u0190\u0193"+
		"\5X-\2\u0191\u0193\5Z.\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193U\3\2\2\2\u0194\u0195\7\24\2\2\u0195W\3\2\2\2\u0196"+
		"\u0197\7\22\2\2\u0197Y\3\2\2\2\u0198\u0199\t\n\2\2\u0199[\3\2\2\2 bjw"+
		"\177\u008b\u0095\u0098\u00a7\u00af\u00b5\u00c5\u00cb\u00dd\u00ed\u00f1"+
		"\u00fb\u00ff\u010e\u0118\u0123\u012f\u013b\u0147\u0153\u015f\u016b\u0171"+
		"\u017c\u017f\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}