// Generated from ExprLexer.tokens by ANTLR 4.9.1
package lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTIPLY=3, DIVIDE=4, OPAREN=5, CPAREN=6, FLOAT=7, INT=8, 
		IDENTIFIER=9, COMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPAREN", "CPAREN", "FLOAT", "INT", 
			"IDENTIFIER", "COMMENT", "WS", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPAREN", "CPAREN", "FLOAT", 
			"INT", "IDENTIFIER", "COMMENT", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprLexer.tokens"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rh\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\6\b+\n\b\r\b\16\b,\3\b\3\b\6\b\61\n\b\r\b\16\b\62\3\t\6\t"+
		"\66\n\t\r\t\16\t\67\3\n\3\n\3\n\7\n=\n\n\f\n\16\n@\13\n\3\13\3\13\3\13"+
		"\3\13\7\13F\n\13\f\13\16\13I\13\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13S\n\13\f\13\16\13V\13\13\3\13\3\13\5\13Z\n\13\3\13\3\13\3\f"+
		"\6\f_\n\f\r\f\16\f`\3\f\3\f\3\r\3\r\3\16\3\16\3T\2\17\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\3\2\5\4\2\f\f\17\17\5\2"+
		"\13\f\16\17\"\"\4\2C\\c|\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2"+
		"\2\2\13%\3\2\2\2\r\'\3\2\2\2\17*\3\2\2\2\21\65\3\2\2\2\239\3\2\2\2\25"+
		"Y\3\2\2\2\27^\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35\36\7-\2\2\36\4\3\2\2"+
		"\2\37 \7/\2\2 \6\3\2\2\2!\"\7,\2\2\"\b\3\2\2\2#$\7\61\2\2$\n\3\2\2\2%"+
		"&\7*\2\2&\f\3\2\2\2\'(\7+\2\2(\16\3\2\2\2)+\5\33\16\2*)\3\2\2\2+,\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\60\2\2/\61\5\33\16\2\60/\3\2"+
		"\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\20\3\2\2\2\64\66\5\33"+
		"\16\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\22\3\2\2"+
		"\29>\5\31\r\2:=\5\31\r\2;=\5\33\16\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?\24\3\2\2\2@>\3\2\2\2AB\7\61\2\2BC\7\61\2\2CG\3\2\2\2"+
		"DF\n\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"JL\7\17\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MZ\7\f\2\2NO\7\61\2\2OP\7,\2"+
		"\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\7,\2\2XZ\7\61\2\2YA\3\2\2\2YN\3\2\2\2Z[\3\2\2\2[\\\b"+
		"\13\2\2\\\26\3\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ab\3\2\2\2bc\b\f\2\2c\30\3\2\2\2de\t\4\2\2e\32\3\2\2\2fg\4\62;\2g\34\3"+
		"\2\2\2\r\2,\62\67<>GKTY`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}