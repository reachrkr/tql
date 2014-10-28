// Generated from Twitter.g4 by ANTLR 4.4
package com.triers.dsl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TwitterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING=8, ID=9, 
		INT=10, SIGN=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "ID", 
		"INT", "SIGN", "WS"
	};


	public TwitterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Twitter.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\7\tQ\n\t\f\t\16\tT\13\t\3\t\3\t\3\n\6\nY\n\n\r"+
		"\n\16\nZ\3\13\6\13^\n\13\r\13\16\13_\3\f\3\f\3\f\3\f\3\f\6\fg\n\f\r\f"+
		"\16\fh\3\r\6\rl\n\r\r\r\16\rm\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"w\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\3\33\3\2\2\2\5,\3\2\2\2\7\66\3\2\2\2\t;\3\2\2\2\13?\3\2\2"+
		"\2\rA\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23X\3\2\2\2\25]\3\2\2\2\27f\3\2"+
		"\2\2\31k\3\2\2\2\33\34\7h\2\2\34\35\7k\2\2\35\36\7p\2\2\36\37\7f\2\2\37"+
		" \7\"\2\2 !\7c\2\2!\"\7n\2\2\"#\7n\2\2#$\7\"\2\2$%\7f\2\2%&\7q\2\2&\'"+
		"\7e\2\2\'(\7v\2\2()\7q\2\2)*\7t\2\2*+\7u\2\2+\4\3\2\2\2,-\7c\2\2-.\7o"+
		"\2\2./\7d\2\2/\60\7w\2\2\60\61\7n\2\2\61\62\7c\2\2\62\63\7p\2\2\63\64"+
		"\7e\2\2\64\65\7g\2\2\65\6\3\2\2\2\66\67\7v\2\2\678\7k\2\289\7o\2\29:\7"+
		"g\2\2:\b\3\2\2\2;<\7h\2\2<=\7q\2\2=>\7t\2\2>\n\3\2\2\2?@\7=\2\2@\f\3\2"+
		"\2\2AB\7f\2\2BC\7q\2\2CD\7e\2\2DE\7v\2\2EF\7q\2\2FG\7t\2\2GH\7u\2\2H\16"+
		"\3\2\2\2IJ\7h\2\2JK\7k\2\2KL\7p\2\2LM\7f\2\2M\20\3\2\2\2NR\7$\2\2OQ\4"+
		"\"\u0080\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UV\7$\2\2V\22\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\24\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\26"+
		"\3\2\2\2ag\4>@\2bc\7>\2\2cg\7?\2\2de\7@\2\2eg\7?\2\2fa\3\2\2\2fb\3\2\2"+
		"\2fd\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\30\3\2\2\2jl\t\3\2\2kj\3\2"+
		"\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\r\2\2p\32\3\2\2\2\t\2"+
		"RZ_fhm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}