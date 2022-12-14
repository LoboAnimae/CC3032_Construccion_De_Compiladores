// Generated from /home/yagdrassyl/Documents/Code/University/compiladores/proyecto2/yapl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pruebaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, CLASS=11, ELSE=12, TRUE=13, FALSE=14, FI=15, IF=16, IN=17, INHERITS=18, 
		ISVOID=19, LOOP=20, POOL=21, THEN=22, WHILE=23, NEW=24, NOT=25, LET=26, 
		INT=27, ID=28, TYPE=29, SELF=30, SELF_TYPE=31, STR=32, ASSIGNMENT=33, 
		ADD=34, MINUS=35, MULT=36, DIV=37, LT=38, LE=39, EQ=40, START_COMMENT=41, 
		END_COMMENT=42, COMMENT=43, LINE_COMMENT=44, WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "CLASS", "ELSE", "TRUE", "FALSE", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "INT", 
			"ID", "TYPE", "SELF", "SELF_TYPE", "STR", "ASSIGNMENT", "ADD", "MINUS", 
			"MULT", "DIV", "LT", "LE", "EQ", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
			"W", "X", "Y", "Z", "START_COMMENT", "END_COMMENT", "COMMENT", "LINE_COMMENT", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'@'", "'.'", 
			"'~'", null, null, "'true'", "'false'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'self'", 
			"'SELF_TYPE'", null, "'<-'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", 
			"'='", "'(*'", "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "CLASS", 
			"ELSE", "TRUE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LOOP", 
			"POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "INT", "ID", "TYPE", "SELF", 
			"SELF_TYPE", "STR", "ASSIGNMENT", "ADD", "MINUS", "MULT", "DIV", "LT", 
			"LE", "EQ", "START_COMMENT", "END_COMMENT", "COMMENT", "LINE_COMMENT", 
			"WHITESPACE"
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


	public pruebaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yapl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\6\34\u00f7\n\34"+
		"\r\34\16\34\u00f8\3\35\3\35\7\35\u00fd\n\35\f\35\16\35\u0100\13\35\3\36"+
		"\3\36\7\36\u0104\n\36\f\36\16\36\u0107\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\7!\u011a\n!\f!\16!\u011d\13!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\7"+
		"F\u0170\nF\fF\16F\u0173\13F\3F\3F\3F\3F\3G\3G\3G\3G\7G\u017d\nG\fG\16"+
		"G\u0180\13G\3G\5G\u0183\nG\3G\3G\3H\6H\u0188\nH\rH\16H\u0189\3H\3H\4\u011b"+
		"\u0171\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i"+
		"\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087+"+
		"\u0089,\u008b-\u008d.\u008f/\3\2\"\3\2\62;\3\2c|\6\2\62;C\\aac|\3\2C\\"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2\f\f\6\2\13\f\16\17\"\"^^\2\u017b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2"+
		"\7\u0095\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5\3"+
		"\2\2\2\31\u00ab\3\2\2\2\33\u00b0\3\2\2\2\35\u00b5\3\2\2\2\37\u00bb\3\2"+
		"\2\2!\u00be\3\2\2\2#\u00c1\3\2\2\2%\u00c4\3\2\2\2\'\u00cd\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00d9\3\2\2\2-\u00de\3\2\2\2/\u00e3\3\2\2\2\61\u00e9\3\2\2\2"+
		"\63\u00ed\3\2\2\2\65\u00f1\3\2\2\2\67\u00f6\3\2\2\29\u00fa\3\2\2\2;\u0101"+
		"\3\2\2\2=\u0108\3\2\2\2?\u010d\3\2\2\2A\u0117\3\2\2\2C\u0120\3\2\2\2E"+
		"\u0123\3\2\2\2G\u0125\3\2\2\2I\u0127\3\2\2\2K\u0129\3\2\2\2M\u012b\3\2"+
		"\2\2O\u012d\3\2\2\2Q\u0130\3\2\2\2S\u0132\3\2\2\2U\u0134\3\2\2\2W\u0136"+
		"\3\2\2\2Y\u0138\3\2\2\2[\u013a\3\2\2\2]\u013c\3\2\2\2_\u013e\3\2\2\2a"+
		"\u0140\3\2\2\2c\u0142\3\2\2\2e\u0144\3\2\2\2g\u0146\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014a\3\2\2\2m\u014c\3\2\2\2o\u014e\3\2\2\2q\u0150\3\2\2\2s\u0152"+
		"\3\2\2\2u\u0154\3\2\2\2w\u0156\3\2\2\2y\u0158\3\2\2\2{\u015a\3\2\2\2}"+
		"\u015c\3\2\2\2\177\u015e\3\2\2\2\u0081\u0160\3\2\2\2\u0083\u0162\3\2\2"+
		"\2\u0085\u0164\3\2\2\2\u0087\u0166\3\2\2\2\u0089\u0169\3\2\2\2\u008b\u016c"+
		"\3\2\2\2\u008d\u0178\3\2\2\2\u008f\u0187\3\2\2\2\u0091\u0092\7=\2\2\u0092"+
		"\4\3\2\2\2\u0093\u0094\7}\2\2\u0094\6\3\2\2\2\u0095\u0096\7\177\2\2\u0096"+
		"\b\3\2\2\2\u0097\u0098\7*\2\2\u0098\n\3\2\2\2\u0099\u009a\7.\2\2\u009a"+
		"\f\3\2\2\2\u009b\u009c\7+\2\2\u009c\16\3\2\2\2\u009d\u009e\7<\2\2\u009e"+
		"\20\3\2\2\2\u009f\u00a0\7B\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2"+
		"\24\3\2\2\2\u00a3\u00a4\7\u0080\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\5W,\2"+
		"\u00a6\u00a7\5i\65\2\u00a7\u00a8\5S*\2\u00a8\u00a9\5w<\2\u00a9\u00aa\5"+
		"w<\2\u00aa\30\3\2\2\2\u00ab\u00ac\5[.\2\u00ac\u00ad\5i\65\2\u00ad\u00ae"+
		"\5w<\2\u00ae\u00af\5[.\2\u00af\32\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7g\2\2\u00b4\34\3\2\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\5]/\2\u00bc\u00bd\5c\62\2\u00bd"+
		" \3\2\2\2\u00be\u00bf\5c\62\2\u00bf\u00c0\5]/\2\u00c0\"\3\2\2\2\u00c1"+
		"\u00c2\5c\62\2\u00c2\u00c3\5m\67\2\u00c3$\3\2\2\2\u00c4\u00c5\5c\62\2"+
		"\u00c5\u00c6\5m\67\2\u00c6\u00c7\5a\61\2\u00c7\u00c8\5[.\2\u00c8\u00c9"+
		"\5u;\2\u00c9\u00ca\5c\62\2\u00ca\u00cb\5y=\2\u00cb\u00cc\5w<\2\u00cc&"+
		"\3\2\2\2\u00cd\u00ce\5c\62\2\u00ce\u00cf\5w<\2\u00cf\u00d0\5}?\2\u00d0"+
		"\u00d1\5o8\2\u00d1\u00d2\5c\62\2\u00d2\u00d3\5Y-\2\u00d3(\3\2\2\2\u00d4"+
		"\u00d5\5i\65\2\u00d5\u00d6\5o8\2\u00d6\u00d7\5o8\2\u00d7\u00d8\5q9\2\u00d8"+
		"*\3\2\2\2\u00d9\u00da\5q9\2\u00da\u00db\5o8\2\u00db\u00dc\5o8\2\u00dc"+
		"\u00dd\5i\65\2\u00dd,\3\2\2\2\u00de\u00df\5y=\2\u00df\u00e0\5a\61\2\u00e0"+
		"\u00e1\5[.\2\u00e1\u00e2\5m\67\2\u00e2.\3\2\2\2\u00e3\u00e4\5\177@\2\u00e4"+
		"\u00e5\5a\61\2\u00e5\u00e6\5c\62\2\u00e6\u00e7\5i\65\2\u00e7\u00e8\5["+
		".\2\u00e8\60\3\2\2\2\u00e9\u00ea\5m\67\2\u00ea\u00eb\5[.\2\u00eb\u00ec"+
		"\5\177@\2\u00ec\62\3\2\2\2\u00ed\u00ee\5m\67\2\u00ee\u00ef\5o8\2\u00ef"+
		"\u00f0\5y=\2\u00f0\64\3\2\2\2\u00f1\u00f2\5i\65\2\u00f2\u00f3\5[.\2\u00f3"+
		"\u00f4\5y=\2\u00f4\66\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f98\3"+
		"\2\2\2\u00fa\u00fe\t\3\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff:\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0105\t\5\2\2\u0102\u0104\t\4\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"<\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7h\2\2\u010c>\3\2\2\2\u010d\u010e\7U\2\2\u010e"+
		"\u010f\7G\2\2\u010f\u0110\7N\2\2\u0110\u0111\7H\2\2\u0111\u0112\7a\2\2"+
		"\u0112\u0113\7V\2\2\u0113\u0114\7[\2\2\u0114\u0115\7R\2\2\u0115\u0116"+
		"\7G\2\2\u0116@\3\2\2\2\u0117\u011b\7$\2\2\u0118\u011a\13\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7$\2\2\u011fB\3\2\2\2\u0120"+
		"\u0121\7>\2\2\u0121\u0122\7/\2\2\u0122D\3\2\2\2\u0123\u0124\7-\2\2\u0124"+
		"F\3\2\2\2\u0125\u0126\7/\2\2\u0126H\3\2\2\2\u0127\u0128\7,\2\2\u0128J"+
		"\3\2\2\2\u0129\u012a\7\61\2\2\u012aL\3\2\2\2\u012b\u012c\7>\2\2\u012c"+
		"N\3\2\2\2\u012d\u012e\7>\2\2\u012e\u012f\7?\2\2\u012fP\3\2\2\2\u0130\u0131"+
		"\7?\2\2\u0131R\3\2\2\2\u0132\u0133\t\6\2\2\u0133T\3\2\2\2\u0134\u0135"+
		"\t\7\2\2\u0135V\3\2\2\2\u0136\u0137\t\b\2\2\u0137X\3\2\2\2\u0138\u0139"+
		"\t\t\2\2\u0139Z\3\2\2\2\u013a\u013b\t\n\2\2\u013b\\\3\2\2\2\u013c\u013d"+
		"\t\13\2\2\u013d^\3\2\2\2\u013e\u013f\t\f\2\2\u013f`\3\2\2\2\u0140\u0141"+
		"\t\r\2\2\u0141b\3\2\2\2\u0142\u0143\t\16\2\2\u0143d\3\2\2\2\u0144\u0145"+
		"\t\17\2\2\u0145f\3\2\2\2\u0146\u0147\t\20\2\2\u0147h\3\2\2\2\u0148\u0149"+
		"\t\21\2\2\u0149j\3\2\2\2\u014a\u014b\t\22\2\2\u014bl\3\2\2\2\u014c\u014d"+
		"\t\23\2\2\u014dn\3\2\2\2\u014e\u014f\t\24\2\2\u014fp\3\2\2\2\u0150\u0151"+
		"\t\25\2\2\u0151r\3\2\2\2\u0152\u0153\t\26\2\2\u0153t\3\2\2\2\u0154\u0155"+
		"\t\27\2\2\u0155v\3\2\2\2\u0156\u0157\t\30\2\2\u0157x\3\2\2\2\u0158\u0159"+
		"\t\31\2\2\u0159z\3\2\2\2\u015a\u015b\t\32\2\2\u015b|\3\2\2\2\u015c\u015d"+
		"\t\33\2\2\u015d~\3\2\2\2\u015e\u015f\t\34\2\2\u015f\u0080\3\2\2\2\u0160"+
		"\u0161\t\35\2\2\u0161\u0082\3\2\2\2\u0162\u0163\t\36\2\2\u0163\u0084\3"+
		"\2\2\2\u0164\u0165\t\37\2\2\u0165\u0086\3\2\2\2\u0166\u0167\7*\2\2\u0167"+
		"\u0168\7,\2\2\u0168\u0088\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b\7+\2"+
		"\2\u016b\u008a\3\2\2\2\u016c\u0171\5\u0087D\2\u016d\u0170\5\u008bF\2\u016e"+
		"\u0170\13\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\5\u0089E\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\bF\2\2\u0177\u008c\3\2\2\2\u0178\u0179\7/\2\2\u0179\u017a\7/\2\2\u017a"+
		"\u017e\3\2\2\2\u017b\u017d\n \2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0183\7\f\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\bG\2\2\u0185\u008e\3\2\2\2\u0186"+
		"\u0188\t!\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\bH\2\2\u018c"+
		"\u0090\3\2\2\2\16\2\u00f8\u00fc\u00fe\u0103\u0105\u011b\u016f\u0171\u017e"+
		"\u0182\u0189\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}