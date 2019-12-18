// Generated from grammar\Java.g4 by ANTLR 4.7.1
package grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, IntegerLiteral=52, FloatingPointLiteral=53, BooleanLiteral=54, 
		CharacterLiteral=55, StringLiteral=56, NullLiteral=57, LPAREN=58, RPAREN=59, 
		LBRACE=60, RBRACE=61, LBRACK=62, RBRACK=63, SEMI=64, COMMA=65, DOT=66, 
		ASSIGN=67, GT=68, LT=69, BANG=70, TILDE=71, QUESTION=72, COLON=73, EQUAL=74, 
		LE=75, GE=76, NOTEQUAL=77, AND=78, OR=79, INC=80, DEC=81, ADD=82, SUB=83, 
		MUL=84, DIV=85, BITAND=86, BITOR=87, CARET=88, MOD=89, ADD_ASSIGN=90, 
		SUB_ASSIGN=91, MUL_ASSIGN=92, DIV_ASSIGN=93, AND_ASSIGN=94, OR_ASSIGN=95, 
		XOR_ASSIGN=96, MOD_ASSIGN=97, LSHIFT_ASSIGN=98, RSHIFT_ASSIGN=99, URSHIFT_ASSIGN=100, 
		Identifier=101, AT=102, ELLIPSIS=103, WS=104, COMMENT=105, LINE_COMMENT=106;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
		"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 144:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 145:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u043a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\5\65\u028d\n\65\3\66\3\66\5\66\u0291\n\66\3\67\3\67\5\67\u0295\n"+
		"\67\38\38\58\u0299\n8\39\39\59\u029d\n9\3:\3:\3;\3;\3;\5;\u02a4\n;\3;"+
		"\3;\3;\5;\u02a9\n;\5;\u02ab\n;\3<\3<\5<\u02af\n<\3<\5<\u02b2\n<\3=\3="+
		"\5=\u02b6\n=\3>\3>\3?\6?\u02bb\n?\r?\16?\u02bc\3@\3@\5@\u02c1\n@\3A\6"+
		"A\u02c4\nA\rA\16A\u02c5\3B\3B\3B\3B\3C\3C\5C\u02ce\nC\3C\5C\u02d1\nC\3"+
		"D\3D\3E\6E\u02d6\nE\rE\16E\u02d7\3F\3F\5F\u02dc\nF\3G\3G\5G\u02e0\nG\3"+
		"G\3G\3H\3H\5H\u02e6\nH\3H\5H\u02e9\nH\3I\3I\3J\6J\u02ee\nJ\rJ\16J\u02ef"+
		"\3K\3K\5K\u02f4\nK\3L\3L\3L\3L\3M\3M\5M\u02fc\nM\3M\5M\u02ff\nM\3N\3N"+
		"\3O\6O\u0304\nO\rO\16O\u0305\3P\3P\5P\u030a\nP\3Q\3Q\5Q\u030e\nQ\3R\3"+
		"R\3R\5R\u0313\nR\3R\5R\u0316\nR\3R\5R\u0319\nR\3R\3R\3R\5R\u031e\nR\3"+
		"R\5R\u0321\nR\3R\3R\3R\5R\u0326\nR\3R\3R\3R\5R\u032b\nR\3S\3S\3S\3T\3"+
		"T\3U\5U\u0333\nU\3U\3U\3V\3V\3W\3W\3X\3X\3X\5X\u033e\nX\3Y\3Y\5Y\u0342"+
		"\nY\3Y\3Y\3Y\5Y\u0347\nY\3Y\3Y\5Y\u034b\nY\3Z\3Z\3Z\3[\3[\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u035b\n\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0365"+
		"\n]\3^\3^\3_\3_\5_\u036b\n_\3_\3_\3`\6`\u0370\n`\r`\16`\u0371\3a\3a\5"+
		"a\u0376\na\3b\3b\3b\5b\u037b\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0388"+
		"\nc\3d\3d\3e\3e\3e\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m"+
		"\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3w\3w\3w"+
		"\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\7\u0091\u0400\n\u0091"+
		"\f\u0091\16\u0091\u0403\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u040b\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u0413\n\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\6\u0096\u041c\n\u0096\r\u0096\16\u0096\u041d\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u0426\n\u0097\f\u0097"+
		"\16\u0097\u0429\13\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\7\u0098\u0434\n\u0098\f\u0098\16\u0098\u0437"+
		"\13\u0098\3\u0098\3\u0098\3\u0427\2\u0099\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\67\u00a3"+
		"\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b78\u00b99\u00bb\2\u00bd:\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7"+
		"\2\u00c9;\u00cb<\u00cd=\u00cf>\u00d1?\u00d3@\u00d5A\u00d7B\u00d9C\u00db"+
		"D\u00ddE\u00dfF\u00e1G\u00e3H\u00e5I\u00e7J\u00e9K\u00ebL\u00edM\u00ef"+
		"N\u00f1O\u00f3P\u00f5Q\u00f7R\u00f9S\u00fbT\u00fdU\u00ffV\u0101W\u0103"+
		"X\u0105Y\u0107Z\u0109[\u010b\\\u010d]\u010f^\u0111_\u0113`\u0115a\u0117"+
		"b\u0119c\u011bd\u011de\u011ff\u0121g\u0123\2\u0125\2\u0127h\u0129i\u012b"+
		"j\u012dk\u012fl\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2"+
		"DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\2\u0448\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2\u00a1\3"+
		"\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bd\3\2\2\2\2\u00c9\3\2\2\2"+
		"\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7"+
		"\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109"+
		"\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b"+
		"\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0127\3\2\2"+
		"\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\3\u0131"+
		"\3\2\2\2\5\u0135\3\2\2\2\7\u013e\3\2\2\2\t\u0145\3\2\2\2\13\u014d\3\2"+
		"\2\2\r\u0153\3\2\2\2\17\u0158\3\2\2\2\21\u015d\3\2\2\2\23\u0163\3\2\2"+
		"\2\25\u0168\3\2\2\2\27\u016e\3\2\2\2\31\u0174\3\2\2\2\33\u017d\3\2\2\2"+
		"\35\u0185\3\2\2\2\37\u0188\3\2\2\2!\u018f\3\2\2\2#\u0194\3\2\2\2%\u0199"+
		"\3\2\2\2\'\u01a1\3\2\2\2)\u01a7\3\2\2\2+\u01af\3\2\2\2-\u01b5\3\2\2\2"+
		"/\u01b9\3\2\2\2\61\u01bc\3\2\2\2\63\u01c1\3\2\2\2\65\u01cc\3\2\2\2\67"+
		"\u01d3\3\2\2\29\u01de\3\2\2\2;\u01e2\3\2\2\2=\u01ec\3\2\2\2?\u01f1\3\2"+
		"\2\2A\u01f8\3\2\2\2C\u01fc\3\2\2\2E\u0204\3\2\2\2G\u020c\3\2\2\2I\u0216"+
		"\3\2\2\2K\u021d\3\2\2\2M\u0224\3\2\2\2O\u022a\3\2\2\2Q\u0231\3\2\2\2S"+
		"\u023a\3\2\2\2U\u0240\3\2\2\2W\u0247\3\2\2\2Y\u0254\3\2\2\2[\u0259\3\2"+
		"\2\2]\u025f\3\2\2\2_\u0266\3\2\2\2a\u0270\3\2\2\2c\u0274\3\2\2\2e\u0279"+
		"\3\2\2\2g\u0282\3\2\2\2i\u028c\3\2\2\2k\u028e\3\2\2\2m\u0292\3\2\2\2o"+
		"\u0296\3\2\2\2q\u029a\3\2\2\2s\u029e\3\2\2\2u\u02aa\3\2\2\2w\u02ac\3\2"+
		"\2\2y\u02b5\3\2\2\2{\u02b7\3\2\2\2}\u02ba\3\2\2\2\177\u02c0\3\2\2\2\u0081"+
		"\u02c3\3\2\2\2\u0083\u02c7\3\2\2\2\u0085\u02cb\3\2\2\2\u0087\u02d2\3\2"+
		"\2\2\u0089\u02d5\3\2\2\2\u008b\u02db\3\2\2\2\u008d\u02dd\3\2\2\2\u008f"+
		"\u02e3\3\2\2\2\u0091\u02ea\3\2\2\2\u0093\u02ed\3\2\2\2\u0095\u02f3\3\2"+
		"\2\2\u0097\u02f5\3\2\2\2\u0099\u02f9\3\2\2\2\u009b\u0300\3\2\2\2\u009d"+
		"\u0303\3\2\2\2\u009f\u0309\3\2\2\2\u00a1\u030d\3\2\2\2\u00a3\u032a\3\2"+
		"\2\2\u00a5\u032c\3\2\2\2\u00a7\u032f\3\2\2\2\u00a9\u0332\3\2\2\2\u00ab"+
		"\u0336\3\2\2\2\u00ad\u0338\3\2\2\2\u00af\u033a\3\2\2\2\u00b1\u034a\3\2"+
		"\2\2\u00b3\u034c\3\2\2\2\u00b5\u034f\3\2\2\2\u00b7\u035a\3\2\2\2\u00b9"+
		"\u0364\3\2\2\2\u00bb\u0366\3\2\2\2\u00bd\u0368\3\2\2\2\u00bf\u036f\3\2"+
		"\2\2\u00c1\u0375\3\2\2\2\u00c3\u037a\3\2\2\2\u00c5\u0387\3\2\2\2\u00c7"+
		"\u0389\3\2\2\2\u00c9\u038b\3\2\2\2\u00cb\u0390\3\2\2\2\u00cd\u0392\3\2"+
		"\2\2\u00cf\u0394\3\2\2\2\u00d1\u0396\3\2\2\2\u00d3\u0398\3\2\2\2\u00d5"+
		"\u039a\3\2\2\2\u00d7\u039c\3\2\2\2\u00d9\u039e\3\2\2\2\u00db\u03a0\3\2"+
		"\2\2\u00dd\u03a2\3\2\2\2\u00df\u03a4\3\2\2\2\u00e1\u03a6\3\2\2\2\u00e3"+
		"\u03a8\3\2\2\2\u00e5\u03aa\3\2\2\2\u00e7\u03ac\3\2\2\2\u00e9\u03ae\3\2"+
		"\2\2\u00eb\u03b0\3\2\2\2\u00ed\u03b3\3\2\2\2\u00ef\u03b6\3\2\2\2\u00f1"+
		"\u03b9\3\2\2\2\u00f3\u03bc\3\2\2\2\u00f5\u03bf\3\2\2\2\u00f7\u03c2\3\2"+
		"\2\2\u00f9\u03c5\3\2\2\2\u00fb\u03c8\3\2\2\2\u00fd\u03ca\3\2\2\2\u00ff"+
		"\u03cc\3\2\2\2\u0101\u03ce\3\2\2\2\u0103\u03d0\3\2\2\2\u0105\u03d2\3\2"+
		"\2\2\u0107\u03d4\3\2\2\2\u0109\u03d6\3\2\2\2\u010b\u03d8\3\2\2\2\u010d"+
		"\u03db\3\2\2\2\u010f\u03de\3\2\2\2\u0111\u03e1\3\2\2\2\u0113\u03e4\3\2"+
		"\2\2\u0115\u03e7\3\2\2\2\u0117\u03ea\3\2\2\2\u0119\u03ed\3\2\2\2\u011b"+
		"\u03f0\3\2\2\2\u011d\u03f4\3\2\2\2\u011f\u03f8\3\2\2\2\u0121\u03fd\3\2"+
		"\2\2\u0123\u040a\3\2\2\2\u0125\u0412\3\2\2\2\u0127\u0414\3\2\2\2\u0129"+
		"\u0416\3\2\2\2\u012b\u041b\3\2\2\2\u012d\u0421\3\2\2\2\u012f\u042f\3\2"+
		"\2\2\u0131\u0132\7x\2\2\u0132\u0133\7c\2\2\u0133\u0134\7t\2\2\u0134\4"+
		"\3\2\2\2\u0135\u0136\7c\2\2\u0136\u0137\7d\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7c\2\2\u013b\u013c\7e\2\2"+
		"\u013c\u013d\7v\2\2\u013d\6\3\2\2\2\u013e\u013f\7c\2\2\u013f\u0140\7u"+
		"\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143\u0144"+
		"\7v\2\2\u0144\b\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147\7q\2\2\u0147\u0148"+
		"\7q\2\2\u0148\u0149\7n\2\2\u0149\u014a\7g\2\2\u014a\u014b\7c\2\2\u014b"+
		"\u014c\7p\2\2\u014c\n\3\2\2\2\u014d\u014e\7d\2\2\u014e\u014f\7t\2\2\u014f"+
		"\u0150\7g\2\2\u0150\u0151\7c\2\2\u0151\u0152\7m\2\2\u0152\f\3\2\2\2\u0153"+
		"\u0154\7d\2\2\u0154\u0155\7{\2\2\u0155\u0156\7v\2\2\u0156\u0157\7g\2\2"+
		"\u0157\16\3\2\2\2\u0158\u0159\7e\2\2\u0159\u015a\7c\2\2\u015a\u015b\7"+
		"u\2\2\u015b\u015c\7g\2\2\u015c\20\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f"+
		"\7c\2\2\u015f\u0160\7v\2\2\u0160\u0161\7e\2\2\u0161\u0162\7j\2\2\u0162"+
		"\22\3\2\2\2\u0163\u0164\7e\2\2\u0164\u0165\7j\2\2\u0165\u0166\7c\2\2\u0166"+
		"\u0167\7t\2\2\u0167\24\3\2\2\2\u0168\u0169\7e\2\2\u0169\u016a\7n\2\2\u016a"+
		"\u016b\7c\2\2\u016b\u016c\7u\2\2\u016c\u016d\7u\2\2\u016d\26\3\2\2\2\u016e"+
		"\u016f\7e\2\2\u016f\u0170\7q\2\2\u0170\u0171\7p\2\2\u0171\u0172\7u\2\2"+
		"\u0172\u0173\7v\2\2\u0173\30\3\2\2\2\u0174\u0175\7e\2\2\u0175\u0176\7"+
		"q\2\2\u0176\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178\u0179\7k\2\2\u0179\u017a"+
		"\7p\2\2\u017a\u017b\7w\2\2\u017b\u017c\7g\2\2\u017c\32\3\2\2\2\u017d\u017e"+
		"\7f\2\2\u017e\u017f\7g\2\2\u017f\u0180\7h\2\2\u0180\u0181\7c\2\2\u0181"+
		"\u0182\7w\2\2\u0182\u0183\7n\2\2\u0183\u0184\7v\2\2\u0184\34\3\2\2\2\u0185"+
		"\u0186\7f\2\2\u0186\u0187\7q\2\2\u0187\36\3\2\2\2\u0188\u0189\7f\2\2\u0189"+
		"\u018a\7q\2\2\u018a\u018b\7w\2\2\u018b\u018c\7d\2\2\u018c\u018d\7n\2\2"+
		"\u018d\u018e\7g\2\2\u018e \3\2\2\2\u018f\u0190\7g\2\2\u0190\u0191\7n\2"+
		"\2\u0191\u0192\7u\2\2\u0192\u0193\7g\2\2\u0193\"\3\2\2\2\u0194\u0195\7"+
		"g\2\2\u0195\u0196\7p\2\2\u0196\u0197\7w\2\2\u0197\u0198\7o\2\2\u0198$"+
		"\3\2\2\2\u0199\u019a\7g\2\2\u019a\u019b\7z\2\2\u019b\u019c\7v\2\2\u019c"+
		"\u019d\7g\2\2\u019d\u019e\7p\2\2\u019e\u019f\7f\2\2\u019f\u01a0\7u\2\2"+
		"\u01a0&\3\2\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4\7p\2"+
		"\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7n\2\2\u01a6(\3\2\2\2\u01a7\u01a8\7"+
		"h\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac"+
		"\7n\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7{\2\2\u01ae*\3\2\2\2\u01af\u01b0"+
		"\7h\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7c\2\2\u01b3"+
		"\u01b4\7v\2\2\u01b4,\3\2\2\2\u01b5\u01b6\7h\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01b8\7t\2\2\u01b8.\3\2\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7h\2\2\u01bb"+
		"\60\3\2\2\2\u01bc\u01bd\7i\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7v\2\2\u01bf"+
		"\u01c0\7q\2\2\u01c0\62\3\2\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7o\2\2\u01c3"+
		"\u01c4\7r\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7o\2\2"+
		"\u01c7\u01c8\7g\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb"+
		"\7u\2\2\u01cb\64\3\2\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7o\2\2\u01ce\u01cf"+
		"\7r\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7t\2\2\u01d1\u01d2\7v\2\2\u01d2"+
		"\66\3\2\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7u\2\2\u01d6"+
		"\u01d7\7v\2\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7e\2\2"+
		"\u01da\u01db\7g\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7h\2\2\u01dd8\3\2\2"+
		"\2\u01de\u01df\7k\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7v\2\2\u01e1:\3\2"+
		"\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6"+
		"\7g\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8\7h\2\2\u01e8\u01e9\7c\2\2\u01e9"+
		"\u01ea\7e\2\2\u01ea\u01eb\7g\2\2\u01eb<\3\2\2\2\u01ec\u01ed\7n\2\2\u01ed"+
		"\u01ee\7q\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7i\2\2\u01f0>\3\2\2\2\u01f1"+
		"\u01f2\7p\2\2\u01f2\u01f3\7c\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7k\2\2"+
		"\u01f5\u01f6\7x\2\2\u01f6\u01f7\7g\2\2\u01f7@\3\2\2\2\u01f8\u01f9\7p\2"+
		"\2\u01f9\u01fa\7g\2\2\u01fa\u01fb\7y\2\2\u01fbB\3\2\2\2\u01fc\u01fd\7"+
		"r\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7e\2\2\u01ff\u0200\7m\2\2\u0200\u0201"+
		"\7c\2\2\u0201\u0202\7i\2\2\u0202\u0203\7g\2\2\u0203D\3\2\2\2\u0204\u0205"+
		"\7r\2\2\u0205\u0206\7t\2\2\u0206\u0207\7k\2\2\u0207\u0208\7x\2\2\u0208"+
		"\u0209\7c\2\2\u0209\u020a\7v\2\2\u020a\u020b\7g\2\2\u020bF\3\2\2\2\u020c"+
		"\u020d\7r\2\2\u020d\u020e\7t\2\2\u020e\u020f\7q\2\2\u020f\u0210\7v\2\2"+
		"\u0210\u0211\7g\2\2\u0211\u0212\7e\2\2\u0212\u0213\7v\2\2\u0213\u0214"+
		"\7g\2\2\u0214\u0215\7f\2\2\u0215H\3\2\2\2\u0216\u0217\7r\2\2\u0217\u0218"+
		"\7w\2\2\u0218\u0219\7d\2\2\u0219\u021a\7n\2\2\u021a\u021b\7k\2\2\u021b"+
		"\u021c\7e\2\2\u021cJ\3\2\2\2\u021d\u021e\7t\2\2\u021e\u021f\7g\2\2\u021f"+
		"\u0220\7v\2\2\u0220\u0221\7w\2\2\u0221\u0222\7t\2\2\u0222\u0223\7p\2\2"+
		"\u0223L\3\2\2\2\u0224\u0225\7u\2\2\u0225\u0226\7j\2\2\u0226\u0227\7q\2"+
		"\2\u0227\u0228\7t\2\2\u0228\u0229\7v\2\2\u0229N\3\2\2\2\u022a\u022b\7"+
		"u\2\2\u022b\u022c\7v\2\2\u022c\u022d\7c\2\2\u022d\u022e\7v\2\2\u022e\u022f"+
		"\7k\2\2\u022f\u0230\7e\2\2\u0230P\3\2\2\2\u0231\u0232\7u\2\2\u0232\u0233"+
		"\7v\2\2\u0233\u0234\7t\2\2\u0234\u0235\7k\2\2\u0235\u0236\7e\2\2\u0236"+
		"\u0237\7v\2\2\u0237\u0238\7h\2\2\u0238\u0239\7r\2\2\u0239R\3\2\2\2\u023a"+
		"\u023b\7u\2\2\u023b\u023c\7w\2\2\u023c\u023d\7r\2\2\u023d\u023e\7g\2\2"+
		"\u023e\u023f\7t\2\2\u023fT\3\2\2\2\u0240\u0241\7u\2\2\u0241\u0242\7y\2"+
		"\2\u0242\u0243\7k\2\2\u0243\u0244\7v\2\2\u0244\u0245\7e\2\2\u0245\u0246"+
		"\7j\2\2\u0246V\3\2\2\2\u0247\u0248\7u\2\2\u0248\u0249\7{\2\2\u0249\u024a"+
		"\7p\2\2\u024a\u024b\7e\2\2\u024b\u024c\7j\2\2\u024c\u024d\7t\2\2\u024d"+
		"\u024e\7q\2\2\u024e\u024f\7p\2\2\u024f\u0250\7k\2\2\u0250\u0251\7|\2\2"+
		"\u0251\u0252\7g\2\2\u0252\u0253\7f\2\2\u0253X\3\2\2\2\u0254\u0255\7v\2"+
		"\2\u0255\u0256\7j\2\2\u0256\u0257\7k\2\2\u0257\u0258\7u\2\2\u0258Z\3\2"+
		"\2\2\u0259\u025a\7v\2\2\u025a\u025b\7j\2\2\u025b\u025c\7t\2\2\u025c\u025d"+
		"\7q\2\2\u025d\u025e\7y\2\2\u025e\\\3\2\2\2\u025f\u0260\7v\2\2\u0260\u0261"+
		"\7j\2\2\u0261\u0262\7t\2\2\u0262\u0263\7q\2\2\u0263\u0264\7y\2\2\u0264"+
		"\u0265\7u\2\2\u0265^\3\2\2\2\u0266\u0267\7v\2\2\u0267\u0268\7t\2\2\u0268"+
		"\u0269\7c\2\2\u0269\u026a\7p\2\2\u026a\u026b\7u\2\2\u026b\u026c\7k\2\2"+
		"\u026c\u026d\7g\2\2\u026d\u026e\7p\2\2\u026e\u026f\7v\2\2\u026f`\3\2\2"+
		"\2\u0270\u0271\7v\2\2\u0271\u0272\7t\2\2\u0272\u0273\7{\2\2\u0273b\3\2"+
		"\2\2\u0274\u0275\7x\2\2\u0275\u0276\7q\2\2\u0276\u0277\7k\2\2\u0277\u0278"+
		"\7f\2\2\u0278d\3\2\2\2\u0279\u027a\7x\2\2\u027a\u027b\7q\2\2\u027b\u027c"+
		"\7n\2\2\u027c\u027d\7c\2\2\u027d\u027e\7v\2\2\u027e\u027f\7k\2\2\u027f"+
		"\u0280\7n\2\2\u0280\u0281\7g\2\2\u0281f\3\2\2\2\u0282\u0283\7y\2\2\u0283"+
		"\u0284\7j\2\2\u0284\u0285\7k\2\2\u0285\u0286\7n\2\2\u0286\u0287\7g\2\2"+
		"\u0287h\3\2\2\2\u0288\u028d\5k\66\2\u0289\u028d\5m\67\2\u028a\u028d\5"+
		"o8\2\u028b\u028d\5q9\2\u028c\u0288\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028a"+
		"\3\2\2\2\u028c\u028b\3\2\2\2\u028dj\3\2\2\2\u028e\u0290\5u;\2\u028f\u0291"+
		"\5s:\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291l\3\2\2\2\u0292\u0294"+
		"\5\u0083B\2\u0293\u0295\5s:\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295n\3\2\2\2\u0296\u0298\5\u008dG\2\u0297\u0299\5s:\2\u0298\u0297\3"+
		"\2\2\2\u0298\u0299\3\2\2\2\u0299p\3\2\2\2\u029a\u029c\5\u0097L\2\u029b"+
		"\u029d\5s:\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029dr\3\2\2\2\u029e"+
		"\u029f\t\2\2\2\u029ft\3\2\2\2\u02a0\u02ab\7\62\2\2\u02a1\u02a8\5{>\2\u02a2"+
		"\u02a4\5w<\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a9\3\2\2"+
		"\2\u02a5\u02a6\5\u0081A\2\u02a6\u02a7\5w<\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02a3\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a0\3\2"+
		"\2\2\u02aa\u02a1\3\2\2\2\u02abv\3\2\2\2\u02ac\u02b1\5y=\2\u02ad\u02af"+
		"\5}?\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b2\5y=\2\u02b1\u02ae\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2x\3\2\2\2\u02b3"+
		"\u02b6\7\62\2\2\u02b4\u02b6\5{>\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2"+
		"\2\2\u02b6z\3\2\2\2\u02b7\u02b8\t\3\2\2\u02b8|\3\2\2\2\u02b9\u02bb\5\177"+
		"@\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd~\3\2\2\2\u02be\u02c1\5y=\2\u02bf\u02c1\7a\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u0080\3\2\2\2\u02c2\u02c4\7a"+
		"\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u0082\3\2\2\2\u02c7\u02c8\7\62\2\2\u02c8\u02c9\t"+
		"\4\2\2\u02c9\u02ca\5\u0085C\2\u02ca\u0084\3\2\2\2\u02cb\u02d0\5\u0087"+
		"D\2\u02cc\u02ce\5\u0089E\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d1\5\u0087D\2\u02d0\u02cd\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u0086\3\2\2\2\u02d2\u02d3\t\5\2\2\u02d3\u0088\3\2\2\2\u02d4"+
		"\u02d6\5\u008bF\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u008a\3\2\2\2\u02d9\u02dc\5\u0087D"+
		"\2\u02da\u02dc\7a\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u008c"+
		"\3\2\2\2\u02dd\u02df\7\62\2\2\u02de\u02e0\5\u0081A\2\u02df\u02de\3\2\2"+
		"\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\5\u008fH\2\u02e2"+
		"\u008e\3\2\2\2\u02e3\u02e8\5\u0091I\2\u02e4\u02e6\5\u0093J\2\u02e5\u02e4"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\5\u0091I"+
		"\2\u02e8\u02e5\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u0090\3\2\2\2\u02ea\u02eb"+
		"\t\6\2\2\u02eb\u0092\3\2\2\2\u02ec\u02ee\5\u0095K\2\u02ed\u02ec\3\2\2"+
		"\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0094"+
		"\3\2\2\2\u02f1\u02f4\5\u0091I\2\u02f2\u02f4\7a\2\2\u02f3\u02f1\3\2\2\2"+
		"\u02f3\u02f2\3\2\2\2\u02f4\u0096\3\2\2\2\u02f5\u02f6\7\62\2\2\u02f6\u02f7"+
		"\t\7\2\2\u02f7\u02f8\5\u0099M\2\u02f8\u0098\3\2\2\2\u02f9\u02fe\5\u009b"+
		"N\2\u02fa\u02fc\5\u009dO\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02ff\5\u009bN\2\u02fe\u02fb\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u009a\3\2\2\2\u0300\u0301\t\b\2\2\u0301\u009c\3\2\2\2\u0302"+
		"\u0304\5\u009fP\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u009e\3\2\2\2\u0307\u030a\5\u009bN"+
		"\2\u0308\u030a\7a\2\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u00a0"+
		"\3\2\2\2\u030b\u030e\5\u00a3R\2\u030c\u030e\5\u00afX\2\u030d\u030b\3\2"+
		"\2\2\u030d\u030c\3\2\2\2\u030e\u00a2\3\2\2\2\u030f\u0310\5w<\2\u0310\u0312"+
		"\7\60\2\2\u0311\u0313\5w<\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0315\3\2\2\2\u0314\u0316\5\u00a5S\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0319\5\u00adW\2\u0318\u0317\3\2\2"+
		"\2\u0318\u0319\3\2\2\2\u0319\u032b\3\2\2\2\u031a\u031b\7\60\2\2\u031b"+
		"\u031d\5w<\2\u031c\u031e\5\u00a5S\2\u031d\u031c\3\2\2\2\u031d\u031e\3"+
		"\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321\5\u00adW\2\u0320\u031f\3\2\2\2"+
		"\u0320\u0321\3\2\2\2\u0321\u032b\3\2\2\2\u0322\u0323\5w<\2\u0323\u0325"+
		"\5\u00a5S\2\u0324\u0326\5\u00adW\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2"+
		"\2\2\u0326\u032b\3\2\2\2\u0327\u0328\5w<\2\u0328\u0329\5\u00adW\2\u0329"+
		"\u032b\3\2\2\2\u032a\u030f\3\2\2\2\u032a\u031a\3\2\2\2\u032a\u0322\3\2"+
		"\2\2\u032a\u0327\3\2\2\2\u032b\u00a4\3\2\2\2\u032c\u032d\5\u00a7T\2\u032d"+
		"\u032e\5\u00a9U\2\u032e\u00a6\3\2\2\2\u032f\u0330\t\t\2\2\u0330\u00a8"+
		"\3\2\2\2\u0331\u0333\5\u00abV\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2"+
		"\2\u0333\u0334\3\2\2\2\u0334\u0335\5w<\2\u0335\u00aa\3\2\2\2\u0336\u0337"+
		"\t\n\2\2\u0337\u00ac\3\2\2\2\u0338\u0339\t\13\2\2\u0339\u00ae\3\2\2\2"+
		"\u033a\u033b\5\u00b1Y\2\u033b\u033d\5\u00b3Z\2\u033c\u033e\5\u00adW\2"+
		"\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u00b0\3\2\2\2\u033f\u0341"+
		"\5\u0083B\2\u0340\u0342\7\60\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2"+
		"\2\u0342\u034b\3\2\2\2\u0343\u0344\7\62\2\2\u0344\u0346\t\4\2\2\u0345"+
		"\u0347\5\u0085C\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0349\7\60\2\2\u0349\u034b\5\u0085C\2\u034a\u033f\3\2\2"+
		"\2\u034a\u0343\3\2\2\2\u034b\u00b2\3\2\2\2\u034c\u034d\5\u00b5[\2\u034d"+
		"\u034e\5\u00a9U\2\u034e\u00b4\3\2\2\2\u034f\u0350\t\f\2\2\u0350\u00b6"+
		"\3\2\2\2\u0351\u0352\7v\2\2\u0352\u0353\7t\2\2\u0353\u0354\7w\2\2\u0354"+
		"\u035b\7g\2\2\u0355\u0356\7h\2\2\u0356\u0357\7c\2\2\u0357\u0358\7n\2\2"+
		"\u0358\u0359\7u\2\2\u0359\u035b\7g\2\2\u035a\u0351\3\2\2\2\u035a\u0355"+
		"\3\2\2\2\u035b\u00b8\3\2\2\2\u035c\u035d\7)\2\2\u035d\u035e\5\u00bb^\2"+
		"\u035e\u035f\7)\2\2\u035f\u0365\3\2\2\2\u0360\u0361\7)\2\2\u0361\u0362"+
		"\5\u00c3b\2\u0362\u0363\7)\2\2\u0363\u0365\3\2\2\2\u0364\u035c\3\2\2\2"+
		"\u0364\u0360\3\2\2\2\u0365\u00ba\3\2\2\2\u0366\u0367\n\r\2\2\u0367\u00bc"+
		"\3\2\2\2\u0368\u036a\7$\2\2\u0369\u036b\5\u00bf`\2\u036a\u0369\3\2\2\2"+
		"\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7$\2\2\u036d\u00be"+
		"\3\2\2\2\u036e\u0370\5\u00c1a\2\u036f\u036e\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u00c0\3\2\2\2\u0373\u0376"+
		"\n\16\2\2\u0374\u0376\5\u00c3b\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2"+
		"\2\u0376\u00c2\3\2\2\2\u0377\u0378\7^\2\2\u0378\u037b\t\17\2\2\u0379\u037b"+
		"\5\u00c5c\2\u037a\u0377\3\2\2\2\u037a\u0379\3\2\2\2\u037b\u00c4\3\2\2"+
		"\2\u037c\u037d\7^\2\2\u037d\u0388\5\u0091I\2\u037e\u037f\7^\2\2\u037f"+
		"\u0380\5\u0091I\2\u0380\u0381\5\u0091I\2\u0381\u0388\3\2\2\2\u0382\u0383"+
		"\7^\2\2\u0383\u0384\5\u00c7d\2\u0384\u0385\5\u0091I\2\u0385\u0386\5\u0091"+
		"I\2\u0386\u0388\3\2\2\2\u0387\u037c\3\2\2\2\u0387\u037e\3\2\2\2\u0387"+
		"\u0382\3\2\2\2\u0388\u00c6\3\2\2\2\u0389\u038a\t\20\2\2\u038a\u00c8\3"+
		"\2\2\2\u038b\u038c\7p\2\2\u038c\u038d\7w\2\2\u038d\u038e\7n\2\2\u038e"+
		"\u038f\7n\2\2\u038f\u00ca\3\2\2\2\u0390\u0391\7*\2\2\u0391\u00cc\3\2\2"+
		"\2\u0392\u0393\7+\2\2\u0393\u00ce\3\2\2\2\u0394\u0395\7}\2\2\u0395\u00d0"+
		"\3\2\2\2\u0396\u0397\7\177\2\2\u0397\u00d2\3\2\2\2\u0398\u0399\7]\2\2"+
		"\u0399\u00d4\3\2\2\2\u039a\u039b\7_\2\2\u039b\u00d6\3\2\2\2\u039c\u039d"+
		"\7=\2\2\u039d\u00d8\3\2\2\2\u039e\u039f\7.\2\2\u039f\u00da\3\2\2\2\u03a0"+
		"\u03a1\7\60\2\2\u03a1\u00dc\3\2\2\2\u03a2\u03a3\7?\2\2\u03a3\u00de\3\2"+
		"\2\2\u03a4\u03a5\7@\2\2\u03a5\u00e0\3\2\2\2\u03a6\u03a7\7>\2\2\u03a7\u00e2"+
		"\3\2\2\2\u03a8\u03a9\7#\2\2\u03a9\u00e4\3\2\2\2\u03aa\u03ab\7\u0080\2"+
		"\2\u03ab\u00e6\3\2\2\2\u03ac\u03ad\7A\2\2\u03ad\u00e8\3\2\2\2\u03ae\u03af"+
		"\7<\2\2\u03af\u00ea\3\2\2\2\u03b0\u03b1\7?\2\2\u03b1\u03b2\7?\2\2\u03b2"+
		"\u00ec\3\2\2\2\u03b3\u03b4\7>\2\2\u03b4\u03b5\7?\2\2\u03b5\u00ee\3\2\2"+
		"\2\u03b6\u03b7\7@\2\2\u03b7\u03b8\7?\2\2\u03b8\u00f0\3\2\2\2\u03b9\u03ba"+
		"\7#\2\2\u03ba\u03bb\7?\2\2\u03bb\u00f2\3\2\2\2\u03bc\u03bd\7(\2\2\u03bd"+
		"\u03be\7(\2\2\u03be\u00f4\3\2\2\2\u03bf\u03c0\7~\2\2\u03c0\u03c1\7~\2"+
		"\2\u03c1\u00f6\3\2\2\2\u03c2\u03c3\7-\2\2\u03c3\u03c4\7-\2\2\u03c4\u00f8"+
		"\3\2\2\2\u03c5\u03c6\7/\2\2\u03c6\u03c7\7/\2\2\u03c7\u00fa\3\2\2\2\u03c8"+
		"\u03c9\7-\2\2\u03c9\u00fc\3\2\2\2\u03ca\u03cb\7/\2\2\u03cb\u00fe\3\2\2"+
		"\2\u03cc\u03cd\7,\2\2\u03cd\u0100\3\2\2\2\u03ce\u03cf\7\61\2\2\u03cf\u0102"+
		"\3\2\2\2\u03d0\u03d1\7(\2\2\u03d1\u0104\3\2\2\2\u03d2\u03d3\7~\2\2\u03d3"+
		"\u0106\3\2\2\2\u03d4\u03d5\7`\2\2\u03d5\u0108\3\2\2\2\u03d6\u03d7\7\'"+
		"\2\2\u03d7\u010a\3\2\2\2\u03d8\u03d9\7-\2\2\u03d9\u03da\7?\2\2\u03da\u010c"+
		"\3\2\2\2\u03db\u03dc\7/\2\2\u03dc\u03dd\7?\2\2\u03dd\u010e\3\2\2\2\u03de"+
		"\u03df\7,\2\2\u03df\u03e0\7?\2\2\u03e0\u0110\3\2\2\2\u03e1\u03e2\7\61"+
		"\2\2\u03e2\u03e3\7?\2\2\u03e3\u0112\3\2\2\2\u03e4\u03e5\7(\2\2\u03e5\u03e6"+
		"\7?\2\2\u03e6\u0114\3\2\2\2\u03e7\u03e8\7~\2\2\u03e8\u03e9\7?\2\2\u03e9"+
		"\u0116\3\2\2\2\u03ea\u03eb\7`\2\2\u03eb\u03ec\7?\2\2\u03ec\u0118\3\2\2"+
		"\2\u03ed\u03ee\7\'\2\2\u03ee\u03ef\7?\2\2\u03ef\u011a\3\2\2\2\u03f0\u03f1"+
		"\7>\2\2\u03f1\u03f2\7>\2\2\u03f2\u03f3\7?\2\2\u03f3\u011c\3\2\2\2\u03f4"+
		"\u03f5\7@\2\2\u03f5\u03f6\7@\2\2\u03f6\u03f7\7?\2\2\u03f7\u011e\3\2\2"+
		"\2\u03f8\u03f9\7@\2\2\u03f9\u03fa\7@\2\2\u03fa\u03fb\7@\2\2\u03fb\u03fc"+
		"\7?\2\2\u03fc\u0120\3\2\2\2\u03fd\u0401\5\u0123\u0092\2\u03fe\u0400\5"+
		"\u0125\u0093\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2"+
		"\2\2\u0401\u0402\3\2\2\2\u0402\u0122\3\2\2\2\u0403\u0401\3\2\2\2\u0404"+
		"\u040b\t\21\2\2\u0405\u0406\n\22\2\2\u0406\u040b\6\u0092\2\2\u0407\u0408"+
		"\t\23\2\2\u0408\u0409\t\24\2\2\u0409\u040b\6\u0092\3\2\u040a\u0404\3\2"+
		"\2\2\u040a\u0405\3\2\2\2\u040a\u0407\3\2\2\2\u040b\u0124\3\2\2\2\u040c"+
		"\u0413\t\25\2\2\u040d\u040e\n\22\2\2\u040e\u0413\6\u0093\4\2\u040f\u0410"+
		"\t\23\2\2\u0410\u0411\t\24\2\2\u0411\u0413\6\u0093\5\2\u0412\u040c\3\2"+
		"\2\2\u0412\u040d\3\2\2\2\u0412\u040f\3\2\2\2\u0413\u0126\3\2\2\2\u0414"+
		"\u0415\7B\2\2\u0415\u0128\3\2\2\2\u0416\u0417\7\60\2\2\u0417\u0418\7\60"+
		"\2\2\u0418\u0419\7\60\2\2\u0419\u012a\3\2\2\2\u041a\u041c\t\26\2\2\u041b"+
		"\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2"+
		"\2\2\u041e\u041f\3\2\2\2\u041f\u0420\b\u0096\2\2\u0420\u012c\3\2\2\2\u0421"+
		"\u0422\7\61\2\2\u0422\u0423\7,\2\2\u0423\u0427\3\2\2\2\u0424\u0426\13"+
		"\2\2\2\u0425\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0428\3\2\2\2\u0427"+
		"\u0425\3\2\2\2\u0428\u042a\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042b\7,"+
		"\2\2\u042b\u042c\7\61\2\2\u042c\u042d\3\2\2\2\u042d\u042e\b\u0097\2\2"+
		"\u042e\u012e\3\2\2\2\u042f\u0430\7\61\2\2\u0430\u0431\7\61\2\2\u0431\u0435"+
		"\3\2\2\2\u0432\u0434\n\27\2\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2\2\2"+
		"\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0435"+
		"\3\2\2\2\u0438\u0439\b\u0098\2\2\u0439\u0130\3\2\2\28\2\u028c\u0290\u0294"+
		"\u0298\u029c\u02a3\u02a8\u02aa\u02ae\u02b1\u02b5\u02bc\u02c0\u02c5\u02cd"+
		"\u02d0\u02d7\u02db\u02df\u02e5\u02e8\u02ef\u02f3\u02fb\u02fe\u0305\u0309"+
		"\u030d\u0312\u0315\u0318\u031d\u0320\u0325\u032a\u0332\u033d\u0341\u0346"+
		"\u034a\u035a\u0364\u036a\u0371\u0375\u037a\u0387\u0401\u040a\u0412\u041d"+
		"\u0427\u0435\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}