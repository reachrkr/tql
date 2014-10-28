// Generated from Twitter.g4 by ANTLR 4.4
package com.triers.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TwitterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING=8, ID=9, 
		INT=10, SIGN=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'find all doctors'", "'ambulance'", "'time'", "'for'", "';'", 
		"'doctors'", "'find'", "STRING", "ID", "INT", "SIGN", "WS"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_doc = 2, RULE_amb = 3, RULE_comp = 4, 
		RULE_loc = 5, RULE_arg = 6;
	public static final String[] ruleNames = {
		"program", "expression", "doc", "amb", "comp", "loc", "arg"
	};

	@Override
	public String getGrammarFileName() { return "Twitter.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TwitterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitProgram(this);
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
			do {
				{
				{
				{
				setState(14); expression();
				}
				setState(15); match(T__2);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__5) | (1L << T__0))) != 0) );
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AmbulanceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(TwitterParser.ID, 0); }
		public AmbContext amb() {
			return getRuleContext(AmbContext.class,0);
		}
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public AmbulanceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterAmbulance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitAmbulance(this);
		}
	}
	public static class DocsContext extends ExpressionContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode SIGN() { return getToken(TwitterParser.SIGN, 0); }
		public TerminalNode ID() { return getToken(TwitterParser.ID, 0); }
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public DocsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterDocs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitDocs(this);
		}
	}
	public static class AllContext extends ExpressionContext {
		public AllContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitAll(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new AllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(T__6);
				}
				break;
			case T__0:
				_localctx = new DocsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); match(T__0);
				setState(23); doc();
				setState(24); match(T__3);
				setState(25); match(ID);
				setState(26); match(T__4);
				setState(27); match(SIGN);
				setState(28); comp();
				}
				break;
			case T__5:
				_localctx = new AmbulanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30); amb();
				setState(31); match(T__3);
				setState(32); match(ID);
				setState(33); loc();
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

	public static class DocContext extends ParserRuleContext {
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitDoc(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__1);
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

	public static class AmbContext extends ParserRuleContext {
		public AmbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterAmb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitAmb(this);
		}
	}

	public final AmbContext amb() throws RecognitionException {
		AmbContext _localctx = new AmbContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_amb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(T__5);
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TwitterParser.INT, 0); }
		public TerminalNode ID() { return getToken(TwitterParser.ID, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LocContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TwitterParser.ID, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitLoc(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(ID);
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
		public TerminalNode ID() { return getToken(TwitterParser.ID, 0); }
		public TerminalNode STRING() { return getToken(TwitterParser.STRING, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TwitterListener ) ((TwitterListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2\r"+
		"\2\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16"+
		"\2\4\3\2\13\f\3\2\n\13-\2\23\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2"+
		"\n+\3\2\2\2\f-\3\2\2\2\16/\3\2\2\2\20\21\5\4\3\2\21\22\7\7\2\2\22\24\3"+
		"\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3"+
		"\2\2\2\27&\7\3\2\2\30\31\7\t\2\2\31\32\5\6\4\2\32\33\7\6\2\2\33\34\7\13"+
		"\2\2\34\35\7\5\2\2\35\36\7\r\2\2\36\37\5\n\6\2\37&\3\2\2\2 !\5\b\5\2!"+
		"\"\7\6\2\2\"#\7\13\2\2#$\5\f\7\2$&\3\2\2\2%\27\3\2\2\2%\30\3\2\2\2% \3"+
		"\2\2\2&\5\3\2\2\2\'(\7\b\2\2(\7\3\2\2\2)*\7\4\2\2*\t\3\2\2\2+,\t\2\2\2"+
		",\13\3\2\2\2-.\7\13\2\2.\r\3\2\2\2/\60\t\3\2\2\60\17\3\2\2\2\4\25%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}