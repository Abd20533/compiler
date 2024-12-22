// Generated from C:/Users/ÚÈÏÇáÑÍãä/IdeaProjects/compiler2/src/MyParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFUN=1, IF=2, SUM=3, NULL=4, CONS=5, CAR=6, CDR=7, DEFVAR=8, SETQ=9, 
		LIST=10, QUOTE=11, DOT=12, EVAL=13, PLUS=14, MINUS=15, MULT=16, MOD=17, 
		EQ=18, NEQ=19, GT=20, LT=21, GE=22, LE=23, AND=24, OR=25, NOT=26, WHILE=27, 
		DO=28, BREAK=29, RETURN=30, ID=31, NUMBER=32, FLOAT=33, LPAREN=34, RPAREN=35, 
		STRING=36, WS=37, COMMENT=38, FORWARD_SLASH=39, UNKNOWN=40, QW_MAPCAR=41, 
		QW_TRY=42, QW_CATCH=43, QW_DEFCLASS=44, QW_FINALLY=45, QW_MULTIPLE_VALUE_BIND=46, 
		QW_RETURN_FROM=47, QW_GO=48, QW_TAGBODY=49, QW_DEFSMETHOD=50, QW_SLOT_VALUE=51, 
		QW_MAKE_INSTANCE=52, QW_CALL_NEXT_METHOD=53, QW_DEFCONSTANT=54, QW_GENSYM=55, 
		QW_SYMBOL_VALUE=56, QW_DEFPACKAGE=57, QW_IN_PACKAGE=58, QW_USE_PACKAGE=59, 
		QW_IMPORT=60, QW_EXPORT=61, QW_DEFSTRUCT=62, QW_SETFARRAY=63, QW_GETELEM_ARRAY=64, 
		QW_ELEMENT_TYPE_ARRAY=65;
	public static final int
		RULE_program = 0, RULE_form = 1, RULE_variableDefinition = 2, RULE_value = 3, 
		RULE_expr = 4, RULE_varAssignment = 5, RULE_varDeclaration = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "form", "variableDefinition", "value", "expr", "varAssignment", 
			"varDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'defun'", "'if'", "'sum'", "'null'", "'cons'", "'car'", "'cdr'", 
			"'defvar'", "'setq'", "'list'", "'quote'", "'.'", "'eval'", "'+'", "'-'", 
			"'*'", null, "'='", "'/='", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'", 
			"'not'", "'while'", "'do'", "'break'", "'return'", null, null, null, 
			"'('", "')'", null, null, null, "'/'", null, "'mapcar'", "'try'", "'catch'", 
			"'defclass'", "'finally'", "'multiple-value-bind'", "'return-from'", 
			"'go'", "'tagbody'", "'defmethod'", "'slot-value'", "'make-instance'", 
			"'call-next-method'", "'defconstant'", "'gensym'", "'symbol-value'", 
			"'defpackage'", "'in-package'", "'use-package'", "'import'", "'export'", 
			"'defstruct'", "'setf'", "'aref'", "'element-type'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFUN", "IF", "SUM", "NULL", "CONS", "CAR", "CDR", "DEFVAR", "SETQ", 
			"LIST", "QUOTE", "DOT", "EVAL", "PLUS", "MINUS", "MULT", "MOD", "EQ", 
			"NEQ", "GT", "LT", "GE", "LE", "AND", "OR", "NOT", "WHILE", "DO", "BREAK", 
			"RETURN", "ID", "NUMBER", "FLOAT", "LPAREN", "RPAREN", "STRING", "WS", 
			"COMMENT", "FORWARD_SLASH", "UNKNOWN", "QW_MAPCAR", "QW_TRY", "QW_CATCH", 
			"QW_DEFCLASS", "QW_FINALLY", "QW_MULTIPLE_VALUE_BIND", "QW_RETURN_FROM", 
			"QW_GO", "QW_TAGBODY", "QW_DEFSMETHOD", "QW_SLOT_VALUE", "QW_MAKE_INSTANCE", 
			"QW_CALL_NEXT_METHOD", "QW_DEFCONSTANT", "QW_GENSYM", "QW_SYMBOL_VALUE", 
			"QW_DEFPACKAGE", "QW_IN_PACKAGE", "QW_USE_PACKAGE", "QW_IMPORT", "QW_EXPORT", 
			"QW_DEFSTRUCT", "QW_SETFARRAY", "QW_GETELEM_ARRAY", "QW_ELEMENT_TYPE_ARRAY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyParserParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869952L) != 0)) {
				{
				{
				setState(14);
				form();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				variableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				varDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SETQ() { return getToken(MyParserParser.SETQ, 0); }
		public TerminalNode DEFVAR() { return getToken(MyParserParser.DEFVAR, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if ( !(_la==DEFVAR || _la==SETQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(28);
			match(ID);
			setState(29);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyParserParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(MyParserParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MyParserParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MyParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParserParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(LPAREN);
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38);
					expr();
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 100931731456L) != 0) );
				setState(43);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParserParser.LPAREN, 0); }
		public TerminalNode SETQ() { return getToken(MyParserParser.SETQ, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MyParserParser.RPAREN, 0); }
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LPAREN);
			setState(48);
			match(SETQ);
			setState(49);
			match(ID);
			setState(50);
			expr();
			setState(51);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParserParser.LPAREN, 0); }
		public TerminalNode DEFVAR() { return getToken(MyParserParser.DEFVAR, 0); }
		public TerminalNode ID() { return getToken(MyParserParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(MyParserParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LPAREN);
			setState(54);
			match(DEFVAR);
			setState(55);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100931731456L) != 0)) {
				{
				setState(56);
				expr();
				}
			}

			setState(59);
			match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001A>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010\b\u0000"+
		"\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004(\b\u0004\u000b"+
		"\u0004\f\u0004)\u0001\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006:\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0001\u0001\u0000\b\t?\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u0019\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006"+
		"\u001f\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n/\u0001\u0000"+
		"\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u001a\u0003\u0004\u0002\u0000\u0017\u001a\u0003\n\u0005\u0000"+
		"\u0018\u001a\u0003\f\u0006\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u001f\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e"+
		"\u0005\u0001\u0000\u0000\u0000\u001f \u0003\b\u0004\u0000 \u0007\u0001"+
		"\u0000\u0000\u0000!.\u0005 \u0000\u0000\".\u0005!\u0000\u0000#.\u0005"+
		"$\u0000\u0000$.\u0005\u001f\u0000\u0000%\'\u0005\"\u0000\u0000&(\u0003"+
		"\b\u0004\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0005#\u0000\u0000,.\u0001\u0000\u0000\u0000-!\u0001\u0000\u0000"+
		"\u0000-\"\u0001\u0000\u0000\u0000-#\u0001\u0000\u0000\u0000-$\u0001\u0000"+
		"\u0000\u0000-%\u0001\u0000\u0000\u0000.\t\u0001\u0000\u0000\u0000/0\u0005"+
		"\"\u0000\u000001\u0005\t\u0000\u000012\u0005\u001f\u0000\u000023\u0003"+
		"\b\u0004\u000034\u0005#\u0000\u00004\u000b\u0001\u0000\u0000\u000056\u0005"+
		"\"\u0000\u000067\u0005\b\u0000\u000079\u0005\u001f\u0000\u00008:\u0003"+
		"\b\u0004\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0005#\u0000\u0000<\r\u0001\u0000\u0000\u0000\u0005"+
		"\u0011\u0019)-9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}