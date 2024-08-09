// Generated from C:/Users/pars system/Downloads/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, END=2, MAIN=3, RETURN=4, IF=5, ELSE=6, ELSEIF=7, TRUE=8, FALSE=9, 
		CHOP=10, CHOMP=11, PUSH=12, PUTS=13, METHOD=14, LEN=15, PATTERN=16, MATCH=17, 
		NEXT=18, BREAK=19, LOOP=20, DO=21, FOR=22, IN=23, COLON=24, SEMICOLON=25, 
		QUOTE=26, O_PAR=27, C_PAR=28, O_CUR=29, C_CUR=30, O_BRK=31, C_BRK=32, 
		LAMBDA=33, COMMA=34, DOT=35, DEC=36, INC=37, GTE=38, LT=39, LTE=40, AND=41, 
		EQ=42, EQ_NEG=43, OR=44, INDENT=45, INDENT2=46, APPEND=47, EQU_SUM=48, 
		EQU_SUB=49, EQU_MUL=50, EQU_DIV=51, EQU_REMAIN=52, EQU=53, SUM=54, SUB=55, 
		MUL=56, DIV=57, REMAIN=58, GT=59, NOT=60, IDENTIFIER=61, INT_VAL=62, FLOAT_VAL=63, 
		STRING_VAL=64, COMMENT=65, MULTI_COMMENT=66, WS=67;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_main = 2, RULE_lambda_function = 3, 
		RULE_body_function = 4, RULE_params = 5, RULE_dflt_params = 6, RULE_method = 7, 
		RULE_call_function = 8, RULE_call_params = 9, RULE_return_statement = 10, 
		RULE_bool_val = 11, RULE_list_val = 12, RULE_valList = 13, RULE_nestedList = 14, 
		RULE_index = 15, RULE_built_in = 16, RULE_equ = 17, RULE_assign = 18, 
		RULE_puts = 19, RULE_push = 20, RULE_len = 21, RULE_chop = 22, RULE_chomp = 23, 
		RULE_condition_statement = 24, RULE_condition_expression = 25, RULE_break_next = 26, 
		RULE_loop_statement = 27, RULE_types = 28, RULE_pattern = 29, RULE_options = 30, 
		RULE_pattern_call = 31, RULE_statement = 32, RULE_expression = 33, RULE_shift = 34, 
		RULE_logical_or = 35, RULE_logical_and = 36, RULE_equality = 37, RULE_relational = 38, 
		RULE_additive = 39, RULE_multiplicative = 40, RULE_unary = 41, RULE_primary = 42, 
		RULE_primary2 = 43, RULE_indexed = 44, RULE_factor = 45, RULE_c_expr = 46, 
		RULE_c_assignment = 47, RULE_c_shift = 48, RULE_c_equality = 49, RULE_c_relational = 50, 
		RULE_c_additive = 51, RULE_c_multiplicative = 52, RULE_c_unary = 53, RULE_c_primary = 54, 
		RULE_c_primary2 = 55, RULE_c_indexed = 56, RULE_c_factor = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "main", "lambda_function", "body_function", "params", 
			"dflt_params", "method", "call_function", "call_params", "return_statement", 
			"bool_val", "list_val", "valList", "nestedList", "index", "built_in", 
			"equ", "assign", "puts", "push", "len", "chop", "chomp", "condition_statement", 
			"condition_expression", "break_next", "loop_statement", "types", "pattern", 
			"options", "pattern_call", "statement", "expression", "shift", "logical_or", 
			"logical_and", "equality", "relational", "additive", "multiplicative", 
			"unary", "primary", "primary2", "indexed", "factor", "c_expr", "c_assignment", 
			"c_shift", "c_equality", "c_relational", "c_additive", "c_multiplicative", 
			"c_unary", "c_primary", "c_primary2", "c_indexed", "c_factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'end'", "'main'", "'return'", "'if'", "'else'", "'elseif'", 
			"'true'", "'false'", "'chop'", "'chomp'", "'push'", "'puts'", "'method'", 
			"'len'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", "'do'", 
			"'for'", "'in'", "':'", "';'", "'\"'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'->'", "','", "'.'", "'--'", "'++'", "'>='", "'<'", "'<='", "'&&'", 
			"'=='", "'!='", "'||'", "'\\n    |'", "'\\n\\t|'", "'<<'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "END", "MAIN", "RETURN", "IF", "ELSE", "ELSEIF", "TRUE", 
			"FALSE", "CHOP", "CHOMP", "PUSH", "PUTS", "METHOD", "LEN", "PATTERN", 
			"MATCH", "NEXT", "BREAK", "LOOP", "DO", "FOR", "IN", "COLON", "SEMICOLON", 
			"QUOTE", "O_PAR", "C_PAR", "O_CUR", "C_CUR", "O_BRK", "C_BRK", "LAMBDA", 
			"COMMA", "DOT", "DEC", "INC", "GTE", "LT", "LTE", "AND", "EQ", "EQ_NEG", 
			"OR", "INDENT", "INDENT2", "APPEND", "EQU_SUM", "EQU_SUB", "EQU_MUL", 
			"EQU_DIV", "EQU_REMAIN", "EQU", "SUM", "SUB", "MUL", "DIV", "REMAIN", 
			"GT", "NOT", "IDENTIFIER", "INT_VAL", "FLOAT_VAL", "STRING_VAL", "COMMENT", 
			"MULTI_COMMENT", "WS"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(FunctionCraftParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(FunctionCraftParser.COMMENT, i);
		}
		public List<TerminalNode> MULTI_COMMENT() { return getTokens(FunctionCraftParser.MULTI_COMMENT); }
		public TerminalNode MULTI_COMMENT(int i) {
			return getToken(FunctionCraftParser.MULTI_COMMENT, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(120);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(116);
						match(COMMENT);
						}
						break;
					case MULTI_COMMENT:
						{
						setState(117);
						match(MULTI_COMMENT);
						}
						break;
					case DEF:
						{
						setState(118);
						function();
						}
						break;
					case PATTERN:
						{
						setState(119);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(125);
			main();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==MULTI_COMMENT) {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==COMMENT || _la==MULTI_COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DEF);
			setState(133);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null));
			setState(135);
			match(O_PAR);
			setState(136);
			params();
			setState(137);
			match(C_PAR);
			setState(138);
			body_function();
			setState(139);
			match(END);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Body_functionContext body_function() {
			return getRuleContext(Body_functionContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(DEF);
			setState(142);
			match(MAIN);
			System.out.println("MAIN"); 
			setState(144);
			match(O_PAR);
			setState(145);
			match(C_PAR);
			setState(146);
			body_function();
			setState(147);
			match(END);
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
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FunctionCraftParser.LAMBDA, 0); }
		public List<TerminalNode> O_PAR() { return getTokens(FunctionCraftParser.O_PAR); }
		public TerminalNode O_PAR(int i) {
			return getToken(FunctionCraftParser.O_PAR, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> C_PAR() { return getTokens(FunctionCraftParser.C_PAR); }
		public TerminalNode C_PAR(int i) {
			return getToken(FunctionCraftParser.C_PAR, i);
		}
		public TerminalNode O_CUR() { return getToken(FunctionCraftParser.O_CUR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode C_CUR() { return getToken(FunctionCraftParser.C_CUR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LAMBDA);
			System.out.println("Structure: LAMBDA");
			setState(151);
			match(O_PAR);
			setState(152);
			params();
			setState(153);
			match(C_PAR);
			setState(154);
			match(O_CUR);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				{
				setState(155);
				match(RETURN);
				System.out.println("RETURN");
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(157);
					match(O_PAR);
					setState(158);
					expression();
					setState(159);
					match(C_PAR);
					}
					}
					break;
				case 2:
					{
					{
					setState(161);
					expression();
					}
					}
					break;
				}
				}
				}
				break;
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case O_PAR:
			case O_BRK:
			case LAMBDA:
			case SUB:
			case NOT:
			case IDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
				{
				{
				setState(164);
				expression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
			match(SEMICOLON);
			setState(168);
			match(C_CUR);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(169);
				match(O_PAR);
				setState(170);
				call_params();
				setState(171);
				match(C_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Body_functionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Body_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_functionContext body_function() throws RecognitionException {
		Body_functionContext _localctx = new Body_functionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834629625L) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(181);
				return_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode O_BRK() { return getToken(FunctionCraftParser.O_BRK, 0); }
		public Dflt_paramsContext dflt_params() {
			return getRuleContext(Dflt_paramsContext.class,0);
		}
		public TerminalNode C_BRK() { return getToken(FunctionCraftParser.C_BRK, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(184);
				match(IDENTIFIER);
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						match(COMMA);
						setState(186);
						match(IDENTIFIER);
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				setState(195);
				match(O_BRK);
				setState(196);
				dflt_params();
				setState(197);
				match(C_BRK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dflt_paramsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQU() { return getTokens(FunctionCraftParser.EQU); }
		public TerminalNode EQU(int i) {
			return getToken(FunctionCraftParser.EQU, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dflt_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dflt_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDflt_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDflt_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDflt_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dflt_paramsContext dflt_params() throws RecognitionException {
		Dflt_paramsContext _localctx = new Dflt_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dflt_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			match(IDENTIFIER);
			setState(202);
			match(EQU);
			{
			setState(203);
			expression();
			}
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(EQU);
				{
				setState(208);
				expression();
				}
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(METHOD);
			setState(215);
			match(O_PAR);
			setState(216);
			match(COLON);
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(C_PAR);
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
	public static class Call_functionContext extends ParserRuleContext {
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(220);
				match(IDENTIFIER);
				System.out.println("Function Call");
				setState(222);
				match(O_PAR);
				setState(223);
				call_params();
				setState(224);
				match(C_PAR);
				}
				}
				break;
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
				{
				setState(226);
				built_in();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_paramsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCall_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCall_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCall_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 139752325979308223L) != 0)) {
				{
				{
				setState(229);
				expression();
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230);
					match(COMMA);
					{
					setState(231);
					expression();
					}
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(RETURN);
			System.out.println("RETURN");
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(241);
				match(O_PAR);
				setState(242);
				expression();
				setState(243);
				match(C_PAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(245);
				expression();
				}
				}
				break;
			}
			setState(248);
			match(SEMICOLON);
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
	public static class Bool_valContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBool_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBool_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_valContext extends ParserRuleContext {
		public TerminalNode O_BRK() { return getToken(FunctionCraftParser.O_BRK, 0); }
		public TerminalNode C_BRK() { return getToken(FunctionCraftParser.C_BRK, 0); }
		public ValListContext valList() {
			return getRuleContext(ValListContext.class,0);
		}
		public NestedListContext nestedList() {
			return getRuleContext(NestedListContext.class,0);
		}
		public List_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valContext list_val() throws RecognitionException {
		List_valContext _localctx = new List_valContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(O_BRK);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(253);
				valList();
				}
				break;
			case 2:
				{
				setState(254);
				nestedList();
				}
				break;
			}
			setState(257);
			match(C_BRK);
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
	public static class ValListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NestedListContext> nestedList() {
			return getRuleContexts(NestedListContext.class);
		}
		public NestedListContext nestedList(int i) {
			return getRuleContext(NestedListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ValListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValListContext valList() throws RecognitionException {
		ValListContext _localctx = new ValListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(259);
				expression();
				}
				break;
			case 2:
				{
				setState(260);
				nestedList();
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(264);
					expression();
					}
					break;
				case 2:
					{
					setState(265);
					nestedList();
					}
					break;
				}
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedListContext extends ParserRuleContext {
		public List<List_valContext> list_val() {
			return getRuleContexts(List_valContext.class);
		}
		public List_valContext list_val(int i) {
			return getRuleContext(List_valContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public NestedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNestedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNestedList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNestedList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedListContext nestedList() throws RecognitionException {
		NestedListContext _localctx = new NestedListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nestedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			list_val();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					list_val();
					}
					} 
				}
				setState(280);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public List<TerminalNode> O_BRK() { return getTokens(FunctionCraftParser.O_BRK); }
		public TerminalNode O_BRK(int i) {
			return getToken(FunctionCraftParser.O_BRK, i);
		}
		public List<TerminalNode> C_BRK() { return getTokens(FunctionCraftParser.C_BRK); }
		public TerminalNode C_BRK(int i) {
			return getToken(FunctionCraftParser.C_BRK, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(281);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(282);
				call_function();
				}
				break;
			case 3:
				{
				setState(283);
				built_in();
				}
				break;
			}
			setState(286);
			match(O_BRK);
			{
			setState(287);
			expression();
			}
			setState(288);
			match(C_BRK);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(O_BRK);
					{
					setState(290);
					expression();
					}
					setState(291);
					match(C_BRK);
					}
					} 
				}
				setState(297);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Built_inContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public Built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuilt_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuilt_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuilt_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_inContext built_in() throws RecognitionException {
		Built_inContext _localctx = new Built_inContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_built_in);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				puts();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				push();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				len();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				chop();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				chomp();
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
	public static class EquContext extends ParserRuleContext {
		public TerminalNode EQU() { return getToken(FunctionCraftParser.EQU, 0); }
		public TerminalNode EQU_REMAIN() { return getToken(FunctionCraftParser.EQU_REMAIN, 0); }
		public TerminalNode EQU_DIV() { return getToken(FunctionCraftParser.EQU_DIV, 0); }
		public TerminalNode EQU_MUL() { return getToken(FunctionCraftParser.EQU_MUL, 0); }
		public TerminalNode EQU_SUB() { return getToken(FunctionCraftParser.EQU_SUB, 0); }
		public TerminalNode EQU_SUM() { return getToken(FunctionCraftParser.EQU_SUM, 0); }
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEqu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEqu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token name;
		public EquContext equ() {
			return getRuleContext(EquContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(307);
				((AssignContext)_localctx).name = match(IDENTIFIER);
				setState(308);
				equ();
				{
				setState(309);
				expression();
				}
				System.out.println("Assignment: " + (((AssignContext)_localctx).name!=null?((AssignContext)_localctx).name.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(312);
				((AssignContext)_localctx).name = match(IDENTIFIER);
				setState(313);
				equ();
				setState(314);
				method();
				System.out.println("Assignment: " + (((AssignContext)_localctx).name!=null?((AssignContext)_localctx).name.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(PUTS);
			System.out.println("Built-In: PUTS");
			setState(321);
			match(O_PAR);
			{
			setState(322);
			expression();
			}
			setState(323);
			match(C_PAR);
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
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PUSH);
			System.out.println("Built-In: PUSH");
			setState(327);
			match(O_PAR);
			{
			setState(328);
			expression();
			}
			setState(329);
			match(COMMA);
			{
			setState(330);
			expression();
			}
			setState(331);
			match(C_PAR);
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
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LEN);
			System.out.println("Built-In: LEN");
			setState(335);
			match(O_PAR);
			{
			setState(336);
			expression();
			}
			setState(337);
			match(C_PAR);
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
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(CHOP);
			System.out.println("Built-In: CHOP");
			setState(341);
			match(O_PAR);
			{
			setState(342);
			expression();
			}
			setState(343);
			match(C_PAR);
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
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(CHOMP);
			System.out.println("Built-In: CHOMP");
			setState(347);
			match(O_PAR);
			{
			setState(348);
			expression();
			}
			setState(349);
			match(C_PAR);
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
	public static class Condition_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public List<Condition_expressionContext> condition_expression() {
			return getRuleContexts(Condition_expressionContext.class);
		}
		public Condition_expressionContext condition_expression(int i) {
			return getRuleContext(Condition_expressionContext.class,i);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(351);
			match(IF);
			System.out.println("Decision: IF");
			setState(353);
			match(O_PAR);
			setState(354);
			condition_expression();
			setState(355);
			match(C_PAR);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834629625L) != 0)) {
				{
				{
				setState(356);
				statement();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(362);
				match(ELSEIF);
				System.out.println("Decision: ELSE IF");
				setState(364);
				condition_expression();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834629625L) != 0)) {
					{
					{
					setState(365);
					statement();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(376);
				match(ELSE);
				System.out.println("Decision: ELSE");
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834629625L) != 0)) {
					{
					{
					setState(378);
					statement();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(386);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_expressionContext extends ParserRuleContext {
		public List<TerminalNode> O_PAR() { return getTokens(FunctionCraftParser.O_PAR); }
		public TerminalNode O_PAR(int i) {
			return getToken(FunctionCraftParser.O_PAR, i);
		}
		public List<Condition_expressionContext> condition_expression() {
			return getRuleContexts(Condition_expressionContext.class);
		}
		public Condition_expressionContext condition_expression(int i) {
			return getRuleContext(Condition_expressionContext.class,i);
		}
		public List<TerminalNode> C_PAR() { return getTokens(FunctionCraftParser.C_PAR); }
		public TerminalNode C_PAR(int i) {
			return getToken(FunctionCraftParser.C_PAR, i);
		}
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public C_exprContext c_expr() {
			return getRuleContext(C_exprContext.class,0);
		}
		public Condition_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_expressionContext condition_expression() throws RecognitionException {
		Condition_expressionContext _localctx = new Condition_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition_expression);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388);
				match(O_PAR);
				setState(389);
				condition_expression();
				setState(390);
				match(C_PAR);
				setState(391);
				match(AND);
				setState(392);
				match(O_PAR);
				setState(393);
				condition_expression();
				setState(394);
				match(C_PAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(396);
				match(O_PAR);
				setState(397);
				condition_expression();
				setState(398);
				match(C_PAR);
				setState(399);
				match(OR);
				setState(400);
				match(O_PAR);
				setState(401);
				condition_expression();
				setState(402);
				match(C_PAR);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(404);
				match(O_PAR);
				setState(405);
				condition_expression();
				setState(406);
				match(C_PAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(408);
				c_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_nextContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public Break_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_nextContext break_next() throws RecognitionException {
		Break_nextContext _localctx = new Break_nextContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_break_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(411);
				match(BREAK);
				System.out.println("Control: BREAK");
				setState(413);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(414);
				match(BREAK);
				setState(415);
				match(IF);
				System.out.println("Control: BREAK");
				setState(417);
				expression();
				setState(418);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				{
				{
				setState(420);
				match(NEXT);
				System.out.println("Control: NEXT");
				setState(422);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				{
				{
				setState(423);
				match(NEXT);
				setState(424);
				match(IF);
				System.out.println("Control: NEXT");
				setState(426);
				expression();
				setState(427);
				match(SEMICOLON);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Break_nextContext> break_next() {
			return getRuleContexts(Break_nextContext.class);
		}
		public Break_nextContext break_next(int i) {
			return getRuleContext(Break_nextContext.class,i);
		}
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				{
				{
				setState(431);
				match(LOOP);
				setState(432);
				match(DO);
				System.out.println("Loop: DO");
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834654201L) != 0)) {
					{
					setState(436);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case TRUE:
					case FALSE:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case LEN:
					case LOOP:
					case FOR:
					case O_PAR:
					case O_BRK:
					case LAMBDA:
					case SUB:
					case NOT:
					case IDENTIFIER:
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
						{
						setState(434);
						statement();
						}
						break;
					case NEXT:
					case BREAK:
						{
						setState(435);
						break_next();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				match(END);
				}
				}
				break;
			case FOR:
				{
				{
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					{
					setState(442);
					match(FOR);
					System.out.println("Loop: FOR");
					setState(444);
					match(IDENTIFIER);
					setState(445);
					match(IN);
					{
					setState(446);
					expression();
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(447);
					match(FOR);
					System.out.println("Loop: FOR");
					setState(449);
					match(IDENTIFIER);
					setState(450);
					match(IN);
					setState(451);
					match(O_PAR);
					setState(452);
					expression();
					setState(453);
					match(DOT);
					setState(454);
					match(DOT);
					setState(455);
					expression();
					setState(456);
					match(C_PAR);
					}
					}
					break;
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1118018607834654201L) != 0)) {
					{
					setState(462);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case TRUE:
					case FALSE:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case LEN:
					case LOOP:
					case FOR:
					case O_PAR:
					case O_BRK:
					case LAMBDA:
					case SUB:
					case NOT:
					case IDENTIFIER:
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
						{
						setState(460);
						statement();
						}
						break;
					case NEXT:
					case BREAK:
						{
						setState(461);
						break_next();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				match(END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode SUB() { return getToken(FunctionCraftParser.SUB, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_types);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(471);
					match(SUB);
					}
				}

				setState(474);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(475);
					match(SUB);
					}
				}

				setState(478);
				match(FLOAT_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(STRING_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				bool_val();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				list_val();
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
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<OptionsContext> options() {
			return getRuleContexts(OptionsContext.class);
		}
		public OptionsContext options(int i) {
			return getRuleContext(OptionsContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(PATTERN);
			setState(485);
			((PatternContext)_localctx).name = match(IDENTIFIER);
			System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null));
			setState(487);
			match(O_PAR);
			setState(488);
			params();
			setState(489);
			match(C_PAR);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT || _la==INDENT2) {
				{
				{
				setState(490);
				options();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(SEMICOLON);
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
	public static class OptionsContext extends ParserRuleContext {
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public TerminalNode EQU() { return getToken(FunctionCraftParser.EQU, 0); }
		public TerminalNode INDENT() { return getToken(FunctionCraftParser.INDENT, 0); }
		public TerminalNode INDENT2() { return getToken(FunctionCraftParser.INDENT2, 0); }
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==INDENT || _la==INDENT2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(499);
			match(O_PAR);
			setState(500);
			expression();
			setState(501);
			match(C_PAR);
			setState(502);
			match(EQU);
			setState(503);
			expression();
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
	public static class Pattern_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public Pattern_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_callContext pattern_call() throws RecognitionException {
		Pattern_callContext _localctx = new Pattern_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pattern_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(IDENTIFIER);
			setState(506);
			match(DOT);
			setState(507);
			match(MATCH);
			System.out.println("Built-In: MATCH");
			setState(509);
			match(O_PAR);
			setState(510);
			call_params();
			setState(511);
			match(C_PAR);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				{
				setState(513);
				match(O_PAR);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(514);
					expression();
					}
					break;
				case 2:
					{
					setState(515);
					assign();
					}
					break;
				}
				setState(518);
				match(C_PAR);
				setState(519);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				{
				{
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(521);
					expression();
					}
					break;
				case 2:
					{
					setState(522);
					assign();
					}
					break;
				}
				setState(525);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				{
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(527);
					condition_statement();
					}
					break;
				case LOOP:
				case FOR:
					{
					setState(528);
					loop_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ShiftContext shift() {
			return getRuleContext(ShiftContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			shift();
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
	public static class ShiftContext extends ParserRuleContext {
		public List<Logical_orContext> logical_or() {
			return getRuleContexts(Logical_orContext.class);
		}
		public Logical_orContext logical_or(int i) {
			return getRuleContext(Logical_orContext.class,i);
		}
		public List<TerminalNode> APPEND() { return getTokens(FunctionCraftParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(FunctionCraftParser.APPEND, i);
		}
		public ShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftContext shift() throws RecognitionException {
		ShiftContext _localctx = new ShiftContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			logical_or();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPEND) {
				{
				{
				setState(536);
				match(APPEND);
				setState(537);
				logical_or();
				System.out.println("Operator: <<");
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_orContext extends ParserRuleContext {
		public List<Logical_andContext> logical_and() {
			return getRuleContexts(Logical_andContext.class);
		}
		public Logical_andContext logical_and(int i) {
			return getRuleContext(Logical_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public Logical_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogical_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogical_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogical_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_orContext logical_or() throws RecognitionException {
		Logical_orContext _localctx = new Logical_orContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logical_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			logical_and();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(546);
				match(OR);
				setState(547);
				logical_and();
				System.out.println("Operator: ||");
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_andContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FunctionCraftParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FunctionCraftParser.AND, i);
		}
		public Logical_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogical_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogical_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogical_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_andContext logical_and() throws RecognitionException {
		Logical_andContext _localctx = new Logical_andContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logical_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			equality();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(556);
				match(AND);
				setState(557);
				equality();
				System.out.println("Operator: &&");
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(FunctionCraftParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(FunctionCraftParser.EQ, i);
		}
		public List<TerminalNode> EQ_NEG() { return getTokens(FunctionCraftParser.EQ_NEG); }
		public TerminalNode EQ_NEG(int i) {
			return getToken(FunctionCraftParser.EQ_NEG, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			relational();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==EQ_NEG) {
				{
				{
				setState(574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(566);
					match(EQ);
					setState(567);
					relational();
					System.out.println("Operator: ==");
					}
					break;
				case EQ_NEG:
					{
					setState(570);
					match(EQ_NEG);
					setState(571);
					relational();
					System.out.println("Operator: !=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ParserRuleContext {
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public List<TerminalNode> LTE() { return getTokens(FunctionCraftParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(FunctionCraftParser.LTE, i);
		}
		public List<TerminalNode> LT() { return getTokens(FunctionCraftParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(FunctionCraftParser.LT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(FunctionCraftParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(FunctionCraftParser.GTE, i);
		}
		public List<TerminalNode> GT() { return getTokens(FunctionCraftParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(FunctionCraftParser.GT, i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			additive();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576462676448772096L) != 0)) {
				{
				{
				setState(598);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LTE:
					{
					setState(582);
					match(LTE);
					setState(583);
					additive();
					System.out.println("Operator: <=");
					}
					break;
				case LT:
					{
					setState(586);
					match(LT);
					setState(587);
					additive();
					System.out.println("Operator: <");
					}
					break;
				case GTE:
					{
					setState(590);
					match(GTE);
					setState(591);
					additive();
					System.out.println("Operator: >=");
					}
					break;
				case GT:
					{
					setState(594);
					match(GT);
					setState(595);
					additive();
					System.out.println("Operator: >");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(FunctionCraftParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(FunctionCraftParser.SUM, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FunctionCraftParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FunctionCraftParser.SUB, i);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_additive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			multiplicative();
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUM:
						{
						setState(606);
						match(SUM);
						setState(607);
						multiplicative();
						System.out.println("Operator: +");
						}
						break;
					case SUB:
						{
						setState(610);
						match(SUB);
						setState(611);
						multiplicative();
						System.out.println("Operator: -");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(FunctionCraftParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(FunctionCraftParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(FunctionCraftParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FunctionCraftParser.DIV, i);
		}
		public List<TerminalNode> REMAIN() { return getTokens(FunctionCraftParser.REMAIN); }
		public TerminalNode REMAIN(int i) {
			return getToken(FunctionCraftParser.REMAIN, i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			unary();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) {
				{
				{
				setState(634);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(622);
					match(MUL);
					setState(623);
					unary();
					System.out.println("Operator: *");
					}
					break;
				case DIV:
					{
					setState(626);
					match(DIV);
					setState(627);
					unary();
					System.out.println("Operator: /");
					}
					break;
				case REMAIN:
					{
					setState(630);
					match(REMAIN);
					setState(631);
					unary();
					System.out.println("Operator: %");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(FunctionCraftParser.SUB, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(641);
				match(NOT);
				System.out.println("Operator: !");
				}
				break;
			case 2:
				{
				setState(643);
				match(SUB);
				System.out.println("Operator: -");
				}
				break;
			}
			setState(647);
			primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public Primary2Context primary2() {
			return getRuleContext(Primary2Context.class,0);
		}
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			primary2();
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(650);
				match(INC);
				System.out.println("Operator: ++");
				}
				break;
			case DEC:
				{
				setState(652);
				match(DEC);
				System.out.println("Operator: --");
				}
				break;
			case END:
			case IF:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case NEXT:
			case BREAK:
			case LOOP:
			case FOR:
			case SEMICOLON:
			case O_PAR:
			case C_PAR:
			case O_BRK:
			case C_BRK:
			case LAMBDA:
			case COMMA:
			case DOT:
			case GTE:
			case LT:
			case LTE:
			case AND:
			case EQ:
			case EQ_NEG:
			case OR:
			case INDENT:
			case INDENT2:
			case APPEND:
			case SUM:
			case SUB:
			case MUL:
			case DIV:
			case REMAIN:
			case GT:
			case NOT:
			case IDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
				break;
			default:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Primary2Context extends ParserRuleContext {
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public IndexedContext indexed() {
			return getRuleContext(IndexedContext.class,0);
		}
		public Primary2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimary2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary2Context primary2() throws RecognitionException {
		Primary2Context _localctx = new Primary2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_primary2);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(O_PAR);
				setState(657);
				expression();
				setState(658);
				match(C_PAR);
				}
				break;
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case O_BRK:
			case LAMBDA:
			case SUB:
			case IDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				indexed();
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
	public static class IndexedContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> O_BRK() { return getTokens(FunctionCraftParser.O_BRK); }
		public TerminalNode O_BRK(int i) {
			return getToken(FunctionCraftParser.O_BRK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> C_BRK() { return getTokens(FunctionCraftParser.C_BRK); }
		public TerminalNode C_BRK(int i) {
			return getToken(FunctionCraftParser.C_BRK, i);
		}
		public IndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIndexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIndexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedContext indexed() throws RecognitionException {
		IndexedContext _localctx = new IndexedContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			factor();
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					match(O_BRK);
					setState(665);
					expression();
					setState(666);
					match(C_BRK);
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Pattern_callContext pattern_call() {
			return getRuleContext(Pattern_callContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(673);
				call_function();
				}
				break;
			case 2:
				{
				setState(674);
				built_in();
				}
				break;
			case 3:
				{
				setState(675);
				types();
				}
				break;
			case 4:
				{
				setState(676);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(677);
				pattern_call();
				}
				break;
			case 6:
				{
				setState(678);
				lambda_function();
				}
				break;
			case 7:
				{
				setState(679);
				index();
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_exprContext extends ParserRuleContext {
		public C_assignmentContext c_assignment() {
			return getRuleContext(C_assignmentContext.class,0);
		}
		public C_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_exprContext c_expr() throws RecognitionException {
		C_exprContext _localctx = new C_exprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_c_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			c_assignment();
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
	public static class C_assignmentContext extends ParserRuleContext {
		public List<C_shiftContext> c_shift() {
			return getRuleContexts(C_shiftContext.class);
		}
		public C_shiftContext c_shift(int i) {
			return getRuleContext(C_shiftContext.class,i);
		}
		public List<TerminalNode> EQU() { return getTokens(FunctionCraftParser.EQU); }
		public TerminalNode EQU(int i) {
			return getToken(FunctionCraftParser.EQU, i);
		}
		public List<TerminalNode> EQU_SUM() { return getTokens(FunctionCraftParser.EQU_SUM); }
		public TerminalNode EQU_SUM(int i) {
			return getToken(FunctionCraftParser.EQU_SUM, i);
		}
		public List<TerminalNode> EQU_SUB() { return getTokens(FunctionCraftParser.EQU_SUB); }
		public TerminalNode EQU_SUB(int i) {
			return getToken(FunctionCraftParser.EQU_SUB, i);
		}
		public List<TerminalNode> EQU_MUL() { return getTokens(FunctionCraftParser.EQU_MUL); }
		public TerminalNode EQU_MUL(int i) {
			return getToken(FunctionCraftParser.EQU_MUL, i);
		}
		public List<TerminalNode> EQU_DIV() { return getTokens(FunctionCraftParser.EQU_DIV); }
		public TerminalNode EQU_DIV(int i) {
			return getToken(FunctionCraftParser.EQU_DIV, i);
		}
		public List<TerminalNode> EQU_REMAIN() { return getTokens(FunctionCraftParser.EQU_REMAIN); }
		public TerminalNode EQU_REMAIN(int i) {
			return getToken(FunctionCraftParser.EQU_REMAIN, i);
		}
		public C_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_assignmentContext c_assignment() throws RecognitionException {
		C_assignmentContext _localctx = new C_assignmentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_c_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			c_shift();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) {
				{
				{
				setState(709);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQU:
					{
					setState(685);
					match(EQU);
					setState(686);
					c_shift();
					System.out.println("Operator: =");
					}
					break;
				case EQU_SUM:
					{
					setState(689);
					match(EQU_SUM);
					setState(690);
					c_shift();
					System.out.println("Operator: +=");
					}
					break;
				case EQU_SUB:
					{
					setState(693);
					match(EQU_SUB);
					setState(694);
					c_shift();
					System.out.println("Operator: -=");
					}
					break;
				case EQU_MUL:
					{
					setState(697);
					match(EQU_MUL);
					setState(698);
					c_shift();
					System.out.println("Operator: *=");
					}
					break;
				case EQU_DIV:
					{
					setState(701);
					match(EQU_DIV);
					setState(702);
					c_shift();
					System.out.println("Operator: /=");
					}
					break;
				case EQU_REMAIN:
					{
					setState(705);
					match(EQU_REMAIN);
					setState(706);
					c_shift();
					System.out.println("Operator: %=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_shiftContext extends ParserRuleContext {
		public List<C_equalityContext> c_equality() {
			return getRuleContexts(C_equalityContext.class);
		}
		public C_equalityContext c_equality(int i) {
			return getRuleContext(C_equalityContext.class,i);
		}
		public List<TerminalNode> APPEND() { return getTokens(FunctionCraftParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(FunctionCraftParser.APPEND, i);
		}
		public C_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_shiftContext c_shift() throws RecognitionException {
		C_shiftContext _localctx = new C_shiftContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_c_shift);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			c_equality();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPEND) {
				{
				{
				setState(717);
				match(APPEND);
				setState(718);
				c_equality();
				System.out.println("Operator: <<");
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_equalityContext extends ParserRuleContext {
		public List<C_relationalContext> c_relational() {
			return getRuleContexts(C_relationalContext.class);
		}
		public C_relationalContext c_relational(int i) {
			return getRuleContext(C_relationalContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(FunctionCraftParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(FunctionCraftParser.EQ, i);
		}
		public List<TerminalNode> EQ_NEG() { return getTokens(FunctionCraftParser.EQ_NEG); }
		public TerminalNode EQ_NEG(int i) {
			return getToken(FunctionCraftParser.EQ_NEG, i);
		}
		public C_equalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_equality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_equality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_equality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_equalityContext c_equality() throws RecognitionException {
		C_equalityContext _localctx = new C_equalityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_c_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			c_relational();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==EQ_NEG) {
				{
				{
				setState(735);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(727);
					match(EQ);
					setState(728);
					c_relational();
					System.out.println("Operator: ==");
					}
					break;
				case EQ_NEG:
					{
					setState(731);
					match(EQ_NEG);
					setState(732);
					c_relational();
					System.out.println("Operator: !=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_relationalContext extends ParserRuleContext {
		public List<C_additiveContext> c_additive() {
			return getRuleContexts(C_additiveContext.class);
		}
		public C_additiveContext c_additive(int i) {
			return getRuleContext(C_additiveContext.class,i);
		}
		public List<TerminalNode> LTE() { return getTokens(FunctionCraftParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(FunctionCraftParser.LTE, i);
		}
		public List<TerminalNode> LT() { return getTokens(FunctionCraftParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(FunctionCraftParser.LT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(FunctionCraftParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(FunctionCraftParser.GTE, i);
		}
		public List<TerminalNode> GT() { return getTokens(FunctionCraftParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(FunctionCraftParser.GT, i);
		}
		public C_relationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_relational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_relational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_relational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_relationalContext c_relational() throws RecognitionException {
		C_relationalContext _localctx = new C_relationalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_c_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			c_additive();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576462676448772096L) != 0)) {
				{
				{
				setState(759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LTE:
					{
					setState(743);
					match(LTE);
					setState(744);
					c_additive();
					System.out.println("Operator: <=");
					}
					break;
				case LT:
					{
					setState(747);
					match(LT);
					setState(748);
					c_additive();
					System.out.println("Operator: <");
					}
					break;
				case GTE:
					{
					setState(751);
					match(GTE);
					setState(752);
					c_additive();
					System.out.println("Operator: >=");
					}
					break;
				case GT:
					{
					setState(755);
					match(GT);
					setState(756);
					c_additive();
					System.out.println("Operator: >");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_additiveContext extends ParserRuleContext {
		public List<C_multiplicativeContext> c_multiplicative() {
			return getRuleContexts(C_multiplicativeContext.class);
		}
		public C_multiplicativeContext c_multiplicative(int i) {
			return getRuleContext(C_multiplicativeContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(FunctionCraftParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(FunctionCraftParser.SUM, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FunctionCraftParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FunctionCraftParser.SUB, i);
		}
		public C_additiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_additive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_additive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_additive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_additiveContext c_additive() throws RecognitionException {
		C_additiveContext _localctx = new C_additiveContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_c_additive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			c_multiplicative();
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUM:
						{
						setState(767);
						match(SUM);
						setState(768);
						c_multiplicative();
						System.out.println("Operator: +");
						}
						break;
					case SUB:
						{
						setState(771);
						match(SUB);
						setState(772);
						c_multiplicative();
						System.out.println("Operator: -");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_multiplicativeContext extends ParserRuleContext {
		public List<C_unaryContext> c_unary() {
			return getRuleContexts(C_unaryContext.class);
		}
		public C_unaryContext c_unary(int i) {
			return getRuleContext(C_unaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(FunctionCraftParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(FunctionCraftParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(FunctionCraftParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FunctionCraftParser.DIV, i);
		}
		public List<TerminalNode> REMAIN() { return getTokens(FunctionCraftParser.REMAIN); }
		public TerminalNode REMAIN(int i) {
			return getToken(FunctionCraftParser.REMAIN, i);
		}
		public C_multiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_multiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_multiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_multiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_multiplicativeContext c_multiplicative() throws RecognitionException {
		C_multiplicativeContext _localctx = new C_multiplicativeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_c_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			c_unary();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) {
				{
				{
				setState(795);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(783);
					match(MUL);
					setState(784);
					c_unary();
					System.out.println("Operator: *");
					}
					break;
				case DIV:
					{
					setState(787);
					match(DIV);
					setState(788);
					c_unary();
					System.out.println("Operator: /");
					}
					break;
				case REMAIN:
					{
					setState(791);
					match(REMAIN);
					setState(792);
					c_unary();
					System.out.println("Operator: %");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_unaryContext extends ParserRuleContext {
		public C_primaryContext c_primary() {
			return getRuleContext(C_primaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(FunctionCraftParser.SUB, 0); }
		public C_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_unaryContext c_unary() throws RecognitionException {
		C_unaryContext _localctx = new C_unaryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_c_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(802);
				match(NOT);
				System.out.println("Operator: !");
				}
				break;
			case 2:
				{
				setState(804);
				match(SUB);
				System.out.println("Operator: -");
				}
				break;
			}
			setState(808);
			c_primary();
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
	public static class C_primaryContext extends ParserRuleContext {
		public C_primary2Context c_primary2() {
			return getRuleContext(C_primary2Context.class,0);
		}
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public C_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_primaryContext c_primary() throws RecognitionException {
		C_primaryContext _localctx = new C_primaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_c_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			c_primary2();
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				{
				setState(811);
				match(INC);
				System.out.println("Operator: ++");
				}
				break;
			case DEC:
				{
				setState(813);
				match(DEC);
				System.out.println("Operator: --");
				}
				break;
			case END:
			case IF:
			case ELSE:
			case ELSEIF:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case LOOP:
			case FOR:
			case O_PAR:
			case C_PAR:
			case O_BRK:
			case C_BRK:
			case LAMBDA:
			case GTE:
			case LT:
			case LTE:
			case EQ:
			case EQ_NEG:
			case APPEND:
			case EQU_SUM:
			case EQU_SUB:
			case EQU_MUL:
			case EQU_DIV:
			case EQU_REMAIN:
			case EQU:
			case SUM:
			case SUB:
			case MUL:
			case DIV:
			case REMAIN:
			case GT:
			case NOT:
			case IDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
				break;
			default:
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_primary2Context extends ParserRuleContext {
		public TerminalNode O_PAR() { return getToken(FunctionCraftParser.O_PAR, 0); }
		public C_exprContext c_expr() {
			return getRuleContext(C_exprContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(FunctionCraftParser.C_PAR, 0); }
		public C_indexedContext c_indexed() {
			return getRuleContext(C_indexedContext.class,0);
		}
		public C_primary2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_primary2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_primary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_primary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_primary2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_primary2Context c_primary2() throws RecognitionException {
		C_primary2Context _localctx = new C_primary2Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_c_primary2);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				match(O_PAR);
				setState(818);
				c_expr();
				setState(819);
				match(C_PAR);
				}
				break;
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LEN:
			case O_BRK:
			case LAMBDA:
			case SUB:
			case IDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				c_indexed();
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
	public static class C_indexedContext extends ParserRuleContext {
		public C_factorContext c_factor() {
			return getRuleContext(C_factorContext.class,0);
		}
		public List<TerminalNode> O_BRK() { return getTokens(FunctionCraftParser.O_BRK); }
		public TerminalNode O_BRK(int i) {
			return getToken(FunctionCraftParser.O_BRK, i);
		}
		public List<C_exprContext> c_expr() {
			return getRuleContexts(C_exprContext.class);
		}
		public C_exprContext c_expr(int i) {
			return getRuleContext(C_exprContext.class,i);
		}
		public List<TerminalNode> C_BRK() { return getTokens(FunctionCraftParser.C_BRK); }
		public TerminalNode C_BRK(int i) {
			return getToken(FunctionCraftParser.C_BRK, i);
		}
		public C_indexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_indexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_indexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_indexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_indexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_indexedContext c_indexed() throws RecognitionException {
		C_indexedContext _localctx = new C_indexedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_c_indexed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			c_factor();
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(825);
					match(O_BRK);
					setState(826);
					c_expr();
					setState(827);
					match(C_BRK);
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_factorContext extends ParserRuleContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Pattern_callContext pattern_call() {
			return getRuleContext(Pattern_callContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public C_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterC_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitC_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitC_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_factorContext c_factor() throws RecognitionException {
		C_factorContext _localctx = new C_factorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_c_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(834);
				call_function();
				}
				break;
			case 2:
				{
				setState(835);
				types();
				}
				break;
			case 3:
				{
				setState(836);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(837);
				pattern_call();
				}
				break;
			case 5:
				{
				setState(838);
				lambda_function();
				}
				break;
			case 6:
				{
				setState(839);
				index();
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

	public static final String _serializedATN =
		"\u0004\u0001C\u034b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000y\b\u0000\n\u0000\f\u0000|\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0080\b\u0000\n\u0000\f\u0000\u0083\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00a3\b\u0003\u0001\u0003\u0003\u0003\u00a6\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00ae\b\u0003\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004\f\u0004\u00b4"+
		"\t\u0004\u0001\u0004\u0003\u0004\u00b7\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00bc\b\u0005\n\u0005\f\u0005\u00bf\t\u0005\u0003"+
		"\u0005\u00c1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d2"+
		"\b\u0006\n\u0006\f\u0006\u00d5\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00e4\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00e9"+
		"\b\t\n\t\f\t\u00ec\t\t\u0003\t\u00ee\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f7\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0100\b\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0003\r\u0106\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u010b"+
		"\b\r\u0005\r\u010d\b\r\n\r\f\r\u0110\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0115\b\u000e\n\u000e\f\u000e\u0118\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u011d\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0126\b\u000f\n\u000f\f\u000f\u0129\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0130\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u013e"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0166\b\u0018\n\u0018\f\u0018"+
		"\u0169\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u016f\b\u0018\n\u0018\f\u0018\u0172\t\u0018\u0005\u0018\u0174\b\u0018"+
		"\n\u0018\f\u0018\u0177\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u017c\b\u0018\n\u0018\f\u0018\u017f\t\u0018\u0003\u0018\u0181\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u019a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01ae\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b5\b\u001b\n\u001b\f\u001b"+
		"\u01b8\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01cb\b\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01cf\b"+
		"\u001b\n\u001b\f\u001b\u01d2\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01d6\b\u001b\u0001\u001c\u0003\u001c\u01d9\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01dd\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01e3\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ec\b\u001d\n"+
		"\u001d\f\u001d\u01ef\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0205\b \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0003 \u020c\b \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0212\b \u0003 \u0214\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u021d\b\"\n\"\f\"\u0220\t\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0005#\u0227\b#\n#\f#\u022a\t#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u0231\b$\n$\f$\u0234\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u023f\b%\u0005%\u0241\b%\n%\f%\u0244\t%"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0257\b&\u0005"+
		"&\u0259\b&\n&\f&\u025c\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0267\b\'\u0005\'\u0269\b\'\n\'\f\'"+
		"\u026c\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u027b\b(\u0005(\u027d\b(\n(\f(\u0280"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0003)\u0286\b)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u028f\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0296\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u029d\b,\n"+
		",\f,\u02a0\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-"+
		"\u02a9\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02c6"+
		"\b/\u0005/\u02c8\b/\n/\f/\u02cb\t/\u00010\u00010\u00010\u00010\u00010"+
		"\u00050\u02d2\b0\n0\f0\u02d5\t0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u02e0\b1\u00051\u02e2\b1\n1\f1\u02e5\t1"+
		"\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02f8\b2\u0005"+
		"2\u02fa\b2\n2\f2\u02fd\t2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00033\u0308\b3\u00053\u030a\b3\n3\f3\u030d\t3\u00014"+
		"\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u031c\b4\u00054\u031e\b4\n4\f4\u0321\t4\u00015"+
		"\u00015\u00015\u00015\u00035\u0327\b5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0330\b6\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u0337\b7\u00018\u00018\u00018\u00018\u00018\u00058\u033e\b8\n8\f8\u0341"+
		"\t8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0349\b9\u00019\u0000"+
		"\u0000:\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0004"+
		"\u0001\u0000AB\u0001\u0000\b\t\u0001\u000005\u0001\u0000-.\u0385\u0000"+
		"z\u0001\u0000\u0000\u0000\u0002\u0084\u0001\u0000\u0000\u0000\u0004\u008d"+
		"\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u00b2\u0001"+
		"\u0000\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00c9\u0001\u0000"+
		"\u0000\u0000\u000e\u00d6\u0001\u0000\u0000\u0000\u0010\u00e3\u0001\u0000"+
		"\u0000\u0000\u0012\u00ed\u0001\u0000\u0000\u0000\u0014\u00ef\u0001\u0000"+
		"\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000\u0018\u00fc\u0001\u0000"+
		"\u0000\u0000\u001a\u0105\u0001\u0000\u0000\u0000\u001c\u0111\u0001\u0000"+
		"\u0000\u0000\u001e\u011c\u0001\u0000\u0000\u0000 \u012f\u0001\u0000\u0000"+
		"\u0000\"\u0131\u0001\u0000\u0000\u0000$\u013d\u0001\u0000\u0000\u0000"+
		"&\u013f\u0001\u0000\u0000\u0000(\u0145\u0001\u0000\u0000\u0000*\u014d"+
		"\u0001\u0000\u0000\u0000,\u0153\u0001\u0000\u0000\u0000.\u0159\u0001\u0000"+
		"\u0000\u00000\u015f\u0001\u0000\u0000\u00002\u0199\u0001\u0000\u0000\u0000"+
		"4\u01ad\u0001\u0000\u0000\u00006\u01d5\u0001\u0000\u0000\u00008\u01e2"+
		"\u0001\u0000\u0000\u0000:\u01e4\u0001\u0000\u0000\u0000<\u01f2\u0001\u0000"+
		"\u0000\u0000>\u01f9\u0001\u0000\u0000\u0000@\u0213\u0001\u0000\u0000\u0000"+
		"B\u0215\u0001\u0000\u0000\u0000D\u0217\u0001\u0000\u0000\u0000F\u0221"+
		"\u0001\u0000\u0000\u0000H\u022b\u0001\u0000\u0000\u0000J\u0235\u0001\u0000"+
		"\u0000\u0000L\u0245\u0001\u0000\u0000\u0000N\u025d\u0001\u0000\u0000\u0000"+
		"P\u026d\u0001\u0000\u0000\u0000R\u0285\u0001\u0000\u0000\u0000T\u0289"+
		"\u0001\u0000\u0000\u0000V\u0295\u0001\u0000\u0000\u0000X\u0297\u0001\u0000"+
		"\u0000\u0000Z\u02a8\u0001\u0000\u0000\u0000\\\u02aa\u0001\u0000\u0000"+
		"\u0000^\u02ac\u0001\u0000\u0000\u0000`\u02cc\u0001\u0000\u0000\u0000b"+
		"\u02d6\u0001\u0000\u0000\u0000d\u02e6\u0001\u0000\u0000\u0000f\u02fe\u0001"+
		"\u0000\u0000\u0000h\u030e\u0001\u0000\u0000\u0000j\u0326\u0001\u0000\u0000"+
		"\u0000l\u032a\u0001\u0000\u0000\u0000n\u0336\u0001\u0000\u0000\u0000p"+
		"\u0338\u0001\u0000\u0000\u0000r\u0348\u0001\u0000\u0000\u0000ty\u0005"+
		"A\u0000\u0000uy\u0005B\u0000\u0000vy\u0003\u0002\u0001\u0000wy\u0003:"+
		"\u001d\u0000xt\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000}\u0081\u0003\u0004\u0002\u0000~\u0080"+
		"\u0007\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086\u0005"+
		"=\u0000\u0000\u0086\u0087\u0006\u0001\uffff\uffff\u0000\u0087\u0088\u0005"+
		"\u001b\u0000\u0000\u0088\u0089\u0003\n\u0005\u0000\u0089\u008a\u0005\u001c"+
		"\u0000\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b\u008c\u0005\u0002\u0000"+
		"\u0000\u008c\u0003\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0001\u0000"+
		"\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0006\u0002\uffff"+
		"\uffff\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0005\u001c"+
		"\u0000\u0000\u0092\u0093\u0003\b\u0004\u0000\u0093\u0094\u0005\u0002\u0000"+
		"\u0000\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u0096\u0005!\u0000\u0000"+
		"\u0096\u0097\u0006\u0003\uffff\uffff\u0000\u0097\u0098\u0005\u001b\u0000"+
		"\u0000\u0098\u0099\u0003\n\u0005\u0000\u0099\u009a\u0005\u001c\u0000\u0000"+
		"\u009a\u00a5\u0005\u001d\u0000\u0000\u009b\u009c\u0005\u0004\u0000\u0000"+
		"\u009c\u00a2\u0006\u0003\uffff\uffff\u0000\u009d\u009e\u0005\u001b\u0000"+
		"\u0000\u009e\u009f\u0003B!\u0000\u009f\u00a0\u0005\u001c\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003B!\u0000\u00a2\u009d\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a6\u0003B!\u0000\u00a5\u009b\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00ad\u0005\u001e\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001b\u0000\u0000\u00aa\u00ab\u0003\u0012\t\u0000"+
		"\u00ab\u00ac\u0005\u001c\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u0007\u0001\u0000\u0000\u0000\u00af\u00b1\u0003@ \u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0003\u0014\n\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\t\u0001\u0000\u0000\u0000\u00b8\u00bd\u0005="+
		"\u0000\u0000\u00b9\u00ba\u0005\"\u0000\u0000\u00ba\u00bc\u0005=\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c7\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\"\u0000\u0000"+
		"\u00c3\u00c4\u0005\u001f\u0000\u0000\u00c4\u00c5\u0003\f\u0006\u0000\u00c5"+
		"\u00c6\u0005 \u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u000b"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005=\u0000\u0000\u00ca\u00cb\u0005"+
		"5\u0000\u0000\u00cb\u00cc\u0003B!\u0000\u00cc\u00d3\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005\"\u0000\u0000\u00ce\u00cf\u0005=\u0000\u0000"+
		"\u00cf\u00d0\u00055\u0000\u0000\u00d0\u00d2\u0003B!\u0000\u00d1\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\r\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u000e\u0000\u0000\u00d7\u00d8\u0005\u001b\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0018\u0000\u0000\u00d9\u00da\u0005=\u0000\u0000\u00da\u00db\u0005\u001c"+
		"\u0000\u0000\u00db\u000f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005=\u0000"+
		"\u0000\u00dd\u00de\u0006\b\uffff\uffff\u0000\u00de\u00df\u0005\u001b\u0000"+
		"\u0000\u00df\u00e0\u0003\u0012\t\u0000\u00e0\u00e1\u0005\u001c\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003 \u0010\u0000\u00e3"+
		"\u00dc\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u0011\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003B!\u0000\u00e6\u00e7\u0005"+
		"\"\u0000\u0000\u00e7\u00e9\u0003B!\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0013\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f6\u0006\n\uffff\uffff"+
		"\u0000\u00f1\u00f2\u0005\u001b\u0000\u0000\u00f2\u00f3\u0003B!\u0000\u00f3"+
		"\u00f4\u0005\u001c\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f7\u0003B!\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\u0019\u0000\u0000\u00f9\u0015\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0007\u0001\u0000\u0000\u00fb\u0017\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0005\u001f\u0000\u0000\u00fd\u0100\u0003"+
		"\u001a\r\u0000\u00fe\u0100\u0003\u001c\u000e\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005 \u0000"+
		"\u0000\u0102\u0019\u0001\u0000\u0000\u0000\u0103\u0106\u0003B!\u0000\u0104"+
		"\u0106\u0003\u001c\u000e\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u010e\u0001\u0000\u0000\u0000\u0107"+
		"\u010a\u0005\"\u0000\u0000\u0108\u010b\u0003B!\u0000\u0109\u010b\u0003"+
		"\u001c\u000e\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0107\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u001b\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0116\u0003"+
		"\u0018\f\u0000\u0112\u0113\u0005\"\u0000\u0000\u0113\u0115\u0003\u0018"+
		"\f\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u001d\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u011d\u0005=\u0000\u0000\u011a\u011d\u0003\u0010\b\u0000"+
		"\u011b\u011d\u0003 \u0010\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u001f\u0000\u0000\u011f"+
		"\u0120\u0003B!\u0000\u0120\u0127\u0005 \u0000\u0000\u0121\u0122\u0005"+
		"\u001f\u0000\u0000\u0122\u0123\u0003B!\u0000\u0123\u0124\u0005 \u0000"+
		"\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u001f\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0130\u0003&\u0013\u0000"+
		"\u012b\u0130\u0003(\u0014\u0000\u012c\u0130\u0003*\u0015\u0000\u012d\u0130"+
		"\u0003,\u0016\u0000\u012e\u0130\u0003.\u0017\u0000\u012f\u012a\u0001\u0000"+
		"\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u0130!\u0001\u0000\u0000\u0000\u0131\u0132\u0007\u0002\u0000"+
		"\u0000\u0132#\u0001\u0000\u0000\u0000\u0133\u0134\u0005=\u0000\u0000\u0134"+
		"\u0135\u0003\"\u0011\u0000\u0135\u0136\u0003B!\u0000\u0136\u0137\u0006"+
		"\u0012\uffff\uffff\u0000\u0137\u013e\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005=\u0000\u0000\u0139\u013a\u0003\"\u0011\u0000\u013a\u013b\u0003"+
		"\u000e\u0007\u0000\u013b\u013c\u0006\u0012\uffff\uffff\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u0133\u0001\u0000\u0000\u0000\u013d\u0138"+
		"\u0001\u0000\u0000\u0000\u013e%\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"\r\u0000\u0000\u0140\u0141\u0006\u0013\uffff\uffff\u0000\u0141\u0142\u0005"+
		"\u001b\u0000\u0000\u0142\u0143\u0003B!\u0000\u0143\u0144\u0005\u001c\u0000"+
		"\u0000\u0144\'\u0001\u0000\u0000\u0000\u0145\u0146\u0005\f\u0000\u0000"+
		"\u0146\u0147\u0006\u0014\uffff\uffff\u0000\u0147\u0148\u0005\u001b\u0000"+
		"\u0000\u0148\u0149\u0003B!\u0000\u0149\u014a\u0005\"\u0000\u0000\u014a"+
		"\u014b\u0003B!\u0000\u014b\u014c\u0005\u001c\u0000\u0000\u014c)\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005\u000f\u0000\u0000\u014e\u014f\u0006"+
		"\u0015\uffff\uffff\u0000\u014f\u0150\u0005\u001b\u0000\u0000\u0150\u0151"+
		"\u0003B!\u0000\u0151\u0152\u0005\u001c\u0000\u0000\u0152+\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0006\u0016\uffff"+
		"\uffff\u0000\u0155\u0156\u0005\u001b\u0000\u0000\u0156\u0157\u0003B!\u0000"+
		"\u0157\u0158\u0005\u001c\u0000\u0000\u0158-\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005\u000b\u0000\u0000\u015a\u015b\u0006\u0017\uffff\uffff\u0000"+
		"\u015b\u015c\u0005\u001b\u0000\u0000\u015c\u015d\u0003B!\u0000\u015d\u015e"+
		"\u0005\u001c\u0000\u0000\u015e/\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0005\u0000\u0000\u0160\u0161\u0006\u0018\uffff\uffff\u0000\u0161\u0162"+
		"\u0005\u001b\u0000\u0000\u0162\u0163\u00032\u0019\u0000\u0163\u0167\u0005"+
		"\u001c\u0000\u0000\u0164\u0166\u0003@ \u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0175\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0007\u0000"+
		"\u0000\u016b\u016c\u0006\u0018\uffff\uffff\u0000\u016c\u0170\u00032\u0019"+
		"\u0000\u016d\u016f\u0003@ \u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0173\u016a\u0001\u0000\u0000\u0000\u0174"+
		"\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0180\u0001\u0000\u0000\u0000\u0177"+
		"\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0006\u0000\u0000\u0179"+
		"\u017d\u0006\u0018\uffff\uffff\u0000\u017a\u017c\u0003@ \u0000\u017b\u017a"+
		"\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0181"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0178"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0002\u0000\u0000\u01831\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005\u001b\u0000\u0000\u0185\u0186\u0003"+
		"2\u0019\u0000\u0186\u0187\u0005\u001c\u0000\u0000\u0187\u0188\u0005)\u0000"+
		"\u0000\u0188\u0189\u0005\u001b\u0000\u0000\u0189\u018a\u00032\u0019\u0000"+
		"\u018a\u018b\u0005\u001c\u0000\u0000\u018b\u019a\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005\u001b\u0000\u0000\u018d\u018e\u00032\u0019\u0000\u018e"+
		"\u018f\u0005\u001c\u0000\u0000\u018f\u0190\u0005,\u0000\u0000\u0190\u0191"+
		"\u0005\u001b\u0000\u0000\u0191\u0192\u00032\u0019\u0000\u0192\u0193\u0005"+
		"\u001c\u0000\u0000\u0193\u019a\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"\u001b\u0000\u0000\u0195\u0196\u00032\u0019\u0000\u0196\u0197\u0005\u001c"+
		"\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u019a\u0003\\."+
		"\u0000\u0199\u0184\u0001\u0000\u0000\u0000\u0199\u018c\u0001\u0000\u0000"+
		"\u0000\u0199\u0194\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u019a3\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0013\u0000\u0000"+
		"\u019c\u019d\u0006\u001a\uffff\uffff\u0000\u019d\u01ae\u0005\u0019\u0000"+
		"\u0000\u019e\u019f\u0005\u0013\u0000\u0000\u019f\u01a0\u0005\u0005\u0000"+
		"\u0000\u01a0\u01a1\u0006\u001a\uffff\uffff\u0000\u01a1\u01a2\u0003B!\u0000"+
		"\u01a2\u01a3\u0005\u0019\u0000\u0000\u01a3\u01ae\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005\u0012\u0000\u0000\u01a5\u01a6\u0006\u001a\uffff\uffff"+
		"\u0000\u01a6\u01ae\u0005\u0019\u0000\u0000\u01a7\u01a8\u0005\u0012\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0005\u0000\u0000\u01a9\u01aa\u0006\u001a\uffff"+
		"\uffff\u0000\u01aa\u01ab\u0003B!\u0000\u01ab\u01ac\u0005\u0019\u0000\u0000"+
		"\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u019b\u0001\u0000\u0000\u0000"+
		"\u01ad\u019e\u0001\u0000\u0000\u0000\u01ad\u01a4\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ae5\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0005\u0014\u0000\u0000\u01b0\u01b1\u0005\u0015\u0000\u0000\u01b1"+
		"\u01b6\u0006\u001b\uffff\uffff\u0000\u01b2\u01b5\u0003@ \u0000\u01b3\u01b5"+
		"\u00034\u001a\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01d6\u0005"+
		"\u0002\u0000\u0000\u01ba\u01bb\u0005\u0016\u0000\u0000\u01bb\u01bc\u0006"+
		"\u001b\uffff\uffff\u0000\u01bc\u01bd\u0005=\u0000\u0000\u01bd\u01be\u0005"+
		"\u0017\u0000\u0000\u01be\u01cb\u0003B!\u0000\u01bf\u01c0\u0005\u0016\u0000"+
		"\u0000\u01c0\u01c1\u0006\u001b\uffff\uffff\u0000\u01c1\u01c2\u0005=\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0017\u0000\u0000\u01c3\u01c4\u0005\u001b\u0000"+
		"\u0000\u01c4\u01c5\u0003B!\u0000\u01c5\u01c6\u0005#\u0000\u0000\u01c6"+
		"\u01c7\u0005#\u0000\u0000\u01c7\u01c8\u0003B!\u0000\u01c8\u01c9\u0005"+
		"\u001c\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ca\u01bf\u0001\u0000\u0000\u0000\u01cb\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cf\u0003@ \u0000\u01cd\u01cf\u00034\u001a"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005\u0002\u0000"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01af\u0001\u0000\u0000"+
		"\u0000\u01d5\u01ca\u0001\u0000\u0000\u0000\u01d67\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d9\u00057\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01e3\u0005>\u0000\u0000\u01db\u01dd\u00057\u0000\u0000\u01dc\u01db\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e3\u0005?\u0000\u0000\u01df\u01e3\u0005@\u0000"+
		"\u0000\u01e0\u01e3\u0003\u0016\u000b\u0000\u01e1\u01e3\u0003\u0018\f\u0000"+
		"\u01e2\u01d8\u0001\u0000\u0000\u0000\u01e2\u01dc\u0001\u0000\u0000\u0000"+
		"\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e39\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0010\u0000\u0000\u01e5\u01e6\u0005=\u0000\u0000\u01e6\u01e7"+
		"\u0006\u001d\uffff\uffff\u0000\u01e7\u01e8\u0005\u001b\u0000\u0000\u01e8"+
		"\u01e9\u0003\n\u0005\u0000\u01e9\u01ed\u0005\u001c\u0000\u0000\u01ea\u01ec"+
		"\u0003<\u001e\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005\u0019\u0000\u0000\u01f1;\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0007\u0003\u0000\u0000\u01f3\u01f4\u0005\u001b"+
		"\u0000\u0000\u01f4\u01f5\u0003B!\u0000\u01f5\u01f6\u0005\u001c\u0000\u0000"+
		"\u01f6\u01f7\u00055\u0000\u0000\u01f7\u01f8\u0003B!\u0000\u01f8=\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0005=\u0000\u0000\u01fa\u01fb\u0005#\u0000"+
		"\u0000\u01fb\u01fc\u0005\u0011\u0000\u0000\u01fc\u01fd\u0006\u001f\uffff"+
		"\uffff\u0000\u01fd\u01fe\u0005\u001b\u0000\u0000\u01fe\u01ff\u0003\u0012"+
		"\t\u0000\u01ff\u0200\u0005\u001c\u0000\u0000\u0200?\u0001\u0000\u0000"+
		"\u0000\u0201\u0204\u0005\u001b\u0000\u0000\u0202\u0205\u0003B!\u0000\u0203"+
		"\u0205\u0003$\u0012\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0005\u001c\u0000\u0000\u0207\u0208\u0005\u0019\u0000\u0000\u0208\u0214"+
		"\u0001\u0000\u0000\u0000\u0209\u020c\u0003B!\u0000\u020a\u020c\u0003$"+
		"\u0012\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u0019"+
		"\u0000\u0000\u020e\u0214\u0001\u0000\u0000\u0000\u020f\u0212\u00030\u0018"+
		"\u0000\u0210\u0212\u00036\u001b\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u0201\u0001\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214A\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0003D\"\u0000\u0216C\u0001\u0000\u0000\u0000\u0217\u021e\u0003"+
		"F#\u0000\u0218\u0219\u0005/\u0000\u0000\u0219\u021a\u0003F#\u0000\u021a"+
		"\u021b\u0006\"\uffff\uffff\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c"+
		"\u0218\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e"+
		"\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f"+
		"E\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0228"+
		"\u0003H$\u0000\u0222\u0223\u0005,\u0000\u0000\u0223\u0224\u0003H$\u0000"+
		"\u0224\u0225\u0006#\uffff\uffff\u0000\u0225\u0227\u0001\u0000\u0000\u0000"+
		"\u0226\u0222\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000"+
		"\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000"+
		"\u0229G\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b"+
		"\u0232\u0003J%\u0000\u022c\u022d\u0005)\u0000\u0000\u022d\u022e\u0003"+
		"J%\u0000\u022e\u022f\u0006$\uffff\uffff\u0000\u022f\u0231\u0001\u0000"+
		"\u0000\u0000\u0230\u022c\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000"+
		"\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000"+
		"\u0000\u0000\u0233I\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000"+
		"\u0000\u0235\u0242\u0003L&\u0000\u0236\u0237\u0005*\u0000\u0000\u0237"+
		"\u0238\u0003L&\u0000\u0238\u0239\u0006%\uffff\uffff\u0000\u0239\u023f"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005+\u0000\u0000\u023b\u023c\u0003"+
		"L&\u0000\u023c\u023d\u0006%\uffff\uffff\u0000\u023d\u023f\u0001\u0000"+
		"\u0000\u0000\u023e\u0236\u0001\u0000\u0000\u0000\u023e\u023a\u0001\u0000"+
		"\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000"+
		"\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243K\u0001\u0000\u0000"+
		"\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u025a\u0003N\'\u0000"+
		"\u0246\u0247\u0005(\u0000\u0000\u0247\u0248\u0003N\'\u0000\u0248\u0249"+
		"\u0006&\uffff\uffff\u0000\u0249\u0257\u0001\u0000\u0000\u0000\u024a\u024b"+
		"\u0005\'\u0000\u0000\u024b\u024c\u0003N\'\u0000\u024c\u024d\u0006&\uffff"+
		"\uffff\u0000\u024d\u0257\u0001\u0000\u0000\u0000\u024e\u024f\u0005&\u0000"+
		"\u0000\u024f\u0250\u0003N\'\u0000\u0250\u0251\u0006&\uffff\uffff\u0000"+
		"\u0251\u0257\u0001\u0000\u0000\u0000\u0252\u0253\u0005;\u0000\u0000\u0253"+
		"\u0254\u0003N\'\u0000\u0254\u0255\u0006&\uffff\uffff\u0000\u0255\u0257"+
		"\u0001\u0000\u0000\u0000\u0256\u0246\u0001\u0000\u0000\u0000\u0256\u024a"+
		"\u0001\u0000\u0000\u0000\u0256\u024e\u0001\u0000\u0000\u0000\u0256\u0252"+
		"\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025bM\u0001"+
		"\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u026a\u0003"+
		"P(\u0000\u025e\u025f\u00056\u0000\u0000\u025f\u0260\u0003P(\u0000\u0260"+
		"\u0261\u0006\'\uffff\uffff\u0000\u0261\u0267\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u00057\u0000\u0000\u0263\u0264\u0003P(\u0000\u0264\u0265\u0006"+
		"\'\uffff\uffff\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u025e\u0001"+
		"\u0000\u0000\u0000\u0266\u0262\u0001\u0000\u0000\u0000\u0267\u0269\u0001"+
		"\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026c\u0001"+
		"\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001"+
		"\u0000\u0000\u0000\u026bO\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000"+
		"\u0000\u0000\u026d\u027e\u0003R)\u0000\u026e\u026f\u00058\u0000\u0000"+
		"\u026f\u0270\u0003R)\u0000\u0270\u0271\u0006(\uffff\uffff\u0000\u0271"+
		"\u027b\u0001\u0000\u0000\u0000\u0272\u0273\u00059\u0000\u0000\u0273\u0274"+
		"\u0003R)\u0000\u0274\u0275\u0006(\uffff\uffff\u0000\u0275\u027b\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0005:\u0000\u0000\u0277\u0278\u0003R)"+
		"\u0000\u0278\u0279\u0006(\uffff\uffff\u0000\u0279\u027b\u0001\u0000\u0000"+
		"\u0000\u027a\u026e\u0001\u0000\u0000\u0000\u027a\u0272\u0001\u0000\u0000"+
		"\u0000\u027a\u0276\u0001\u0000\u0000\u0000\u027b\u027d\u0001\u0000\u0000"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000"+
		"\u0000\u027fQ\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0005<\u0000\u0000\u0282\u0286\u0006)\uffff\uffff\u0000\u0283"+
		"\u0284\u00057\u0000\u0000\u0284\u0286\u0006)\uffff\uffff\u0000\u0285\u0281"+
		"\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0003T*\u0000\u0288S\u0001\u0000\u0000\u0000\u0289\u028e\u0003V+\u0000"+
		"\u028a\u028b\u0005%\u0000\u0000\u028b\u028f\u0006*\uffff\uffff\u0000\u028c"+
		"\u028d\u0005$\u0000\u0000\u028d\u028f\u0006*\uffff\uffff\u0000\u028e\u028a"+
		"\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028fU\u0001\u0000\u0000\u0000\u0290\u0291\u0005"+
		"\u001b\u0000\u0000\u0291\u0292\u0003B!\u0000\u0292\u0293\u0005\u001c\u0000"+
		"\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0296\u0003X,\u0000\u0295"+
		"\u0290\u0001\u0000\u0000\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296"+
		"W\u0001\u0000\u0000\u0000\u0297\u029e\u0003Z-\u0000\u0298\u0299\u0005"+
		"\u001f\u0000\u0000\u0299\u029a\u0003B!\u0000\u029a\u029b\u0005 \u0000"+
		"\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0298\u0001\u0000\u0000"+
		"\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029fY\u0001\u0000\u0000\u0000"+
		"\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a9\u0003\u0010\b\u0000\u02a2"+
		"\u02a9\u0003 \u0010\u0000\u02a3\u02a9\u00038\u001c\u0000\u02a4\u02a9\u0005"+
		"=\u0000\u0000\u02a5\u02a9\u0003>\u001f\u0000\u02a6\u02a9\u0003\u0006\u0003"+
		"\u0000\u02a7\u02a9\u0003\u001e\u000f\u0000\u02a8\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a2\u0001\u0000\u0000\u0000\u02a8\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a4\u0001\u0000\u0000\u0000\u02a8\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a9[\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003^/\u0000\u02ab"+
		"]\u0001\u0000\u0000\u0000\u02ac\u02c9\u0003`0\u0000\u02ad\u02ae\u0005"+
		"5\u0000\u0000\u02ae\u02af\u0003`0\u0000\u02af\u02b0\u0006/\uffff\uffff"+
		"\u0000\u02b0\u02c6\u0001\u0000\u0000\u0000\u02b1\u02b2\u00050\u0000\u0000"+
		"\u02b2\u02b3\u0003`0\u0000\u02b3\u02b4\u0006/\uffff\uffff\u0000\u02b4"+
		"\u02c6\u0001\u0000\u0000\u0000\u02b5\u02b6\u00051\u0000\u0000\u02b6\u02b7"+
		"\u0003`0\u0000\u02b7\u02b8\u0006/\uffff\uffff\u0000\u02b8\u02c6\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u00052\u0000\u0000\u02ba\u02bb\u0003`0"+
		"\u0000\u02bb\u02bc\u0006/\uffff\uffff\u0000\u02bc\u02c6\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u00053\u0000\u0000\u02be\u02bf\u0003`0\u0000\u02bf"+
		"\u02c0\u0006/\uffff\uffff\u0000\u02c0\u02c6\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c2\u00054\u0000\u0000\u02c2\u02c3\u0003`0\u0000\u02c3\u02c4\u0006"+
		"/\uffff\uffff\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02ad\u0001"+
		"\u0000\u0000\u0000\u02c5\u02b1\u0001\u0000\u0000\u0000\u02c5\u02b5\u0001"+
		"\u0000\u0000\u0000\u02c5\u02b9\u0001\u0000\u0000\u0000\u02c5\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c1\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001"+
		"\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02ca_\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cc\u02d3\u0003b1\u0000\u02cd\u02ce\u0005/\u0000\u0000"+
		"\u02ce\u02cf\u0003b1\u0000\u02cf\u02d0\u00060\uffff\uffff\u0000\u02d0"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d1\u02cd\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d4a\u0001\u0000\u0000\u0000\u02d5\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d6\u02e3\u0003d2\u0000\u02d7\u02d8\u0005*"+
		"\u0000\u0000\u02d8\u02d9\u0003d2\u0000\u02d9\u02da\u00061\uffff\uffff"+
		"\u0000\u02da\u02e0\u0001\u0000\u0000\u0000\u02db\u02dc\u0005+\u0000\u0000"+
		"\u02dc\u02dd\u0003d2\u0000\u02dd\u02de\u00061\uffff\uffff\u0000\u02de"+
		"\u02e0\u0001\u0000\u0000\u0000\u02df\u02d7\u0001\u0000\u0000\u0000\u02df"+
		"\u02db\u0001\u0000\u0000\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1"+
		"\u02df\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4"+
		"c\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02fb"+
		"\u0003f3\u0000\u02e7\u02e8\u0005(\u0000\u0000\u02e8\u02e9\u0003f3\u0000"+
		"\u02e9\u02ea\u00062\uffff\uffff\u0000\u02ea\u02f8\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0005\'\u0000\u0000\u02ec\u02ed\u0003f3\u0000\u02ed\u02ee"+
		"\u00062\uffff\uffff\u0000\u02ee\u02f8\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0005&\u0000\u0000\u02f0\u02f1\u0003f3\u0000\u02f1\u02f2\u00062\uffff"+
		"\uffff\u0000\u02f2\u02f8\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005;\u0000"+
		"\u0000\u02f4\u02f5\u0003f3\u0000\u02f5\u02f6\u00062\uffff\uffff\u0000"+
		"\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02e7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02eb\u0001\u0000\u0000\u0000\u02f7\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000\u0000"+
		"\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000"+
		"\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fce\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe"+
		"\u030b\u0003h4\u0000\u02ff\u0300\u00056\u0000\u0000\u0300\u0301\u0003"+
		"h4\u0000\u0301\u0302\u00063\uffff\uffff\u0000\u0302\u0308\u0001\u0000"+
		"\u0000\u0000\u0303\u0304\u00057\u0000\u0000\u0304\u0305\u0003h4\u0000"+
		"\u0305\u0306\u00063\uffff\uffff\u0000\u0306\u0308\u0001\u0000\u0000\u0000"+
		"\u0307\u02ff\u0001\u0000\u0000\u0000\u0307\u0303\u0001\u0000\u0000\u0000"+
		"\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030cg\u0001\u0000\u0000\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030e\u031f\u0003j5\u0000\u030f\u0310\u0005"+
		"8\u0000\u0000\u0310\u0311\u0003j5\u0000\u0311\u0312\u00064\uffff\uffff"+
		"\u0000\u0312\u031c\u0001\u0000\u0000\u0000\u0313\u0314\u00059\u0000\u0000"+
		"\u0314\u0315\u0003j5\u0000\u0315\u0316\u00064\uffff\uffff\u0000\u0316"+
		"\u031c\u0001\u0000\u0000\u0000\u0317\u0318\u0005:\u0000\u0000\u0318\u0319"+
		"\u0003j5\u0000\u0319\u031a\u00064\uffff\uffff\u0000\u031a\u031c\u0001"+
		"\u0000\u0000\u0000\u031b\u030f\u0001\u0000\u0000\u0000\u031b\u0313\u0001"+
		"\u0000\u0000\u0000\u031b\u0317\u0001\u0000\u0000\u0000\u031c\u031e\u0001"+
		"\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e\u0321\u0001"+
		"\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001"+
		"\u0000\u0000\u0000\u0320i\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000"+
		"\u0000\u0000\u0322\u0323\u0005<\u0000\u0000\u0323\u0327\u00065\uffff\uffff"+
		"\u0000\u0324\u0325\u00057\u0000\u0000\u0325\u0327\u00065\uffff\uffff\u0000"+
		"\u0326\u0322\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0003l6\u0000\u0329k\u0001\u0000\u0000\u0000\u032a\u032f"+
		"\u0003n7\u0000\u032b\u032c\u0005%\u0000\u0000\u032c\u0330\u00066\uffff"+
		"\uffff\u0000\u032d\u032e\u0005$\u0000\u0000\u032e\u0330\u00066\uffff\uffff"+
		"\u0000\u032f\u032b\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330m\u0001\u0000\u0000\u0000"+
		"\u0331\u0332\u0005\u001b\u0000\u0000\u0332\u0333\u0003\\.\u0000\u0333"+
		"\u0334\u0005\u001c\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335"+
		"\u0337\u0003p8\u0000\u0336\u0331\u0001\u0000\u0000\u0000\u0336\u0335\u0001"+
		"\u0000\u0000\u0000\u0337o\u0001\u0000\u0000\u0000\u0338\u033f\u0003r9"+
		"\u0000\u0339\u033a\u0005\u001f\u0000\u0000\u033a\u033b\u0003\\.\u0000"+
		"\u033b\u033c\u0005 \u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d"+
		"\u0339\u0001\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000\u033f"+
		"\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340"+
		"q\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0349"+
		"\u0003\u0010\b\u0000\u0343\u0349\u00038\u001c\u0000\u0344\u0349\u0005"+
		"=\u0000\u0000\u0345\u0349\u0003>\u001f\u0000\u0346\u0349\u0003\u0006\u0003"+
		"\u0000\u0347\u0349\u0003\u001e\u000f\u0000\u0348\u0342\u0001\u0000\u0000"+
		"\u0000\u0348\u0343\u0001\u0000\u0000\u0000\u0348\u0344\u0001\u0000\u0000"+
		"\u0000\u0348\u0345\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000"+
		"\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0349s\u0001\u0000\u0000\u0000"+
		"Nxz\u0081\u00a2\u00a5\u00ad\u00b2\u00b6\u00bd\u00c0\u00c7\u00d3\u00e3"+
		"\u00ea\u00ed\u00f6\u00ff\u0105\u010a\u010e\u0116\u011c\u0127\u012f\u013d"+
		"\u0167\u0170\u0175\u017d\u0180\u0199\u01ad\u01b4\u01b6\u01ca\u01ce\u01d0"+
		"\u01d5\u01d8\u01dc\u01e2\u01ed\u0204\u020b\u0211\u0213\u021e\u0228\u0232"+
		"\u023e\u0242\u0256\u025a\u0266\u026a\u027a\u027e\u0285\u028e\u0295\u029e"+
		"\u02a8\u02c5\u02c9\u02d3\u02df\u02e3\u02f7\u02fb\u0307\u030b\u031b\u031f"+
		"\u0326\u032f\u0336\u033f\u0348";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}