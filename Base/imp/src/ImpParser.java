// Generated from D:/Google Drive/SCUOLA/Università/Linguaggi/Progetto Linguaggi/Base/imp/src\Imp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POW=8, AND=9, OR=10, 
		EQQ=11, NEQ=12, LEQ=13, GEQ=14, LT=15, GT=16, NOT=17, IF=18, THEN=19, 
		ELSE=20, ELSEIF=21, WHILE=22, SKIPP=23, ASSIGN=24, OUT=25, FOR=26, DO=27, 
		ND=28, LPAR=29, RPAR=30, LBRACE=31, RBRACE=32, SEMICOLON=33, COMMA=34, 
		ID=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_assignment = 1, RULE_ifThen = 2, RULE_ifBase = 3, 
		RULE_elseIf = 4, RULE_elsee = 5, RULE_com = 6, RULE_exp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "assignment", "ifThen", "ifBase", "elseIf", "elsee", "com", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'elseif'", "'while'", "'skip'", "'='", "'out'", "'for'", "'do'", 
			"'nd'", "'('", "')'", "'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"ELSEIF", "WHILE", "SKIPP", "ASSIGN", "OUT", "FOR", "DO", "ND", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "SEMICOLON", "COMMA", "ID", "WS"
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
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			com(0);
			setState(17);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ID);
			setState(20);
			match(ASSIGN);
			setState(21);
			exp(0);
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

	public static class IfThenContext extends ParserRuleContext {
		public IfThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThen; }
	 
		public IfThenContext() { }
		public void copyFrom(IfThenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfThenStatementContext extends IfThenContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ImpParser.THEN, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public IfThenStatementContext(IfThenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifThen);
		try {
			_localctx = new IfThenStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(IF);
			setState(24);
			match(LPAR);
			setState(25);
			exp(0);
			setState(26);
			match(RPAR);
			setState(27);
			match(THEN);
			setState(28);
			match(LBRACE);
			setState(29);
			com(0);
			setState(30);
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

	public static class IfBaseContext extends ParserRuleContext {
		public IfBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBase; }
	 
		public IfBaseContext() { }
		public void copyFrom(IfBaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfThenStatementPlusElseStatementContext extends IfBaseContext {
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public IfThenStatementPlusElseStatementContext(IfBaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIfThenStatementPlusElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenStatementPlusElseIfStatementContext extends IfBaseContext {
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public IfThenStatementPlusElseIfStatementContext(IfBaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIfThenStatementPlusElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenStatementRecallContext extends IfBaseContext {
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public IfThenStatementRecallContext(IfBaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIfThenStatementRecall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBaseContext ifBase() throws RecognitionException {
		IfBaseContext _localctx = new IfBaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBase);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new IfThenStatementRecallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				ifThen();
				}
				break;
			case 2:
				_localctx = new IfThenStatementPlusElseIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				ifThen();
				setState(34);
				elseIf();
				}
				break;
			case 3:
				_localctx = new IfThenStatementPlusElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				ifThen();
				setState(37);
				elsee();
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

	public static class ElseIfContext extends ParserRuleContext {
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	 
		public ElseIfContext() { }
		public void copyFrom(ElseIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementContext extends ElseIfContext {
		public TerminalNode ELSEIF() { return getToken(ImpParser.ELSEIF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public ElseIfStatementContext(ElseIfContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseIf);
		try {
			_localctx = new ElseIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ELSEIF);
			setState(42);
			match(LPAR);
			setState(43);
			exp(0);
			setState(44);
			match(RPAR);
			setState(45);
			match(LBRACE);
			setState(46);
			com(0);
			setState(47);
			match(RBRACE);
			setState(48);
			elsee();
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

	public static class ElseeContext extends ParserRuleContext {
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
	 
		public ElseeContext() { }
		public void copyFrom(ElseeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStatementContext extends ElseeContext {
		public EmptyStatementContext(ElseeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseStatementContext extends ElseeContext {
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ElseStatementContext(ElseeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseIfStatementRecallContext extends ElseeContext {
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public ElseIfStatementRecallContext(ElseeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitElseIfStatementRecall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsee);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ElseIfStatementRecallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				elseIf();
				}
				break;
			case 2:
				_localctx = new ElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ELSE);
				setState(52);
				match(LBRACE);
				setState(53);
				com(0);
				setState(54);
				match(RBRACE);
				}
				break;
			case 3:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfComContext extends ComContext {
		public IfBaseContext ifBase() {
			return getRuleContext(IfBaseContext.class,0);
		}
		public IfComContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIfCom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends ComContext {
		public TerminalNode DO() { return getToken(ImpParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public DoWhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NdContext extends ComContext {
		public TerminalNode ND() { return getToken(ImpParser.ND, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ImpParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public NdContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ComContext {
		public TerminalNode FOR() { return getToken(ImpParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ImpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ImpParser.SEMICOLON, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ForContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(ImpParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(ImpParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignComContext extends ComContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignComContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssignCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				_localctx = new IfComContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				ifBase();
				}
				break;
			case SKIPP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(SKIPP);
				}
				break;
			case WHILE:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(WHILE);
				setState(63);
				match(LPAR);
				setState(64);
				exp(0);
				setState(65);
				match(RPAR);
				setState(66);
				match(LBRACE);
				setState(67);
				com(0);
				setState(68);
				match(RBRACE);
				}
				break;
			case OUT:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(OUT);
				setState(71);
				match(LPAR);
				setState(72);
				exp(0);
				setState(73);
				match(RPAR);
				}
				break;
			case FOR:
				{
				_localctx = new ForContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(FOR);
				setState(76);
				match(LPAR);
				setState(77);
				assignment();
				setState(78);
				match(SEMICOLON);
				setState(79);
				exp(0);
				setState(80);
				match(SEMICOLON);
				setState(81);
				com(0);
				setState(82);
				match(RPAR);
				setState(83);
				match(LBRACE);
				setState(84);
				com(0);
				setState(85);
				match(RBRACE);
				}
				break;
			case ID:
				{
				_localctx = new AssignComContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				assignment();
				}
				break;
			case DO:
				{
				_localctx = new DoWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(DO);
				setState(89);
				match(LBRACE);
				setState(90);
				com(0);
				setState(91);
				match(RBRACE);
				setState(92);
				match(WHILE);
				setState(93);
				match(LPAR);
				setState(94);
				exp(0);
				setState(95);
				match(RPAR);
				}
				break;
			case ND:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(ND);
				setState(98);
				match(LPAR);
				setState(99);
				com(0);
				setState(100);
				match(COMMA);
				setState(101);
				com(0);
				setState(102);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(106);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(107);
					match(SEMICOLON);
					setState(108);
					com(8);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ImpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImpParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(NAT);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(BOOL);
				}
				break;
			case LPAR:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(LPAR);
				setState(118);
				exp(0);
				setState(119);
				match(RPAR);
				}
				break;
			case NOT:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(NOT);
				setState(122);
				exp(7);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						match(POW);
						setState(128);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << GEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return com_sempred((ComContext)_localctx, predIndex);
		case 7:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7<\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b"+
		"\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\177\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\t\2\4\16\20\n"+
		"\2\4\6\b\n\f\16\20\2\7\3\2\7\t\3\2\5\6\3\2\17\22\3\2\r\16\3\2\13\f\2\u00a5"+
		"\2\22\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b)\3\2\2\2\n+\3\2\2\2\f;\3\2\2"+
		"\2\16j\3\2\2\2\20~\3\2\2\2\22\23\5\16\b\2\23\24\7\2\2\3\24\3\3\2\2\2\25"+
		"\26\7%\2\2\26\27\7\32\2\2\27\30\5\20\t\2\30\5\3\2\2\2\31\32\7\24\2\2\32"+
		"\33\7\37\2\2\33\34\5\20\t\2\34\35\7 \2\2\35\36\7\25\2\2\36\37\7!\2\2\37"+
		" \5\16\b\2 !\7\"\2\2!\7\3\2\2\2\"*\5\6\4\2#$\5\6\4\2$%\5\n\6\2%*\3\2\2"+
		"\2&\'\5\6\4\2\'(\5\f\7\2(*\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)&\3\2\2\2*\t\3"+
		"\2\2\2+,\7\27\2\2,-\7\37\2\2-.\5\20\t\2./\7 \2\2/\60\7!\2\2\60\61\5\16"+
		"\b\2\61\62\7\"\2\2\62\63\5\f\7\2\63\13\3\2\2\2\64<\5\n\6\2\65\66\7\26"+
		"\2\2\66\67\7!\2\2\678\5\16\b\289\7\"\2\29<\3\2\2\2:<\3\2\2\2;\64\3\2\2"+
		"\2;\65\3\2\2\2;:\3\2\2\2<\r\3\2\2\2=>\b\b\1\2>k\5\b\5\2?k\7\31\2\2@A\7"+
		"\30\2\2AB\7\37\2\2BC\5\20\t\2CD\7 \2\2DE\7!\2\2EF\5\16\b\2FG\7\"\2\2G"+
		"k\3\2\2\2HI\7\33\2\2IJ\7\37\2\2JK\5\20\t\2KL\7 \2\2Lk\3\2\2\2MN\7\34\2"+
		"\2NO\7\37\2\2OP\5\4\3\2PQ\7#\2\2QR\5\20\t\2RS\7#\2\2ST\5\16\b\2TU\7 \2"+
		"\2UV\7!\2\2VW\5\16\b\2WX\7\"\2\2Xk\3\2\2\2Yk\5\4\3\2Z[\7\35\2\2[\\\7!"+
		"\2\2\\]\5\16\b\2]^\7\"\2\2^_\7\30\2\2_`\7\37\2\2`a\5\20\t\2ab\7 \2\2b"+
		"k\3\2\2\2cd\7\36\2\2de\7\37\2\2ef\5\16\b\2fg\7$\2\2gh\5\16\b\2hi\7 \2"+
		"\2ik\3\2\2\2j=\3\2\2\2j?\3\2\2\2j@\3\2\2\2jH\3\2\2\2jM\3\2\2\2jY\3\2\2"+
		"\2jZ\3\2\2\2jc\3\2\2\2kq\3\2\2\2lm\f\t\2\2mn\7#\2\2np\5\16\b\nol\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\b\t\1\2u\177"+
		"\7\3\2\2v\177\7\4\2\2wx\7\37\2\2xy\5\20\t\2yz\7 \2\2z\177\3\2\2\2{|\7"+
		"\23\2\2|\177\5\20\t\t}\177\7%\2\2~t\3\2\2\2~v\3\2\2\2~w\3\2\2\2~{\3\2"+
		"\2\2~}\3\2\2\2\177\u0094\3\2\2\2\u0080\u0081\f\n\2\2\u0081\u0082\7\n\2"+
		"\2\u0082\u0093\5\20\t\n\u0083\u0084\f\b\2\2\u0084\u0085\t\2\2\2\u0085"+
		"\u0093\5\20\t\t\u0086\u0087\f\7\2\2\u0087\u0088\t\3\2\2\u0088\u0093\5"+
		"\20\t\b\u0089\u008a\f\6\2\2\u008a\u008b\t\4\2\2\u008b\u0093\5\20\t\7\u008c"+
		"\u008d\f\5\2\2\u008d\u008e\t\5\2\2\u008e\u0093\5\20\t\6\u008f\u0090\f"+
		"\4\2\2\u0090\u0091\t\6\2\2\u0091\u0093\5\20\t\5\u0092\u0080\3\2\2\2\u0092"+
		"\u0083\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008c\3\2"+
		"\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\t);jq~\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}