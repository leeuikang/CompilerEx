// Generated from grammar\Java.g4 by ANTLR 4.7.1
package grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
	public static final int
	RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
	RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classOrInterfaceModifiers = 5, 
	RULE_classOrInterfaceModifier = 6, RULE_modifiers = 7, RULE_classDeclaration = 8, 
	RULE_normalClassDeclaration = 9, RULE_typeParameters = 10, RULE_typeParameter = 11, 
	RULE_typeBound = 12, RULE_enumDeclaration = 13, RULE_enumBody = 14, RULE_enumConstants = 15, 
	RULE_enumConstant = 16, RULE_enumBodyDeclarations = 17, RULE_interfaceDeclaration = 18, 
	RULE_normalInterfaceDeclaration = 19, RULE_typeList = 20, RULE_classBody = 21, 
	RULE_interfaceBody = 22, RULE_classBodyDeclaration = 23, RULE_memberDecl = 24, 
	RULE_memberDeclaration = 25, RULE_genericMethodOrConstructorDecl = 26, 
	RULE_genericMethodOrConstructorRest = 27, RULE_methodDeclaration = 28, 
	RULE_fieldDeclaration = 29, RULE_interfaceBodyDeclaration = 30, RULE_interfaceMemberDecl = 31, 
	RULE_interfaceMethodOrFieldDecl = 32, RULE_interfaceMethodOrFieldRest = 33, 
	RULE_methodDeclaratorRest = 34, RULE_voidMethodDeclaratorRest = 35, RULE_interfaceMethodDeclaratorRest = 36, 
	RULE_interfaceGenericMethodDecl = 37, RULE_voidInterfaceMethodDeclaratorRest = 38, 
	RULE_constructorDeclaratorRest = 39, RULE_constantDeclarator = 40, RULE_variableDeclarators = 41, 
	RULE_variableDeclarator = 42, RULE_constantDeclaratorsRest = 43, RULE_constantDeclaratorRest = 44, 
	RULE_variableDeclaratorId = 45, RULE_variableInitializer = 46, RULE_arrayInitializer = 47, 
	RULE_modifier = 48, RULE_packageOrTypeName = 49, RULE_enumConstantName = 50, 
	RULE_typeName = 51, RULE_type = 52, RULE_varType = 53, RULE_classOrInterfaceType = 54, 
	RULE_primitiveType = 55, RULE_variableModifier = 56, RULE_typeArguments = 57, 
	RULE_typeArgument = 58, RULE_qualifiedNameList = 59, RULE_formalParameters = 60, 
	RULE_formalParameterDecls = 61, RULE_formalParameterDeclsRest = 62, RULE_methodBody = 63, 
	RULE_constructorBody = 64, RULE_qualifiedName = 65, RULE_literal = 66, 
	RULE_annotations = 67, RULE_annotation = 68, RULE_annotationName = 69, 
	RULE_elementValuePairs = 70, RULE_elementValuePair = 71, RULE_elementValue = 72, 
	RULE_elementValueArrayInitializer = 73, RULE_annotationTypeDeclaration = 74, 
	RULE_annotationTypeBody = 75, RULE_annotationTypeElementDeclaration = 76, 
	RULE_annotationTypeElementRest = 77, RULE_annotationMethodOrConstantRest = 78, 
	RULE_annotationMethodRest = 79, RULE_annotationConstantRest = 80, RULE_defaultValue = 81, 
	RULE_block = 82, RULE_blockStatement = 83, RULE_localVariableDeclarationStatement = 84, 
	RULE_localVariableDeclaration = 85, RULE_variableModifiers = 86, RULE_statement = 87, 
	RULE_catches = 88, RULE_catchClause = 89, RULE_catchType = 90, RULE_finallyBlock = 91, 
	RULE_resourceSpecification = 92, RULE_resources = 93, RULE_resource = 94, 
	RULE_formalParameter = 95, RULE_switchBlockStatementGroups = 96, RULE_switchBlockStatementGroup = 97, 
	RULE_switchLabel = 98, RULE_forControl = 99, RULE_forInit = 100, RULE_enhancedForControl = 101, 
	RULE_forUpdate = 102, RULE_parExpression = 103, RULE_expressionList = 104, 
	RULE_statementExpression = 105, RULE_constantExpression = 106, RULE_expression = 107, 
	RULE_assignmentOperator = 108, RULE_conditionalExpression = 109, RULE_conditionalOrExpression = 110, 
	RULE_conditionalAndExpression = 111, RULE_inclusiveOrExpression = 112, 
	RULE_exclusiveOrExpression = 113, RULE_andExpression = 114, RULE_equalityExpression = 115, 
	RULE_instanceOfExpression = 116, RULE_relationalExpression = 117, RULE_relationalOp = 118, 
	RULE_shiftExpression = 119, RULE_shiftOp = 120, RULE_additiveExpression = 121, 
	RULE_multiplicativeExpression = 122, RULE_unaryExpression = 123, RULE_unaryExpressionNotPlusMinus = 124, 
	RULE_castExpression = 125, RULE_primary = 126, RULE_identifierSuffix = 127, 
	RULE_creator = 128, RULE_createdName = 129, RULE_innerCreator = 130, RULE_arrayCreatorRest = 131, 
	RULE_classCreatorRest = 132, RULE_explicitGenericInvocation = 133, RULE_nonWildcardTypeArguments = 134, 
	RULE_typeArgumentsOrDiamond = 135, RULE_nonWildcardTypeArgumentsOrDiamond = 136, 
	RULE_selector = 137, RULE_superSuffix = 138, RULE_explicitGenericInvocationSuffix = 139, 
	RULE_arguments = 140;
	public static final String[] ruleNames = {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classOrInterfaceDeclaration", "classOrInterfaceModifiers", "classOrInterfaceModifier", 
			"modifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
			"typeParameter", "typeBound", "enumDeclaration", "enumBody", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
			"memberDeclaration", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
			"methodDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", "interfaceMemberDecl", 
			"interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", "methodDeclaratorRest", 
			"voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
			"voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", "constantDeclarator", 
			"variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
			"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
			"typeName", "type", "varType", "classOrInterfaceType", "primitiveType", 
			"variableModifier", "typeArguments", "typeArgument", "qualifiedNameList", 
			"formalParameters", "formalParameterDecls", "formalParameterDeclsRest", 
			"methodBody", "constructorBody", "qualifiedName", "literal", "annotations", 
			"annotation", "annotationName", "elementValuePairs", "elementValuePair", 
			"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "variableModifiers", "statement", "catches", 
			"catchClause", "catchType", "finallyBlock", "resourceSpecification", "resources", 
			"resource", "formalParameter", "switchBlockStatementGroups", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
			"parExpression", "expressionList", "statementExpression", "constantExpression", 
			"expression", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
			"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
			"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
			"identifierSuffix", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "selector", 
			"superSuffix", "explicitGenericInvocationSuffix", "arguments"
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

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public static void main(File file) 
	{
		ANTLRInputStream input=null;
		FileInputStream fileInputStream;
		
		try{
			fileInputStream = new FileInputStream(file);
			input = new ANTLRInputStream(fileInputStream);
			
			JavaLexer lexer = new JavaLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer); 
			JavaParser parser = new JavaParser((TokenStream)tokens);      
			ParserRuleContext tree= parser.compilationUnit();
			ParseTreeWalker walker = new ParseTreeWalker();
			MyJavaListener extractor = new MyJavaListener(parser);
			walker.walk(extractor, tree);
			
			fileInputStream.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(282);
					annotations();
					setState(303);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PACKAGE:
					{
						setState(283);
						packageDeclaration();
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==IMPORT) {
							{
								{
									setState(284);
									importDeclaration();
								}
							}
							setState(289);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
							{
								{
									setState(290);
									typeDeclaration();
								}
							}
							setState(295);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
					break;
					case ABSTRACT:
					case CLASS:
					case ENUM:
					case FINAL:
					case INTERFACE:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case STATIC:
					case STRICTFP:
					case AT:
					{
						setState(296);
						classOrInterfaceDeclaration();
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
							{
								{
									setState(297);
									typeDeclaration();
								}
							}
							setState(302);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
					setState(305);
					match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PACKAGE) {
						{
							setState(307);
							packageDeclaration();
						}
					}

					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IMPORT) {
						{
							{
								setState(310);
								importDeclaration();
							}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
						{
							{
								setState(316);
								typeDeclaration();
							}
						}
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(322);
					match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(325);
				match(PACKAGE);
				setState(326);
				qualifiedName();
				setState(327);
				match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(329);
				match(IMPORT);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
						setState(330);
						match(STATIC);
					}
				}

				setState(333);
				qualifiedName();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
						setState(334);
						match(DOT);
						setState(335);
						match(MUL);
					}
				}

				setState(338);
				match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(340);
					classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(341);
					match(SEMI);
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

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(344);
				classOrInterfaceModifiers();
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
				case ENUM:
				{
					setState(345);
					classDeclaration();
				}
				break;
				case INTERFACE:
				case AT:
				{
					setState(346);
					interfaceDeclaration();
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

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifiers(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(349);
								classOrInterfaceModifier();
							}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(355);
					annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
					setState(356);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifiers(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(359);
								modifier();
							}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
					setState(365);
					normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
					setState(366);
					enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(369);
				match(CLASS);
				setState(370);
				match(Identifier);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(371);
						typeParameters();
					}
				}

				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
						setState(374);
						match(EXTENDS);
						setState(375);
						type();
					}
				}

				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
						setState(378);
						match(IMPLEMENTS);
						setState(379);
						typeList();
					}
				}

				setState(382);
				classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(384);
				match(LT);
				setState(385);
				typeParameter();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(386);
							match(COMMA);
							setState(387);
							typeParameter();
						}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(395);
				match(Identifier);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
						setState(396);
						match(EXTENDS);
						setState(397);
						typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(400);
				type();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
						{
							setState(401);
							match(BITAND);
							setState(402);
							type();
						}
					}
					setState(407);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(408);
				match(ENUM);
				setState(409);
				match(Identifier);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
						setState(410);
						match(IMPLEMENTS);
						setState(411);
						typeList();
					}
				}

				setState(414);
				enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(416);
				match(LBRACE);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier || _la==AT) {
					{
						setState(417);
						enumConstants();
					}
				}

				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
						setState(420);
						match(COMMA);
					}
				}

				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
						setState(423);
						enumBodyDeclarations();
					}
				}

				setState(426);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(428);
				enumConstant();
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(429);
								match(COMMA);
								setState(430);
								enumConstant();
							}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
						setState(436);
						annotations();
					}
				}

				setState(439);
				match(Identifier);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
						setState(440);
						arguments();
					}
				}

				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
						setState(443);
						classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(446);
				match(SEMI);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(447);
							classBodyDeclaration();
						}
					}
					setState(452);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceDeclaration);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(453);
					normalInterfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
					setState(454);
					annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(457);
				match(INTERFACE);
				setState(458);
				match(Identifier);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(459);
						typeParameters();
					}
				}

				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
						setState(462);
						match(EXTENDS);
						setState(463);
						typeList();
					}
				}

				setState(466);
				interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(468);
				type();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(469);
							match(COMMA);
							setState(470);
							type();
						}
					}
					setState(475);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(476);
				match(LBRACE);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(477);
							classBodyDeclaration();
						}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(485);
				match(LBRACE);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(486);
							interfaceBodyDeclaration();
						}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(494);
					match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STATIC) {
						{
							setState(495);
							match(STATIC);
						}
					}

					setState(498);
					block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(499);
					modifiers();
					setState(500);
					memberDecl();
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

	public static class MemberDeclContext extends ParserRuleContext {
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberDecl);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(504);
					genericMethodOrConstructorDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(505);
					memberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(506);
					match(VOID);
					setState(507);
					match(Identifier);
					setState(508);
					voidMethodDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(509);
					match(Identifier);
					setState(510);
					constructorDeclaratorRest();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(511);
					interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(512);
					classDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(515);
				type();
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
				{
					setState(516);
					methodDeclaration();
				}
				break;
				case 2:
				{
					setState(517);
					fieldDeclaration();
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

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodOrConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodOrConstructorDecl(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(520);
				typeParameters();
				setState(521);
				genericMethodOrConstructorRest();
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

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodOrConstructorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodOrConstructorRest(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericMethodOrConstructorRest);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(525);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case BOOLEAN:
					case BYTE:
					case CHAR:
					case DOUBLE:
					case FLOAT:
					case INT:
					case LONG:
					case SHORT:
					case Identifier:
					{
						setState(523);
						type();
					}
					break;
					case VOID:
					{
						setState(524);
						match(VOID);
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
					setState(527);
					match(Identifier);
					setState(528);
					methodDeclaratorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(529);
					match(Identifier);
					setState(530);
					constructorDeclaratorRest();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(533);
				match(Identifier);
				setState(534);
				methodDeclaratorRest();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(536);
				variableDeclarators();
				setState(537);
				match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceBodyDeclaration);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(539);
					modifiers();
					setState(540);
					interfaceMemberDecl();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(542);
					match(SEMI);
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

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDecl(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMemberDecl);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(545);
					interfaceMethodOrFieldDecl();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
					setState(546);
					interfaceGenericMethodDecl();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
					setState(547);
					match(VOID);
					setState(548);
					match(Identifier);
					setState(549);
					voidInterfaceMethodDeclaratorRest();
				}
				break;
			case INTERFACE:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
					setState(550);
					interfaceDeclaration();
				}
				break;
			case CLASS:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
					setState(551);
					classDeclaration();
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

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(554);
				type();
				setState(555);
				match(Identifier);
				setState(556);
				interfaceMethodOrFieldRest();
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

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldRest(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMethodOrFieldRest);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
					setState(558);
					constantDeclaratorsRest();
					setState(559);
					match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
					setState(561);
					interfaceMethodDeclaratorRest();
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

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaratorRest(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(564);
				formalParameters();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
						{
							setState(565);
							match(LBRACK);
							setState(566);
							match(RBRACK);
						}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(572);
						match(THROWS);
						setState(573);
						qualifiedNameList();
					}
				}

				setState(578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				{
					setState(576);
					methodBody();
				}
				break;
				case SEMI:
				{
					setState(577);
					match(SEMI);
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

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidMethodDeclaratorRest(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(580);
				formalParameters();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(581);
						match(THROWS);
						setState(582);
						qualifiedNameList();
					}
				}

				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				{
					setState(585);
					methodBody();
				}
				break;
				case SEMI:
				{
					setState(586);
					match(SEMI);
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

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(589);
				formalParameters();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
						{
							setState(590);
							match(LBRACK);
							setState(591);
							match(RBRACK);
						}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(597);
						match(THROWS);
						setState(598);
						qualifiedNameList();
					}
				}

				setState(601);
				match(SEMI);
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

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceGenericMethodDecl(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(603);
				typeParameters();
				setState(606);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case Identifier:
				{
					setState(604);
					type();
				}
				break;
				case VOID:
				{
					setState(605);
					match(VOID);
				}
				break;
				default:
					throw new NoViableAltException(this);
				}
				setState(608);
				match(Identifier);
				setState(609);
				interfaceMethodDeclaratorRest();
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

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(611);
				formalParameters();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(612);
						match(THROWS);
						setState(613);
						qualifiedNameList();
					}
				}

				setState(616);
				match(SEMI);
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

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaratorRest(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(618);
				formalParameters();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(619);
						match(THROWS);
						setState(620);
						qualifiedNameList();
					}
				}

				setState(623);
				constructorBody();
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(625);
				match(Identifier);
				setState(626);
				constantDeclaratorRest();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(628);
				variableDeclarator();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(629);
							match(COMMA);
							setState(630);
							variableDeclarator();
						}
					}
					setState(635);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(636);
				variableDeclaratorId();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
						setState(637);
						match(ASSIGN);
						setState(638);
						variableInitializer();
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

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorsRest(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(641);
				constantDeclaratorRest();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(642);
							match(COMMA);
							setState(643);
							constantDeclarator();
						}
					}
					setState(648);
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

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorRest(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
						{
							setState(649);
							match(LBRACK);
							setState(650);
							match(RBRACK);
						}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(656);
				match(ASSIGN);
				setState(657);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(659);
				match(Identifier);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
						{
							setState(660);
							match(LBRACK);
							setState(661);
							match(RBRACK);
						}
					}
					setState(666);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableInitializer);
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(667);
					arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(668);
					expression();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(671);
				match(LBRACE);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
						setState(672);
						variableInitializer();
						setState(677);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
									{
										setState(673);
										match(COMMA);
										setState(674);
										variableInitializer();
									}
								} 
							}
							setState(679);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
						}
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
								setState(680);
								match(COMMA);
							}
						}

					}
				}

				setState(685);
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

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_modifier);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(687);
					annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
					setState(688);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(691);
				qualifiedName();
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(693);
				match(Identifier);
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

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(695);
				qualifiedName();
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

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_type);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(697);
					classOrInterfaceType();
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(698);
								match(LBRACK);
								setState(699);
								match(RBRACK);
							}
						}
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
					setState(705);
					primitiveType();
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(706);
								match(LBRACK);
								setState(707);
								match(RBRACK);
							}
						}
						setState(712);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
					setState(713);
					varType();
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

	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(716);
				match(T__0);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(718);
				match(Identifier);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(719);
						typeArguments();
					}
				}

				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
						{
							setState(722);
							match(DOT);
							setState(723);
							match(Identifier);
							setState(725);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
									setState(724);
									typeArguments();
								}
							}

						}
					}
					setState(731);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(732);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableModifier);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
					setState(734);
					match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
					setState(735);
					annotation();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(738);
				match(LT);
				setState(739);
				typeArgument();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(740);
							match(COMMA);
							setState(741);
							typeArgument();
						}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(747);
				match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typeArgument);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(749);
					type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
					setState(750);
					match(QUESTION);
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXTENDS || _la==SUPER) {
						{
							setState(751);
							_la = _input.LA(1);
							if ( !(_la==EXTENDS || _la==SUPER) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(752);
							type();
						}
					}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(757);
				qualifiedName();
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(758);
							match(COMMA);
							setState(759);
							qualifiedName();
						}
					}
					setState(764);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(765);
				match(LPAREN);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
						setState(766);
						formalParameterDecls();
					}
				}

				setState(769);
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

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDecls(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(771);
				variableModifiers();
				setState(772);
				type();
				setState(773);
				formalParameterDeclsRest();
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

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDeclsRest(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(775);
					variableDeclaratorId();
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
							setState(776);
							match(COMMA);
							setState(777);
							formalParameterDecls();
						}
					}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
					setState(780);
					match(ELLIPSIS);
					setState(781);
					variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(784);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(786);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(788);
				match(Identifier);
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(789);
								match(DOT);
								setState(790);
								match(Identifier);
							}
						} 
					}
					setState(795);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(796);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(799); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
					{
						{
							setState(798);
							annotation();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
					setState(801); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(803);
				match(AT);
				setState(804);
				annotationName();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
						setState(805);
						match(LPAREN);
						setState(808);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
						case 1:
						{
							setState(806);
							elementValuePairs();
						}
						break;
						case 2:
						{
							setState(807);
							elementValue();
						}
						break;
						}
						setState(810);
						match(RPAREN);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(813);
				match(Identifier);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
						{
							setState(814);
							match(DOT);
							setState(815);
							match(Identifier);
						}
					}
					setState(820);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(821);
				elementValuePair();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(822);
							match(COMMA);
							setState(823);
							elementValuePair();
						}
					}
					setState(828);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(829);
				match(Identifier);
				setState(830);
				match(ASSIGN);
				setState(831);
				elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elementValue);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(833);
					conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
					setState(834);
					annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
					setState(835);
					elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(838);
				match(LBRACE);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(839);
						elementValue();
						setState(844);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
									{
										setState(840);
										match(COMMA);
										setState(841);
										elementValue();
									}
								} 
							}
							setState(846);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						}
					}
				}

				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
						setState(849);
						match(COMMA);
					}
				}

				setState(852);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(854);
				match(AT);
				setState(855);
				match(INTERFACE);
				setState(856);
				match(Identifier);
				setState(857);
				annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(859);
				match(LBRACE);
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(860);
							annotationTypeElementDeclaration();
						}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(866);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationTypeElementDeclaration);
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(868);
					modifiers();
					setState(869);
					annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(871);
					match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationTypeElementRest);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(874);
					type();
					setState(875);
					annotationMethodOrConstantRest();
					setState(876);
					match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
					setState(878);
					normalClassDeclaration();
					setState(880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
					{
						setState(879);
						match(SEMI);
					}
					break;
					}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
					setState(882);
					normalInterfaceDeclaration();
					setState(884);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
					{
						setState(883);
						match(SEMI);
					}
					break;
					}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
					setState(886);
					enumDeclaration();
					setState(888);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
					{
						setState(887);
						match(SEMI);
					}
					break;
					}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
					setState(890);
					annotationTypeDeclaration();
					setState(892);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
					{
						setState(891);
						match(SEMI);
					}
					break;
					}
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationMethodOrConstantRest);
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(896);
					annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(897);
					annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(900);
				match(Identifier);
				setState(901);
				match(LPAREN);
				setState(902);
				match(RPAREN);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
						setState(903);
						defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(906);
				variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(908);
				match(DEFAULT);
				setState(909);
				elementValue();
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(911);
				match(LBRACE);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(912);
							blockStatement();
						}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_blockStatement);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(920);
					localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(921);
					classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(922);
					statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(925);
				localVariableDeclaration();
				setState(926);
				match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(928);
				variableModifiers();
				setState(929);
				type();
				setState(930);
				variableDeclarators();
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

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifiers(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
						{
							setState(932);
							variableModifier();
						}
					}
					setState(937);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statement);
		int _la;
		try {
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(938);
					block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(939);
					match(ASSERT);
					setState(940);
					expression();
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
							setState(941);
							match(COLON);
							setState(942);
							expression();
						}
					}

					setState(945);
					match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(947);
					match(IF);
					setState(948);
					parExpression();
					setState(949);
					statement();
					setState(952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
					{
						setState(950);
						match(ELSE);
						setState(951);
						statement();
					}
					break;
					}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(954);
					match(FOR);
					setState(955);
					match(LPAREN);
					setState(956);
					forControl();
					setState(957);
					match(RPAREN);
					setState(958);
					statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(960);
					match(WHILE);
					setState(961);
					parExpression();
					setState(962);
					statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(964);
					match(DO);
					setState(965);
					statement();
					setState(966);
					match(WHILE);
					setState(967);
					parExpression();
					setState(968);
					match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(970);
					match(TRY);
					setState(971);
					block();
					setState(977);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CATCH:
					{
						setState(972);
						catches();
						setState(974);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==FINALLY) {
							{
								setState(973);
								finallyBlock();
							}
						}

					}
					break;
					case FINALLY:
					{
						setState(976);
						finallyBlock();
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(979);
					match(TRY);
					setState(980);
					resourceSpecification();
					setState(981);
					block();
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CATCH) {
						{
							setState(982);
							catches();
						}
					}

					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
							setState(985);
							finallyBlock();
						}
					}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(988);
					match(SWITCH);
					setState(989);
					parExpression();
					setState(990);
					match(LBRACE);
					setState(991);
					switchBlockStatementGroups();
					setState(992);
					match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(994);
					match(SYNCHRONIZED);
					setState(995);
					parExpression();
					setState(996);
					block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(998);
					match(RETURN);
					setState(1000);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
						{
							setState(999);
							expression();
						}
					}

					setState(1002);
					match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
					setState(1003);
					match(THROW);
					setState(1004);
					expression();
					setState(1005);
					match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
					setState(1007);
					match(BREAK);
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
							setState(1008);
							match(Identifier);
						}
					}

					setState(1011);
					match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
					setState(1012);
					match(CONTINUE);
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
							setState(1013);
							match(Identifier);
						}
					}

					setState(1016);
					match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
					setState(1017);
					match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
					setState(1018);
					statementExpression();
					setState(1019);
					match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
					setState(1021);
					match(Identifier);
					setState(1022);
					match(COLON);
					setState(1023);
					statement();
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

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1027); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(1026);
							catchClause();
						}
					}
					setState(1029); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1031);
				match(CATCH);
				setState(1032);
				match(LPAREN);
				setState(1033);
				variableModifiers();
				setState(1034);
				catchType();
				setState(1035);
				match(Identifier);
				setState(1036);
				match(RPAREN);
				setState(1037);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1039);
				qualifiedName();
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITOR) {
					{
						{
							setState(1040);
							match(BITOR);
							setState(1041);
							qualifiedName();
						}
					}
					setState(1046);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1047);
				match(FINALLY);
				setState(1048);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1050);
				match(LPAREN);
				setState(1051);
				resources();
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
						setState(1052);
						match(SEMI);
					}
				}

				setState(1055);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1057);
				resource();
				setState(1062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1058);
								match(SEMI);
								setState(1059);
								resource();
							}
						} 
					}
					setState(1064);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1065);
				variableModifiers();
				setState(1066);
				classOrInterfaceType();
				setState(1067);
				variableDeclaratorId();
				setState(1068);
				match(ASSIGN);
				setState(1069);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1071);
				variableModifiers();
				setState(1072);
				type();
				setState(1073);
				variableDeclaratorId();
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
						{
							setState(1075);
							switchBlockStatementGroup();
						}
					}
					setState(1080);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1082); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
					{
						{
							setState(1081);
							switchLabel();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1084); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
						{
							setState(1086);
							blockStatement();
						}
					}
					setState(1091);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_switchLabel);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1092);
					match(CASE);
					setState(1093);
					constantExpression();
					setState(1094);
					match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1096);
					match(CASE);
					setState(1097);
					enumConstantName();
					setState(1098);
					match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1100);
					match(DEFAULT);
					setState(1101);
					match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forControl);
		int _la;
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1104);
					enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1105);
							forInit();
						}
					}

					setState(1108);
					match(SEMI);
					setState(1110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
						{
							setState(1109);
							expression();
						}
					}

					setState(1112);
					match(SEMI);
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
						{
							setState(1113);
							forUpdate();
						}
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_forInit);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1118);
					localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1119);
					expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1122);
				variableModifiers();
				setState(1123);
				type();
				setState(1124);
				match(Identifier);
				setState(1125);
				match(COLON);
				setState(1126);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1128);
				expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1130);
				match(LPAREN);
				setState(1131);
				expression();
				setState(1132);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1134);
				expression();
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1135);
							match(COMMA);
							setState(1136);
							expression();
						}
					}
					setState(1141);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1142);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1144);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1146);
				conditionalExpression();
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ASSIGN - 67)) | (1L << (ADD_ASSIGN - 67)) | (1L << (SUB_ASSIGN - 67)) | (1L << (MUL_ASSIGN - 67)) | (1L << (DIV_ASSIGN - 67)) | (1L << (AND_ASSIGN - 67)) | (1L << (OR_ASSIGN - 67)) | (1L << (XOR_ASSIGN - 67)) | (1L << (MOD_ASSIGN - 67)) | (1L << (LSHIFT_ASSIGN - 67)) | (1L << (RSHIFT_ASSIGN - 67)) | (1L << (URSHIFT_ASSIGN - 67)))) != 0)) {
					{
						setState(1147);
						assignmentOperator();
						setState(1148);
						expression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1152);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ASSIGN - 67)) | (1L << (ADD_ASSIGN - 67)) | (1L << (SUB_ASSIGN - 67)) | (1L << (MUL_ASSIGN - 67)) | (1L << (DIV_ASSIGN - 67)) | (1L << (AND_ASSIGN - 67)) | (1L << (OR_ASSIGN - 67)) | (1L << (XOR_ASSIGN - 67)) | (1L << (MOD_ASSIGN - 67)) | (1L << (LSHIFT_ASSIGN - 67)) | (1L << (RSHIFT_ASSIGN - 67)) | (1L << (URSHIFT_ASSIGN - 67)))) != 0)) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1154);
				conditionalOrExpression();
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
						setState(1155);
						match(QUESTION);
						setState(1156);
						expression();
						setState(1157);
						match(COLON);
						setState(1158);
						conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1162);
				conditionalAndExpression();
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
						{
							setState(1163);
							match(OR);
							setState(1164);
							conditionalAndExpression();
						}
					}
					setState(1169);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1170);
				inclusiveOrExpression();
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
						{
							setState(1171);
							match(AND);
							setState(1172);
							inclusiveOrExpression();
						}
					}
					setState(1177);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1178);
				exclusiveOrExpression();
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITOR) {
					{
						{
							setState(1179);
							match(BITOR);
							setState(1180);
							exclusiveOrExpression();
						}
					}
					setState(1185);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1186);
				andExpression();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CARET) {
					{
						{
							setState(1187);
							match(CARET);
							setState(1188);
							andExpression();
						}
					}
					setState(1193);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1194);
				equalityExpression();
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
						{
							setState(1195);
							match(BITAND);
							setState(1196);
							equalityExpression();
						}
					}
					setState(1201);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1202);
				instanceOfExpression();
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQUAL || _la==NOTEQUAL) {
					{
						{
							setState(1203);
							_la = _input.LA(1);
							if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1204);
							instanceOfExpression();
						}
					}
					setState(1209);
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

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1210);
				relationalExpression();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSTANCEOF) {
					{
						setState(1211);
						match(INSTANCEOF);
						setState(1212);
						type();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1215);
				shiftExpression();
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GT - 68)) | (1L << (LT - 68)) | (1L << (LE - 68)) | (1L << (GE - 68)))) != 0)) {
					{
						{
							setState(1216);
							relationalOp();
							setState(1217);
							shiftExpression();
						}
					}
					setState(1223);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1224);
				_la = _input.LA(1);
				if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GT - 68)) | (1L << (LT - 68)) | (1L << (LE - 68)) | (1L << (GE - 68)))) != 0)) ) {
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1226);
				additiveExpression();
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1227);
								shiftOp();
								setState(1228);
								additiveExpression();
							}
						} 
					}
					setState(1234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token t3;
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_shiftOp);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1235);
					((ShiftOpContext)_localctx).t1 = match(LT);
					setState(1236);
					((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1237);
					((ShiftOpContext)_localctx).t1 = match(GT);
					setState(1238);
					((ShiftOpContext)_localctx).t2 = match(GT);
					setState(1239);
					((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1240);
					((ShiftOpContext)_localctx).t1 = match(GT);
					setState(1241);
					((ShiftOpContext)_localctx).t2 = match(GT);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1244);
				multiplicativeExpression();
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
						{
							setState(1245);
							_la = _input.LA(1);
							if ( !(_la==ADD || _la==SUB) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1246);
							multiplicativeExpression();
						}
					}
					setState(1251);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1252);
				unaryExpression();
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (MUL - 84)) | (1L << (DIV - 84)) | (1L << (MOD - 84)))) != 0)) {
					{
						{
							setState(1253);
							_la = _input.LA(1);
							if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (MUL - 84)) | (1L << (DIV - 84)) | (1L << (MOD - 84)))) != 0)) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(1254);
							unaryExpression();
						}
					}
					setState(1259);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_unaryExpression);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
					setState(1260);
					match(ADD);
					setState(1261);
					unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
					setState(1262);
					match(SUB);
					setState(1263);
					unaryExpression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
					setState(1264);
					match(INC);
					setState(1265);
					unaryExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
					setState(1266);
					match(DEC);
					setState(1267);
					unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
					setState(1268);
					unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1271);
					match(TILDE);
					setState(1272);
					unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1273);
					match(BANG);
					setState(1274);
					unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1275);
					castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1276);
					primary();
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK || _la==DOT) {
						{
							{
								setState(1277);
								selector();
							}
						}
						setState(1282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INC || _la==DEC) {
						{
							setState(1283);
							_la = _input.LA(1);
							if ( !(_la==INC || _la==DEC) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
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

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_castExpression);
		try {
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1288);
					match(LPAREN);
					setState(1289);
					primitiveType();
					setState(1290);
					match(RPAREN);
					setState(1291);
					unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1293);
					match(LPAREN);
					setState(1296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
					{
						setState(1294);
						type();
					}
					break;
					case 2:
					{
						setState(1295);
						expression();
					}
					break;
					}
					setState(1298);
					match(RPAREN);
					setState(1299);
					unaryExpressionNotPlusMinus();
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
					setState(1303);
					parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
					setState(1304);
					match(THIS);
					setState(1306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
							setState(1305);
							arguments();
						}
					}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
					setState(1308);
					match(SUPER);
					setState(1309);
					superSuffix();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
					setState(1310);
					literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
					setState(1311);
					match(NEW);
					setState(1312);
					creator();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
					setState(1313);
					nonWildcardTypeArguments();
					setState(1317);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUPER:
					case Identifier:
					{
						setState(1314);
						explicitGenericInvocationSuffix();
					}
					break;
					case THIS:
					{
						setState(1315);
						match(THIS);
						setState(1316);
						arguments();
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
					setState(1319);
					match(Identifier);
					setState(1324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(1320);
									match(DOT);
									setState(1321);
									match(Identifier);
								}
							} 
						}
						setState(1326);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
					}
					setState(1328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
					{
						setState(1327);
						identifierSuffix();
					}
					break;
					}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 8);
				{
					setState(1330);
					primitiveType();
					setState(1335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1331);
								match(LBRACK);
								setState(1332);
								match(RBRACK);
							}
						}
						setState(1337);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1338);
					match(DOT);
					setState(1339);
					match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 9);
				{
					setState(1341);
					match(VOID);
					setState(1342);
					match(DOT);
					setState(1343);
					match(CLASS);
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

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIdentifierSuffix(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_identifierSuffix);
		int _la;
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(1346);
								match(LBRACK);
								setState(1347);
								match(RBRACK);
							}
						}
						setState(1350); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LBRACK );
					setState(1352);
					match(DOT);
					setState(1353);
					match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1354);
					match(LBRACK);
					setState(1355);
					expression();
					setState(1356);
					match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1358);
					arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1359);
					match(DOT);
					setState(1360);
					match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1361);
					match(DOT);
					setState(1362);
					explicitGenericInvocation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1363);
					match(DOT);
					setState(1364);
					match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1365);
					match(DOT);
					setState(1366);
					match(SUPER);
					setState(1367);
					arguments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1368);
					match(DOT);
					setState(1369);
					match(NEW);
					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1370);
							nonWildcardTypeArguments();
						}
					}

					setState(1373);
					innerCreator();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_creator);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1376);
					nonWildcardTypeArguments();
					setState(1377);
					createdName();
					setState(1378);
					classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(1380);
					createdName();
					setState(1383);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
					{
						setState(1381);
						arrayCreatorRest();
					}
					break;
					case LPAREN:
					{
						setState(1382);
						classCreatorRest();
					}
					break;
					default:
						throw new NoViableAltException(this);
					}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_createdName);
		int _la;
		try {
			setState(1402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(1387);
					match(Identifier);
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1388);
							typeArgumentsOrDiamond();
						}
					}

					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
							{
								setState(1391);
								match(DOT);
								setState(1392);
								match(Identifier);
								setState(1394);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==LT) {
									{
										setState(1393);
										typeArgumentsOrDiamond();
									}
								}

							}
						}
						setState(1400);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
					setState(1401);
					primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1404);
				match(Identifier);
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(1405);
						nonWildcardTypeArgumentsOrDiamond();
					}
				}

				setState(1408);
				classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1410);
				match(LBRACK);
				setState(1438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACK:
				{
					setState(1411);
					match(RBRACK);
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1412);
								match(LBRACK);
								setState(1413);
								match(RBRACK);
							}
						}
						setState(1418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1419);
					arrayInitializer();
				}
				break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case NEW:
				case SHORT:
				case SUPER:
				case THIS:
				case VOID:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case LT:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case Identifier:
				{
					setState(1420);
					expression();
					setState(1421);
					match(RBRACK);
					setState(1428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(1422);
									match(LBRACK);
									setState(1423);
									expression();
									setState(1424);
									match(RBRACK);
								}
							} 
						}
						setState(1430);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
					}
					setState(1435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(1431);
									match(LBRACK);
									setState(1432);
									match(RBRACK);
								}
							} 
						}
						setState(1437);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1440);
				arguments();
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
						setState(1441);
						classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1444);
				nonWildcardTypeArguments();
				setState(1445);
				explicitGenericInvocationSuffix();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1447);
				match(LT);
				setState(1448);
				typeList();
				setState(1449);
				match(GT);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_typeArgumentsOrDiamond);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1451);
					match(LT);
					setState(1452);
					match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1453);
					typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1456);
					match(LT);
					setState(1457);
					match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1458);
					nonWildcardTypeArguments();
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_selector);
		int _la;
		try {
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1461);
					match(DOT);
					setState(1462);
					match(Identifier);
					setState(1464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
							setState(1463);
							arguments();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1466);
					match(DOT);
					setState(1467);
					explicitGenericInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1468);
					match(DOT);
					setState(1469);
					match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1470);
					match(DOT);
					setState(1471);
					match(SUPER);
					setState(1472);
					superSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1473);
					match(DOT);
					setState(1474);
					match(NEW);
					setState(1476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1475);
							nonWildcardTypeArguments();
						}
					}

					setState(1478);
					innerCreator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1479);
					match(LBRACK);
					setState(1480);
					expression();
					setState(1481);
					match(RBRACK);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_superSuffix);
		int _la;
		try {
			setState(1491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
					setState(1485);
					arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
					setState(1486);
					match(DOT);
					setState(1487);
					match(Identifier);
					setState(1489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
							setState(1488);
							arguments();
						}
					}

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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
					setState(1493);
					match(SUPER);
					setState(1494);
					superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(1495);
					match(Identifier);
					setState(1496);
					arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1499);
				match(LPAREN);
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
						setState(1500);
						expressionList();
					}
				}

				setState(1503);
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
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u05e4\4\2\t\2\4"+
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
					"\t\u008e\3\2\3\2\3\2\7\2\u0120\n\2\f\2\16\2\u0123\13\2\3\2\7\2\u0126\n"+
					"\2\f\2\16\2\u0129\13\2\3\2\3\2\7\2\u012d\n\2\f\2\16\2\u0130\13\2\5\2\u0132"+
					"\n\2\3\2\3\2\3\2\5\2\u0137\n\2\3\2\7\2\u013a\n\2\f\2\16\2\u013d\13\2\3"+
					"\2\7\2\u0140\n\2\f\2\16\2\u0143\13\2\3\2\5\2\u0146\n\2\3\3\3\3\3\3\3\3"+
					"\3\4\3\4\5\4\u014e\n\4\3\4\3\4\3\4\5\4\u0153\n\4\3\4\3\4\3\5\3\5\5\5\u0159"+
					"\n\5\3\6\3\6\3\6\5\6\u015e\n\6\3\7\7\7\u0161\n\7\f\7\16\7\u0164\13\7\3"+
					"\b\3\b\5\b\u0168\n\b\3\t\7\t\u016b\n\t\f\t\16\t\u016e\13\t\3\n\3\n\5\n"+
					"\u0172\n\n\3\13\3\13\3\13\5\13\u0177\n\13\3\13\3\13\5\13\u017b\n\13\3"+
					"\13\3\13\5\13\u017f\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0187\n\f\f\f\16"+
					"\f\u018a\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0191\n\r\3\16\3\16\3\16\7\16\u0196"+
					"\n\16\f\16\16\16\u0199\13\16\3\17\3\17\3\17\3\17\5\17\u019f\n\17\3\17"+
					"\3\17\3\20\3\20\5\20\u01a5\n\20\3\20\5\20\u01a8\n\20\3\20\5\20\u01ab\n"+
					"\20\3\20\3\20\3\21\3\21\3\21\7\21\u01b2\n\21\f\21\16\21\u01b5\13\21\3"+
					"\22\5\22\u01b8\n\22\3\22\3\22\5\22\u01bc\n\22\3\22\5\22\u01bf\n\22\3\23"+
					"\3\23\7\23\u01c3\n\23\f\23\16\23\u01c6\13\23\3\24\3\24\5\24\u01ca\n\24"+
					"\3\25\3\25\3\25\5\25\u01cf\n\25\3\25\3\25\5\25\u01d3\n\25\3\25\3\25\3"+
					"\26\3\26\3\26\7\26\u01da\n\26\f\26\16\26\u01dd\13\26\3\27\3\27\7\27\u01e1"+
					"\n\27\f\27\16\27\u01e4\13\27\3\27\3\27\3\30\3\30\7\30\u01ea\n\30\f\30"+
					"\16\30\u01ed\13\30\3\30\3\30\3\31\3\31\5\31\u01f3\n\31\3\31\3\31\3\31"+
					"\3\31\5\31\u01f9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
					"\u0204\n\32\3\33\3\33\3\33\5\33\u0209\n\33\3\34\3\34\3\34\3\35\3\35\5"+
					"\35\u0210\n\35\3\35\3\35\3\35\3\35\5\35\u0216\n\35\3\36\3\36\3\36\3\37"+
					"\3\37\3\37\3 \3 \3 \3 \5 \u0222\n \3!\3!\3!\3!\3!\3!\3!\5!\u022b\n!\3"+
					"\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0235\n#\3$\3$\3$\7$\u023a\n$\f$\16$\u023d"+
					"\13$\3$\3$\5$\u0241\n$\3$\3$\5$\u0245\n$\3%\3%\3%\5%\u024a\n%\3%\3%\5"+
					"%\u024e\n%\3&\3&\3&\7&\u0253\n&\f&\16&\u0256\13&\3&\3&\5&\u025a\n&\3&"+
					"\3&\3\'\3\'\3\'\5\'\u0261\n\'\3\'\3\'\3\'\3(\3(\3(\5(\u0269\n(\3(\3(\3"+
					")\3)\3)\5)\u0270\n)\3)\3)\3*\3*\3*\3+\3+\3+\7+\u027a\n+\f+\16+\u027d\13"+
					"+\3,\3,\3,\5,\u0282\n,\3-\3-\3-\7-\u0287\n-\f-\16-\u028a\13-\3.\3.\7."+
					"\u028e\n.\f.\16.\u0291\13.\3.\3.\3.\3/\3/\3/\7/\u0299\n/\f/\16/\u029c"+
					"\13/\3\60\3\60\5\60\u02a0\n\60\3\61\3\61\3\61\3\61\7\61\u02a6\n\61\f\61"+
					"\16\61\u02a9\13\61\3\61\5\61\u02ac\n\61\5\61\u02ae\n\61\3\61\3\61\3\62"+
					"\3\62\5\62\u02b4\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\7\66"+
					"\u02bf\n\66\f\66\16\66\u02c2\13\66\3\66\3\66\3\66\7\66\u02c7\n\66\f\66"+
					"\16\66\u02ca\13\66\3\66\5\66\u02cd\n\66\3\67\3\67\38\38\58\u02d3\n8\3"+
					"8\38\38\58\u02d8\n8\78\u02da\n8\f8\168\u02dd\138\39\39\3:\3:\5:\u02e3"+
					"\n:\3;\3;\3;\3;\7;\u02e9\n;\f;\16;\u02ec\13;\3;\3;\3<\3<\3<\3<\5<\u02f4"+
					"\n<\5<\u02f6\n<\3=\3=\3=\7=\u02fb\n=\f=\16=\u02fe\13=\3>\3>\5>\u0302\n"+
					">\3>\3>\3?\3?\3?\3?\3@\3@\3@\5@\u030d\n@\3@\3@\5@\u0311\n@\3A\3A\3B\3"+
					"B\3C\3C\3C\7C\u031a\nC\fC\16C\u031d\13C\3D\3D\3E\6E\u0322\nE\rE\16E\u0323"+
					"\3F\3F\3F\3F\3F\5F\u032b\nF\3F\5F\u032e\nF\3G\3G\3G\7G\u0333\nG\fG\16"+
					"G\u0336\13G\3H\3H\3H\7H\u033b\nH\fH\16H\u033e\13H\3I\3I\3I\3I\3J\3J\3"+
					"J\5J\u0347\nJ\3K\3K\3K\3K\7K\u034d\nK\fK\16K\u0350\13K\5K\u0352\nK\3K"+
					"\5K\u0355\nK\3K\3K\3L\3L\3L\3L\3L\3M\3M\7M\u0360\nM\fM\16M\u0363\13M\3"+
					"M\3M\3N\3N\3N\3N\5N\u036b\nN\3O\3O\3O\3O\3O\3O\5O\u0373\nO\3O\3O\5O\u0377"+
					"\nO\3O\3O\5O\u037b\nO\3O\3O\5O\u037f\nO\5O\u0381\nO\3P\3P\5P\u0385\nP"+
					"\3Q\3Q\3Q\3Q\5Q\u038b\nQ\3R\3R\3S\3S\3S\3T\3T\7T\u0394\nT\fT\16T\u0397"+
					"\13T\3T\3T\3U\3U\3U\5U\u039e\nU\3V\3V\3V\3W\3W\3W\3W\3X\7X\u03a8\nX\f"+
					"X\16X\u03ab\13X\3Y\3Y\3Y\3Y\3Y\5Y\u03b2\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03bb"+
					"\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03d1"+
					"\nY\3Y\5Y\u03d4\nY\3Y\3Y\3Y\3Y\5Y\u03da\nY\3Y\5Y\u03dd\nY\3Y\3Y\3Y\3Y"+
					"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03eb\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03f4\nY"+
					"\3Y\3Y\3Y\5Y\u03f9\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0403\nY\3Z\6Z\u0406"+
					"\nZ\rZ\16Z\u0407\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\7\\\u0415\n\\\f\\"+
					"\16\\\u0418\13\\\3]\3]\3]\3^\3^\3^\5^\u0420\n^\3^\3^\3_\3_\3_\7_\u0427"+
					"\n_\f_\16_\u042a\13_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3b\7b\u0437\nb\fb\16"+
					"b\u043a\13b\3c\6c\u043d\nc\rc\16c\u043e\3c\7c\u0442\nc\fc\16c\u0445\13"+
					"c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0451\nd\3e\3e\5e\u0455\ne\3e\3e\5"+
					"e\u0459\ne\3e\3e\5e\u045d\ne\5e\u045f\ne\3f\3f\5f\u0463\nf\3g\3g\3g\3"+
					"g\3g\3g\3h\3h\3i\3i\3i\3i\3j\3j\3j\7j\u0474\nj\fj\16j\u0477\13j\3k\3k"+
					"\3l\3l\3m\3m\3m\3m\5m\u0481\nm\3n\3n\3o\3o\3o\3o\3o\3o\5o\u048b\no\3p"+
					"\3p\3p\7p\u0490\np\fp\16p\u0493\13p\3q\3q\3q\7q\u0498\nq\fq\16q\u049b"+
					"\13q\3r\3r\3r\7r\u04a0\nr\fr\16r\u04a3\13r\3s\3s\3s\7s\u04a8\ns\fs\16"+
					"s\u04ab\13s\3t\3t\3t\7t\u04b0\nt\ft\16t\u04b3\13t\3u\3u\3u\7u\u04b8\n"+
					"u\fu\16u\u04bb\13u\3v\3v\3v\5v\u04c0\nv\3w\3w\3w\3w\7w\u04c6\nw\fw\16"+
					"w\u04c9\13w\3x\3x\3y\3y\3y\3y\7y\u04d1\ny\fy\16y\u04d4\13y\3z\3z\3z\3"+
					"z\3z\3z\3z\5z\u04dd\nz\3{\3{\3{\7{\u04e2\n{\f{\16{\u04e5\13{\3|\3|\3|"+
					"\7|\u04ea\n|\f|\16|\u04ed\13|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u04f8\n}\3"+
					"~\3~\3~\3~\3~\3~\3~\7~\u0501\n~\f~\16~\u0504\13~\3~\5~\u0507\n~\5~\u0509"+
					"\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0513\n\177"+
					"\3\177\3\177\3\177\5\177\u0518\n\177\3\u0080\3\u0080\3\u0080\5\u0080\u051d"+
					"\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
					"\3\u0080\5\u0080\u0528\n\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u052d\n"+
					"\u0080\f\u0080\16\u0080\u0530\13\u0080\3\u0080\5\u0080\u0533\n\u0080\3"+
					"\u0080\3\u0080\3\u0080\7\u0080\u0538\n\u0080\f\u0080\16\u0080\u053b\13"+
					"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0543\n"+
					"\u0080\3\u0081\3\u0081\6\u0081\u0547\n\u0081\r\u0081\16\u0081\u0548\3"+
					"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
					"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
					"\3\u0081\5\u0081\u055e\n\u0081\3\u0081\5\u0081\u0561\n\u0081\3\u0082\3"+
					"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u056a\n\u0082\5"+
					"\u0082\u056c\n\u0082\3\u0083\3\u0083\5\u0083\u0570\n\u0083\3\u0083\3\u0083"+
					"\3\u0083\5\u0083\u0575\n\u0083\7\u0083\u0577\n\u0083\f\u0083\16\u0083"+
					"\u057a\13\u0083\3\u0083\5\u0083\u057d\n\u0083\3\u0084\3\u0084\5\u0084"+
					"\u0581\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085"+
					"\u0589\n\u0085\f\u0085\16\u0085\u058c\13\u0085\3\u0085\3\u0085\3\u0085"+
					"\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0595\n\u0085\f\u0085\16\u0085"+
					"\u0598\13\u0085\3\u0085\3\u0085\7\u0085\u059c\n\u0085\f\u0085\16\u0085"+
					"\u059f\13\u0085\5\u0085\u05a1\n\u0085\3\u0086\3\u0086\5\u0086\u05a5\n"+
					"\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
					"\3\u0089\3\u0089\5\u0089\u05b1\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
					"\u05b6\n\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u05bb\n\u008b\3\u008b\3"+
					"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
					"\5\u008b\u05c7\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
					"\u05ce\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u05d4\n\u008c\5"+
					"\u008c\u05d6\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u05dc\n\u008d"+
					"\3\u008e\3\u008e\5\u008e\u05e0\n\u008e\3\u008e\3\u008e\3\u008e\2\2\u008f"+
					"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
					"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
					"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
					"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
					"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
					"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
					"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
					"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\2\r"+
					"\6\2\4\4\25\25$&)*\n\2\4\4\25\25!!$&)*--\61\61\64\64\n\2\6\6\b\b\13\13"+
					"\21\21\27\27\36\36  ((\4\2\24\24++\3\2\66;\4\2EE\\f\4\2LLOO\4\2FGMN\3"+
					"\2TU\4\2VW[[\3\2RS\2\u063c\2\u0145\3\2\2\2\4\u0147\3\2\2\2\6\u014b\3\2"+
					"\2\2\b\u0158\3\2\2\2\n\u015a\3\2\2\2\f\u0162\3\2\2\2\16\u0167\3\2\2\2"+
					"\20\u016c\3\2\2\2\22\u0171\3\2\2\2\24\u0173\3\2\2\2\26\u0182\3\2\2\2\30"+
					"\u018d\3\2\2\2\32\u0192\3\2\2\2\34\u019a\3\2\2\2\36\u01a2\3\2\2\2 \u01ae"+
					"\3\2\2\2\"\u01b7\3\2\2\2$\u01c0\3\2\2\2&\u01c9\3\2\2\2(\u01cb\3\2\2\2"+
					"*\u01d6\3\2\2\2,\u01de\3\2\2\2.\u01e7\3\2\2\2\60\u01f8\3\2\2\2\62\u0203"+
					"\3\2\2\2\64\u0205\3\2\2\2\66\u020a\3\2\2\28\u0215\3\2\2\2:\u0217\3\2\2"+
					"\2<\u021a\3\2\2\2>\u0221\3\2\2\2@\u022a\3\2\2\2B\u022c\3\2\2\2D\u0234"+
					"\3\2\2\2F\u0236\3\2\2\2H\u0246\3\2\2\2J\u024f\3\2\2\2L\u025d\3\2\2\2N"+
					"\u0265\3\2\2\2P\u026c\3\2\2\2R\u0273\3\2\2\2T\u0276\3\2\2\2V\u027e\3\2"+
					"\2\2X\u0283\3\2\2\2Z\u028f\3\2\2\2\\\u0295\3\2\2\2^\u029f\3\2\2\2`\u02a1"+
					"\3\2\2\2b\u02b3\3\2\2\2d\u02b5\3\2\2\2f\u02b7\3\2\2\2h\u02b9\3\2\2\2j"+
					"\u02cc\3\2\2\2l\u02ce\3\2\2\2n\u02d0\3\2\2\2p\u02de\3\2\2\2r\u02e2\3\2"+
					"\2\2t\u02e4\3\2\2\2v\u02f5\3\2\2\2x\u02f7\3\2\2\2z\u02ff\3\2\2\2|\u0305"+
					"\3\2\2\2~\u0310\3\2\2\2\u0080\u0312\3\2\2\2\u0082\u0314\3\2\2\2\u0084"+
					"\u0316\3\2\2\2\u0086\u031e\3\2\2\2\u0088\u0321\3\2\2\2\u008a\u0325\3\2"+
					"\2\2\u008c\u032f\3\2\2\2\u008e\u0337\3\2\2\2\u0090\u033f\3\2\2\2\u0092"+
					"\u0346\3\2\2\2\u0094\u0348\3\2\2\2\u0096\u0358\3\2\2\2\u0098\u035d\3\2"+
					"\2\2\u009a\u036a\3\2\2\2\u009c\u0380\3\2\2\2\u009e\u0384\3\2\2\2\u00a0"+
					"\u0386\3\2\2\2\u00a2\u038c\3\2\2\2\u00a4\u038e\3\2\2\2\u00a6\u0391\3\2"+
					"\2\2\u00a8\u039d\3\2\2\2\u00aa\u039f\3\2\2\2\u00ac\u03a2\3\2\2\2\u00ae"+
					"\u03a9\3\2\2\2\u00b0\u0402\3\2\2\2\u00b2\u0405\3\2\2\2\u00b4\u0409\3\2"+
					"\2\2\u00b6\u0411\3\2\2\2\u00b8\u0419\3\2\2\2\u00ba\u041c\3\2\2\2\u00bc"+
					"\u0423\3\2\2\2\u00be\u042b\3\2\2\2\u00c0\u0431\3\2\2\2\u00c2\u0438\3\2"+
					"\2\2\u00c4\u043c\3\2\2\2\u00c6\u0450\3\2\2\2\u00c8\u045e\3\2\2\2\u00ca"+
					"\u0462\3\2\2\2\u00cc\u0464\3\2\2\2\u00ce\u046a\3\2\2\2\u00d0\u046c\3\2"+
					"\2\2\u00d2\u0470\3\2\2\2\u00d4\u0478\3\2\2\2\u00d6\u047a\3\2\2\2\u00d8"+
					"\u047c\3\2\2\2\u00da\u0482\3\2\2\2\u00dc\u0484\3\2\2\2\u00de\u048c\3\2"+
					"\2\2\u00e0\u0494\3\2\2\2\u00e2\u049c\3\2\2\2\u00e4\u04a4\3\2\2\2\u00e6"+
					"\u04ac\3\2\2\2\u00e8\u04b4\3\2\2\2\u00ea\u04bc\3\2\2\2\u00ec\u04c1\3\2"+
					"\2\2\u00ee\u04ca\3\2\2\2\u00f0\u04cc\3\2\2\2\u00f2\u04dc\3\2\2\2\u00f4"+
					"\u04de\3\2\2\2\u00f6\u04e6\3\2\2\2\u00f8\u04f7\3\2\2\2\u00fa\u0508\3\2"+
					"\2\2\u00fc\u0517\3\2\2\2\u00fe\u0542\3\2\2\2\u0100\u0560\3\2\2\2\u0102"+
					"\u056b\3\2\2\2\u0104\u057c\3\2\2\2\u0106\u057e\3\2\2\2\u0108\u0584\3\2"+
					"\2\2\u010a\u05a2\3\2\2\2\u010c\u05a6\3\2\2\2\u010e\u05a9\3\2\2\2\u0110"+
					"\u05b0\3\2\2\2\u0112\u05b5\3\2\2\2\u0114\u05cd\3\2\2\2\u0116\u05d5\3\2"+
					"\2\2\u0118\u05db\3\2\2\2\u011a\u05dd\3\2\2\2\u011c\u0131\5\u0088E\2\u011d"+
					"\u0121\5\4\3\2\u011e\u0120\5\6\4\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2"+
					"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0127\3\2\2\2\u0123"+
					"\u0121\3\2\2\2\u0124\u0126\5\b\5\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
					"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0132\3\2\2\2\u0129"+
					"\u0127\3\2\2\2\u012a\u012e\5\n\6\2\u012b\u012d\5\b\5\2\u012c\u012b\3\2"+
					"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
					"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u011d\3\2\2\2\u0131\u012a\3\2"+
					"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\2\2\3\u0134\u0146\3\2\2\2\u0135"+
					"\u0137\5\4\3\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\3\2"+
					"\2\2\u0138\u013a\5\6\4\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
					"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0141\3\2\2\2\u013d\u013b\3\2"+
					"\2\2\u013e\u0140\5\b\5\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
					"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
					"\2\2\u0144\u0146\7\2\2\3\u0145\u011c\3\2\2\2\u0145\u0136\3\2\2\2\u0146"+
					"\3\3\2\2\2\u0147\u0148\7#\2\2\u0148\u0149\5\u0084C\2\u0149\u014a\7B\2"+
					"\2\u014a\5\3\2\2\2\u014b\u014d\7\34\2\2\u014c\u014e\7)\2\2\u014d\u014c"+
					"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\5\u0084C"+
					"\2\u0150\u0151\7D\2\2\u0151\u0153\7V\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
					"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7B\2\2\u0155\7\3\2\2\2\u0156"+
					"\u0159\5\n\6\2\u0157\u0159\7B\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2"+
					"\2\2\u0159\t\3\2\2\2\u015a\u015d\5\f\7\2\u015b\u015e\5\22\n\2\u015c\u015e"+
					"\5&\24\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\13\3\2\2\2\u015f"+
					"\u0161\5\16\b\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3"+
					"\2\2\2\u0162\u0163\3\2\2\2\u0163\r\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0168"+
					"\5\u008aF\2\u0166\u0168\t\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2"+
					"\2\u0168\17\3\2\2\2\u0169\u016b\5b\62\2\u016a\u0169\3\2\2\2\u016b\u016e"+
					"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\21\3\2\2\2\u016e"+
					"\u016c\3\2\2\2\u016f\u0172\5\24\13\2\u0170\u0172\5\34\17\2\u0171\u016f"+
					"\3\2\2\2\u0171\u0170\3\2\2\2\u0172\23\3\2\2\2\u0173\u0174\7\f\2\2\u0174"+
					"\u0176\7g\2\2\u0175\u0177\5\26\f\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2"+
					"\2\2\u0177\u017a\3\2\2\2\u0178\u0179\7\24\2\2\u0179\u017b\5j\66\2\u017a"+
					"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\7\33"+
					"\2\2\u017d\u017f\5*\26\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
					"\u0180\3\2\2\2\u0180\u0181\5,\27\2\u0181\25\3\2\2\2\u0182\u0183\7G\2\2"+
					"\u0183\u0188\5\30\r\2\u0184\u0185\7C\2\2\u0185\u0187\5\30\r\2\u0186\u0184"+
					"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
					"\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7F\2\2\u018c\27\3\2\2\2"+
					"\u018d\u0190\7g\2\2\u018e\u018f\7\24\2\2\u018f\u0191\5\32\16\2\u0190\u018e"+
					"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\31\3\2\2\2\u0192\u0197\5j\66\2\u0193"+
					"\u0194\7X\2\2\u0194\u0196\5j\66\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2"+
					"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\33\3\2\2\2\u0199\u0197"+
					"\3\2\2\2\u019a\u019b\7\23\2\2\u019b\u019e\7g\2\2\u019c\u019d\7\33\2\2"+
					"\u019d\u019f\5*\26\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
					"\3\2\2\2\u01a0\u01a1\5\36\20\2\u01a1\35\3\2\2\2\u01a2\u01a4\7>\2\2\u01a3"+
					"\u01a5\5 \21\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2"+
					"\2\2\u01a6\u01a8\7C\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
					"\u01aa\3\2\2\2\u01a9\u01ab\5$\23\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2"+
					"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7?\2\2\u01ad\37\3\2\2\2\u01ae\u01b3"+
					"\5\"\22\2\u01af\u01b0\7C\2\2\u01b0\u01b2\5\"\22\2\u01b1\u01af\3\2\2\2"+
					"\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4!\3"+
					"\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5\u0088E\2\u01b7\u01b6\3\2\2\2"+
					"\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7g\2\2\u01ba\u01bc"+
					"\5\u011a\u008e\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3"+
					"\2\2\2\u01bd\u01bf\5,\27\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
					"#\3\2\2\2\u01c0\u01c4\7B\2\2\u01c1\u01c3\5\60\31\2\u01c2\u01c1\3\2\2\2"+
					"\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5%\3"+
					"\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\5(\25\2\u01c8\u01ca\5\u0096L\2"+
					"\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\'\3\2\2\2\u01cb\u01cc\7"+
					"\37\2\2\u01cc\u01ce\7g\2\2\u01cd\u01cf\5\26\f\2\u01ce\u01cd\3\2\2\2\u01ce"+
					"\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7\24\2\2\u01d1\u01d3\5"+
					"*\26\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
					"\u01d5\5.\30\2\u01d5)\3\2\2\2\u01d6\u01db\5j\66\2\u01d7\u01d8\7C\2\2\u01d8"+
					"\u01da\5j\66\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2"+
					"\2\2\u01db\u01dc\3\2\2\2\u01dc+\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e2"+
					"\7>\2\2\u01df\u01e1\5\60\31\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2"+
					"\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2"+
					"\3\2\2\2\u01e5\u01e6\7?\2\2\u01e6-\3\2\2\2\u01e7\u01eb\7>\2\2\u01e8\u01ea"+
					"\5> \2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
					"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7?"+
					"\2\2\u01ef/\3\2\2\2\u01f0\u01f9\7B\2\2\u01f1\u01f3\7)\2\2\u01f2\u01f1"+
					"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f9\5\u00a6T"+
					"\2\u01f5\u01f6\5\20\t\2\u01f6\u01f7\5\62\32\2\u01f7\u01f9\3\2\2\2\u01f8"+
					"\u01f0\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f9\61\3\2\2"+
					"\2\u01fa\u0204\5\66\34\2\u01fb\u0204\5\64\33\2\u01fc\u01fd\7\63\2\2\u01fd"+
					"\u01fe\7g\2\2\u01fe\u0204\5H%\2\u01ff\u0200\7g\2\2\u0200\u0204\5P)\2\u0201"+
					"\u0204\5&\24\2\u0202\u0204\5\22\n\2\u0203\u01fa\3\2\2\2\u0203\u01fb\3"+
					"\2\2\2\u0203\u01fc\3\2\2\2\u0203\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
					"\u0202\3\2\2\2\u0204\63\3\2\2\2\u0205\u0208\5j\66\2\u0206\u0209\5:\36"+
					"\2\u0207\u0209\5<\37\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\65"+
					"\3\2\2\2\u020a\u020b\5\26\f\2\u020b\u020c\58\35\2\u020c\67\3\2\2\2\u020d"+
					"\u0210\5j\66\2\u020e\u0210\7\63\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3"+
					"\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7g\2\2\u0212\u0216\5F$\2\u0213"+
					"\u0214\7g\2\2\u0214\u0216\5P)\2\u0215\u020f\3\2\2\2\u0215\u0213\3\2\2"+
					"\2\u02169\3\2\2\2\u0217\u0218\7g\2\2\u0218\u0219\5F$\2\u0219;\3\2\2\2"+
					"\u021a\u021b\5T+\2\u021b\u021c\7B\2\2\u021c=\3\2\2\2\u021d\u021e\5\20"+
					"\t\2\u021e\u021f\5@!\2\u021f\u0222\3\2\2\2\u0220\u0222\7B\2\2\u0221\u021d"+
					"\3\2\2\2\u0221\u0220\3\2\2\2\u0222?\3\2\2\2\u0223\u022b\5B\"\2\u0224\u022b"+
					"\5L\'\2\u0225\u0226\7\63\2\2\u0226\u0227\7g\2\2\u0227\u022b\5N(\2\u0228"+
					"\u022b\5&\24\2\u0229\u022b\5\22\n\2\u022a\u0223\3\2\2\2\u022a\u0224\3"+
					"\2\2\2\u022a\u0225\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b"+
					"A\3\2\2\2\u022c\u022d\5j\66\2\u022d\u022e\7g\2\2\u022e\u022f\5D#\2\u022f"+
					"C\3\2\2\2\u0230\u0231\5X-\2\u0231\u0232\7B\2\2\u0232\u0235\3\2\2\2\u0233"+
					"\u0235\5J&\2\u0234\u0230\3\2\2\2\u0234\u0233\3\2\2\2\u0235E\3\2\2\2\u0236"+
					"\u023b\5z>\2\u0237\u0238\7@\2\2\u0238\u023a\7A\2\2\u0239\u0237\3\2\2\2"+
					"\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0240"+
					"\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7\60\2\2\u023f\u0241\5x=\2\u0240"+
					"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0245\5\u0080"+
					"A\2\u0243\u0245\7B\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245G"+
					"\3\2\2\2\u0246\u0249\5z>\2\u0247\u0248\7\60\2\2\u0248\u024a\5x=\2\u0249"+
					"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u024e\5\u0080"+
					"A\2\u024c\u024e\7B\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024eI"+
					"\3\2\2\2\u024f\u0254\5z>\2\u0250\u0251\7@\2\2\u0251\u0253\7A\2\2\u0252"+
					"\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
					"\2\2\u0255\u0259\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\60\2\2\u0258"+
					"\u025a\5x=\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2"+
					"\2\u025b\u025c\7B\2\2\u025cK\3\2\2\2\u025d\u0260\5\26\f\2\u025e\u0261"+
					"\5j\66\2\u025f\u0261\7\63\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2"+
					"\u0261\u0262\3\2\2\2\u0262\u0263\7g\2\2\u0263\u0264\5J&\2\u0264M\3\2\2"+
					"\2\u0265\u0268\5z>\2\u0266\u0267\7\60\2\2\u0267\u0269\5x=\2\u0268\u0266"+
					"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7B\2\2\u026b"+
					"O\3\2\2\2\u026c\u026f\5z>\2\u026d\u026e\7\60\2\2\u026e\u0270\5x=\2\u026f"+
					"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\5\u0082"+
					"B\2\u0272Q\3\2\2\2\u0273\u0274\7g\2\2\u0274\u0275\5Z.\2\u0275S\3\2\2\2"+
					"\u0276\u027b\5V,\2\u0277\u0278\7C\2\2\u0278\u027a\5V,\2\u0279\u0277\3"+
					"\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
					"U\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0281\5\\/\2\u027f\u0280\7E\2\2\u0280"+
					"\u0282\5^\60\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282W\3\2\2\2"+
					"\u0283\u0288\5Z.\2\u0284\u0285\7C\2\2\u0285\u0287\5R*\2\u0286\u0284\3"+
					"\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
					"Y\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7@\2\2\u028c\u028e\7A\2\2\u028d"+
					"\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
					"\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7E\2\2\u0293"+
					"\u0294\5^\60\2\u0294[\3\2\2\2\u0295\u029a\7g\2\2\u0296\u0297\7@\2\2\u0297"+
					"\u0299\7A\2\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2"+
					"\2\2\u029a\u029b\3\2\2\2\u029b]\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02a0"+
					"\5`\61\2\u029e\u02a0\5\u00d8m\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2"+
					"\2\u02a0_\3\2\2\2\u02a1\u02ad\7>\2\2\u02a2\u02a7\5^\60\2\u02a3\u02a4\7"+
					"C\2\2\u02a4\u02a6\5^\60\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7"+
					"\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
					"\2\2\u02aa\u02ac\7C\2\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
					"\u02ae\3\2\2\2\u02ad\u02a2\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2"+
					"\2\2\u02af\u02b0\7?\2\2\u02b0a\3\2\2\2\u02b1\u02b4\5\u008aF\2\u02b2\u02b4"+
					"\t\3\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4c\3\2\2\2\u02b5"+
					"\u02b6\5\u0084C\2\u02b6e\3\2\2\2\u02b7\u02b8\7g\2\2\u02b8g\3\2\2\2\u02b9"+
					"\u02ba\5\u0084C\2\u02bai\3\2\2\2\u02bb\u02c0\5n8\2\u02bc\u02bd\7@\2\2"+
					"\u02bd\u02bf\7A\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be"+
					"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02cd\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
					"\u02c8\5p9\2\u02c4\u02c5\7@\2\2\u02c5\u02c7\7A\2\2\u02c6\u02c4\3\2\2\2"+
					"\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cd"+
					"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cd\5l\67\2\u02cc\u02bb\3\2\2\2\u02cc"+
					"\u02c3\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cdk\3\2\2\2\u02ce\u02cf\7\3\2\2"+
					"\u02cfm\3\2\2\2\u02d0\u02d2\7g\2\2\u02d1\u02d3\5t;\2\u02d2\u02d1\3\2\2"+
					"\2\u02d2\u02d3\3\2\2\2\u02d3\u02db\3\2\2\2\u02d4\u02d5\7D\2\2\u02d5\u02d7"+
					"\7g\2\2\u02d6\u02d8\5t;\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
					"\u02da\3\2\2\2\u02d9\u02d4\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2"+
					"\2\2\u02db\u02dc\3\2\2\2\u02dco\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df"+
					"\t\4\2\2\u02dfq\3\2\2\2\u02e0\u02e3\7\25\2\2\u02e1\u02e3\5\u008aF\2\u02e2"+
					"\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3s\3\2\2\2\u02e4\u02e5\7G\2\2\u02e5"+
					"\u02ea\5v<\2\u02e6\u02e7\7C\2\2\u02e7\u02e9\5v<\2\u02e8\u02e6\3\2\2\2"+
					"\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed"+
					"\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7F\2\2\u02eeu\3\2\2\2\u02ef\u02f6"+
					"\5j\66\2\u02f0\u02f3\7J\2\2\u02f1\u02f2\t\5\2\2\u02f2\u02f4\5j\66\2\u02f3"+
					"\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02ef\3\2"+
					"\2\2\u02f5\u02f0\3\2\2\2\u02f6w\3\2\2\2\u02f7\u02fc\5\u0084C\2\u02f8\u02f9"+
					"\7C\2\2\u02f9\u02fb\5\u0084C\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe\3\2\2\2"+
					"\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fdy\3\2\2\2\u02fe\u02fc\3"+
					"\2\2\2\u02ff\u0301\7<\2\2\u0300\u0302\5|?\2\u0301\u0300\3\2\2\2\u0301"+
					"\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7=\2\2\u0304{\3\2\2\2\u0305"+
					"\u0306\5\u00aeX\2\u0306\u0307\5j\66\2\u0307\u0308\5~@\2\u0308}\3\2\2\2"+
					"\u0309\u030c\5\\/\2\u030a\u030b\7C\2\2\u030b\u030d\5|?\2\u030c\u030a\3"+
					"\2\2\2\u030c\u030d\3\2\2\2\u030d\u0311\3\2\2\2\u030e\u030f\7i\2\2\u030f"+
					"\u0311\5\\/\2\u0310\u0309\3\2\2\2\u0310\u030e\3\2\2\2\u0311\177\3\2\2"+
					"\2\u0312\u0313\5\u00a6T\2\u0313\u0081\3\2\2\2\u0314\u0315\5\u00a6T\2\u0315"+
					"\u0083\3\2\2\2\u0316\u031b\7g\2\2\u0317\u0318\7D\2\2\u0318\u031a\7g\2"+
					"\2\u0319\u0317\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c"+
					"\3\2\2\2\u031c\u0085\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u031f\t\6\2\2\u031f"+
					"\u0087\3\2\2\2\u0320\u0322\5\u008aF\2\u0321\u0320\3\2\2\2\u0322\u0323"+
					"\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0089\3\2\2\2\u0325"+
					"\u0326\7h\2\2\u0326\u032d\5\u008cG\2\u0327\u032a\7<\2\2\u0328\u032b\5"+
					"\u008eH\2\u0329\u032b\5\u0092J\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2"+
					"\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\7=\2\2\u032d\u0327"+
					"\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u008b\3\2\2\2\u032f\u0334\7g\2\2\u0330"+
					"\u0331\7D\2\2\u0331\u0333\7g\2\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2"+
					"\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u008d\3\2\2\2\u0336\u0334"+
					"\3\2\2\2\u0337\u033c\5\u0090I\2\u0338\u0339\7C\2\2\u0339\u033b\5\u0090"+
					"I\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
					"\u033d\3\2\2\2\u033d\u008f\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\7g"+
					"\2\2\u0340\u0341\7E\2\2\u0341\u0342\5\u0092J\2\u0342\u0091\3\2\2\2\u0343"+
					"\u0347\5\u00dco\2\u0344\u0347\5\u008aF\2\u0345\u0347\5\u0094K\2\u0346"+
					"\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u0093\3\2"+
					"\2\2\u0348\u0351\7>\2\2\u0349\u034e\5\u0092J\2\u034a\u034b\7C\2\2\u034b"+
					"\u034d\5\u0092J\2\u034c\u034a\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c"+
					"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0351"+
					"\u0349\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0355\7C"+
					"\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
					"\u0357\7?\2\2\u0357\u0095\3\2\2\2\u0358\u0359\7h\2\2\u0359\u035a\7\37"+
					"\2\2\u035a\u035b\7g\2\2\u035b\u035c\5\u0098M\2\u035c\u0097\3\2\2\2\u035d"+
					"\u0361\7>\2\2\u035e\u0360\5\u009aN\2\u035f\u035e\3\2\2\2\u0360\u0363\3"+
					"\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363"+
					"\u0361\3\2\2\2\u0364\u0365\7?\2\2\u0365\u0099\3\2\2\2\u0366\u0367\5\20"+
					"\t\2\u0367\u0368\5\u009cO\2\u0368\u036b\3\2\2\2\u0369\u036b\7B\2\2\u036a"+
					"\u0366\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u009b\3\2\2\2\u036c\u036d\5j"+
					"\66\2\u036d\u036e\5\u009eP\2\u036e\u036f\7B\2\2\u036f\u0381\3\2\2\2\u0370"+
					"\u0372\5\24\13\2\u0371\u0373\7B\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3"+
					"\2\2\2\u0373\u0381\3\2\2\2\u0374\u0376\5(\25\2\u0375\u0377\7B\2\2\u0376"+
					"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0381\3\2\2\2\u0378\u037a\5\34"+
					"\17\2\u0379\u037b\7B\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
					"\u0381\3\2\2\2\u037c\u037e\5\u0096L\2\u037d\u037f\7B\2\2\u037e\u037d\3"+
					"\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u036c\3\2\2\2\u0380"+
					"\u0370\3\2\2\2\u0380\u0374\3\2\2\2\u0380\u0378\3\2\2\2\u0380\u037c\3\2"+
					"\2\2\u0381\u009d\3\2\2\2\u0382\u0385\5\u00a0Q\2\u0383\u0385\5\u00a2R\2"+
					"\u0384\u0382\3\2\2\2\u0384\u0383\3\2\2\2\u0385\u009f\3\2\2\2\u0386\u0387"+
					"\7g\2\2\u0387\u0388\7<\2\2\u0388\u038a\7=\2\2\u0389\u038b\5\u00a4S\2\u038a"+
					"\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u00a1\3\2\2\2\u038c\u038d\5T"+
					"+\2\u038d\u00a3\3\2\2\2\u038e\u038f\7\17\2\2\u038f\u0390\5\u0092J\2\u0390"+
					"\u00a5\3\2\2\2\u0391\u0395\7>\2\2\u0392\u0394\5\u00a8U\2\u0393\u0392\3"+
					"\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
					"\u0398\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u0399\7?\2\2\u0399\u00a7\3\2"+
					"\2\2\u039a\u039e\5\u00aaV\2\u039b\u039e\5\n\6\2\u039c\u039e\5\u00b0Y\2"+
					"\u039d\u039a\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e\u00a9"+
					"\3\2\2\2\u039f\u03a0\5\u00acW\2\u03a0\u03a1\7B\2\2\u03a1\u00ab\3\2\2\2"+
					"\u03a2\u03a3\5\u00aeX\2\u03a3\u03a4\5j\66\2\u03a4\u03a5\5T+\2\u03a5\u00ad"+
					"\3\2\2\2\u03a6\u03a8\5r:\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
					"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u00af\3\2\2\2\u03ab\u03a9\3\2"+
					"\2\2\u03ac\u0403\5\u00a6T\2\u03ad\u03ae\7\5\2\2\u03ae\u03b1\5\u00d8m\2"+
					"\u03af\u03b0\7K\2\2\u03b0\u03b2\5\u00d8m\2\u03b1\u03af\3\2\2\2\u03b1\u03b2"+
					"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\7B\2\2\u03b4\u0403\3\2\2\2\u03b5"+
					"\u03b6\7\31\2\2\u03b6\u03b7\5\u00d0i\2\u03b7\u03ba\5\u00b0Y\2\u03b8\u03b9"+
					"\7\22\2\2\u03b9\u03bb\5\u00b0Y\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2"+
					"\2\u03bb\u0403\3\2\2\2\u03bc\u03bd\7\30\2\2\u03bd\u03be\7<\2\2\u03be\u03bf"+
					"\5\u00c8e\2\u03bf\u03c0\7=\2\2\u03c0\u03c1\5\u00b0Y\2\u03c1\u0403\3\2"+
					"\2\2\u03c2\u03c3\7\65\2\2\u03c3\u03c4\5\u00d0i\2\u03c4\u03c5\5\u00b0Y"+
					"\2\u03c5\u0403\3\2\2\2\u03c6\u03c7\7\20\2\2\u03c7\u03c8\5\u00b0Y\2\u03c8"+
					"\u03c9\7\65\2\2\u03c9\u03ca\5\u00d0i\2\u03ca\u03cb\7B\2\2\u03cb\u0403"+
					"\3\2\2\2\u03cc\u03cd\7\62\2\2\u03cd\u03d3\5\u00a6T\2\u03ce\u03d0\5\u00b2"+
					"Z\2\u03cf\u03d1\5\u00b8]\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
					"\u03d4\3\2\2\2\u03d2\u03d4\5\u00b8]\2\u03d3\u03ce\3\2\2\2\u03d3\u03d2"+
					"\3\2\2\2\u03d4\u0403\3\2\2\2\u03d5\u03d6\7\62\2\2\u03d6\u03d7\5\u00ba"+
					"^\2\u03d7\u03d9\5\u00a6T\2\u03d8\u03da\5\u00b2Z\2\u03d9\u03d8\3\2\2\2"+
					"\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03dd\5\u00b8]\2\u03dc"+
					"\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u0403\3\2\2\2\u03de\u03df\7,"+
					"\2\2\u03df\u03e0\5\u00d0i\2\u03e0\u03e1\7>\2\2\u03e1\u03e2\5\u00c2b\2"+
					"\u03e2\u03e3\7?\2\2\u03e3\u0403\3\2\2\2\u03e4\u03e5\7-\2\2\u03e5\u03e6"+
					"\5\u00d0i\2\u03e6\u03e7\5\u00a6T\2\u03e7\u0403\3\2\2\2\u03e8\u03ea\7\'"+
					"\2\2\u03e9\u03eb\5\u00d8m\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
					"\u03ec\3\2\2\2\u03ec\u0403\7B\2\2\u03ed\u03ee\7/\2\2\u03ee\u03ef\5\u00d8"+
					"m\2\u03ef\u03f0\7B\2\2\u03f0\u0403\3\2\2\2\u03f1\u03f3\7\7\2\2\u03f2\u03f4"+
					"\7g\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
					"\u0403\7B\2\2\u03f6\u03f8\7\16\2\2\u03f7\u03f9\7g\2\2\u03f8\u03f7\3\2"+
					"\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0403\7B\2\2\u03fb"+
					"\u0403\7B\2\2\u03fc\u03fd\5\u00d4k\2\u03fd\u03fe\7B\2\2\u03fe\u0403\3"+
					"\2\2\2\u03ff\u0400\7g\2\2\u0400\u0401\7K\2\2\u0401\u0403\5\u00b0Y\2\u0402"+
					"\u03ac\3\2\2\2\u0402\u03ad\3\2\2\2\u0402\u03b5\3\2\2\2\u0402\u03bc\3\2"+
					"\2\2\u0402\u03c2\3\2\2\2\u0402\u03c6\3\2\2\2\u0402\u03cc\3\2\2\2\u0402"+
					"\u03d5\3\2\2\2\u0402\u03de\3\2\2\2\u0402\u03e4\3\2\2\2\u0402\u03e8\3\2"+
					"\2\2\u0402\u03ed\3\2\2\2\u0402\u03f1\3\2\2\2\u0402\u03f6\3\2\2\2\u0402"+
					"\u03fb\3\2\2\2\u0402\u03fc\3\2\2\2\u0402\u03ff\3\2\2\2\u0403\u00b1\3\2"+
					"\2\2\u0404\u0406\5\u00b4[\2\u0405\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
					"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u00b3\3\2\2\2\u0409\u040a\7\n"+
					"\2\2\u040a\u040b\7<\2\2\u040b\u040c\5\u00aeX\2\u040c\u040d\5\u00b6\\\2"+
					"\u040d\u040e\7g\2\2\u040e\u040f\7=\2\2\u040f\u0410\5\u00a6T\2\u0410\u00b5"+
					"\3\2\2\2\u0411\u0416\5\u0084C\2\u0412\u0413\7Y\2\2\u0413\u0415\5\u0084"+
					"C\2\u0414\u0412\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416"+
					"\u0417\3\2\2\2\u0417\u00b7\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7\26"+
					"\2\2\u041a\u041b\5\u00a6T\2\u041b\u00b9\3\2\2\2\u041c\u041d\7<\2\2\u041d"+
					"\u041f\5\u00bc_\2\u041e\u0420\7B\2\2\u041f\u041e\3\2\2\2\u041f\u0420\3"+
					"\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\7=\2\2\u0422\u00bb\3\2\2\2\u0423"+
					"\u0428\5\u00be`\2\u0424\u0425\7B\2\2\u0425\u0427\5\u00be`\2\u0426\u0424"+
					"\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
					"\u00bd\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\5\u00aeX\2\u042c\u042d"+
					"\5n8\2\u042d\u042e\5\\/\2\u042e\u042f\7E\2\2\u042f\u0430\5\u00d8m\2\u0430"+
					"\u00bf\3\2\2\2\u0431\u0432\5\u00aeX\2\u0432\u0433\5j\66\2\u0433\u0434"+
					"\5\\/\2\u0434\u00c1\3\2\2\2\u0435\u0437\5\u00c4c\2\u0436\u0435\3\2\2\2"+
					"\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u00c3"+
					"\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043d\5\u00c6d\2\u043c\u043b\3\2\2"+
					"\2\u043d\u043e\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0443"+
					"\3\2\2\2\u0440\u0442\5\u00a8U\2\u0441\u0440\3\2\2\2\u0442\u0445\3\2\2"+
					"\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u00c5\3\2\2\2\u0445\u0443"+
					"\3\2\2\2\u0446\u0447\7\t\2\2\u0447\u0448\5\u00d6l\2\u0448\u0449\7K\2\2"+
					"\u0449\u0451\3\2\2\2\u044a\u044b\7\t\2\2\u044b\u044c\5f\64\2\u044c\u044d"+
					"\7K\2\2\u044d\u0451\3\2\2\2\u044e\u044f\7\17\2\2\u044f\u0451\7K\2\2\u0450"+
					"\u0446\3\2\2\2\u0450\u044a\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u00c7\3\2"+
					"\2\2\u0452\u045f\5\u00ccg\2\u0453\u0455\5\u00caf\2\u0454\u0453\3\2\2\2"+
					"\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\7B\2\2\u0457\u0459"+
					"\5\u00d8m\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2"+
					"\2\u045a\u045c\7B\2\2\u045b\u045d\5\u00ceh\2\u045c\u045b\3\2\2\2\u045c"+
					"\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0452\3\2\2\2\u045e\u0454\3\2"+
					"\2\2\u045f\u00c9\3\2\2\2\u0460\u0463\5\u00acW\2\u0461\u0463\5\u00d2j\2"+
					"\u0462\u0460\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u00cb\3\2\2\2\u0464\u0465"+
					"\5\u00aeX\2\u0465\u0466\5j\66\2\u0466\u0467\7g\2\2\u0467\u0468\7K\2\2"+
					"\u0468\u0469\5\u00d8m\2\u0469\u00cd\3\2\2\2\u046a\u046b\5\u00d2j\2\u046b"+
					"\u00cf\3\2\2\2\u046c\u046d\7<\2\2\u046d\u046e\5\u00d8m\2\u046e\u046f\7"+
					"=\2\2\u046f\u00d1\3\2\2\2\u0470\u0475\5\u00d8m\2\u0471\u0472\7C\2\2\u0472"+
					"\u0474\5\u00d8m\2\u0473\u0471\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473"+
					"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u00d3\3\2\2\2\u0477\u0475\3\2\2\2\u0478"+
					"\u0479\5\u00d8m\2\u0479\u00d5\3\2\2\2\u047a\u047b\5\u00d8m\2\u047b\u00d7"+
					"\3\2\2\2\u047c\u0480\5\u00dco\2\u047d\u047e\5\u00dan\2\u047e\u047f\5\u00d8"+
					"m\2\u047f\u0481\3\2\2\2\u0480\u047d\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
					"\u00d9\3\2\2\2\u0482\u0483\t\7\2\2\u0483\u00db\3\2\2\2\u0484\u048a\5\u00de"+
					"p\2\u0485\u0486\7J\2\2\u0486\u0487\5\u00d8m\2\u0487\u0488\7K\2\2\u0488"+
					"\u0489\5\u00dco\2\u0489\u048b\3\2\2\2\u048a\u0485\3\2\2\2\u048a\u048b"+
					"\3\2\2\2\u048b\u00dd\3\2\2\2\u048c\u0491\5\u00e0q\2\u048d\u048e\7Q\2\2"+
					"\u048e\u0490\5\u00e0q\2\u048f\u048d\3\2\2\2\u0490\u0493\3\2\2\2\u0491"+
					"\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u00df\3\2\2\2\u0493\u0491\3\2"+
					"\2\2\u0494\u0499\5\u00e2r\2\u0495\u0496\7P\2\2\u0496\u0498\5\u00e2r\2"+
					"\u0497\u0495\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a"+
					"\3\2\2\2\u049a\u00e1\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u04a1\5\u00e4s"+
					"\2\u049d\u049e\7Y\2\2\u049e\u04a0\5\u00e4s\2\u049f\u049d\3\2\2\2\u04a0"+
					"\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u00e3\3\2"+
					"\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a9\5\u00e6t\2\u04a5\u04a6\7Z\2\2\u04a6"+
					"\u04a8\5\u00e6t\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7"+
					"\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u00e5\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac"+
					"\u04b1\5\u00e8u\2\u04ad\u04ae\7X\2\2\u04ae\u04b0\5\u00e8u\2\u04af\u04ad"+
					"\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
					"\u00e7\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b9\5\u00eav\2\u04b5\u04b6"+
					"\t\b\2\2\u04b6\u04b8\5\u00eav\2\u04b7\u04b5\3\2\2\2\u04b8\u04bb\3\2\2"+
					"\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u00e9\3\2\2\2\u04bb\u04b9"+
					"\3\2\2\2\u04bc\u04bf\5\u00ecw\2\u04bd\u04be\7\35\2\2\u04be\u04c0\5j\66"+
					"\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u00eb\3\2\2\2\u04c1\u04c7"+
					"\5\u00f0y\2\u04c2\u04c3\5\u00eex\2\u04c3\u04c4\5\u00f0y\2\u04c4\u04c6"+
					"\3\2\2\2\u04c5\u04c2\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7"+
					"\u04c8\3\2\2\2\u04c8\u00ed\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cb\t\t"+
					"\2\2\u04cb\u00ef\3\2\2\2\u04cc\u04d2\5\u00f4{\2\u04cd\u04ce\5\u00f2z\2"+
					"\u04ce\u04cf\5\u00f4{\2\u04cf\u04d1\3\2\2\2\u04d0\u04cd\3\2\2\2\u04d1"+
					"\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u00f1\3\2"+
					"\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d6\7G\2\2\u04d6\u04dd\7G\2\2\u04d7\u04d8"+
					"\7F\2\2\u04d8\u04d9\7F\2\2\u04d9\u04dd\7F\2\2\u04da\u04db\7F\2\2\u04db"+
					"\u04dd\7F\2\2\u04dc\u04d5\3\2\2\2\u04dc\u04d7\3\2\2\2\u04dc\u04da\3\2"+
					"\2\2\u04dd\u00f3\3\2\2\2\u04de\u04e3\5\u00f6|\2\u04df\u04e0\t\n\2\2\u04e0"+
					"\u04e2\5\u00f6|\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1"+
					"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00f5\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6"+
					"\u04eb\5\u00f8}\2\u04e7\u04e8\t\13\2\2\u04e8\u04ea\5\u00f8}\2\u04e9\u04e7"+
					"\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
					"\u00f7\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04ef\7T\2\2\u04ef\u04f8\5\u00f8"+
					"}\2\u04f0\u04f1\7U\2\2\u04f1\u04f8\5\u00f8}\2\u04f2\u04f3\7R\2\2\u04f3"+
					"\u04f8\5\u00f8}\2\u04f4\u04f5\7S\2\2\u04f5\u04f8\5\u00f8}\2\u04f6\u04f8"+
					"\5\u00fa~\2\u04f7\u04ee\3\2\2\2\u04f7\u04f0\3\2\2\2\u04f7\u04f2\3\2\2"+
					"\2\u04f7\u04f4\3\2\2\2\u04f7\u04f6\3\2\2\2\u04f8\u00f9\3\2\2\2\u04f9\u04fa"+
					"\7I\2\2\u04fa\u0509\5\u00f8}\2\u04fb\u04fc\7H\2\2\u04fc\u0509\5\u00f8"+
					"}\2\u04fd\u0509\5\u00fc\177\2\u04fe\u0502\5\u00fe\u0080\2\u04ff\u0501"+
					"\5\u0114\u008b\2\u0500\u04ff\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3"+
					"\2\2\2\u0502\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
					"\u0507\t\f\2\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2"+
					"\2\2\u0508\u04f9\3\2\2\2\u0508\u04fb\3\2\2\2\u0508\u04fd\3\2\2\2\u0508"+
					"\u04fe\3\2\2\2\u0509\u00fb\3\2\2\2\u050a\u050b\7<\2\2\u050b\u050c\5p9"+
					"\2\u050c\u050d\7=\2\2\u050d\u050e\5\u00f8}\2\u050e\u0518\3\2\2\2\u050f"+
					"\u0512\7<\2\2\u0510\u0513\5j\66\2\u0511\u0513\5\u00d8m\2\u0512\u0510\3"+
					"\2\2\2\u0512\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\7=\2\2\u0515"+
					"\u0516\5\u00fa~\2\u0516\u0518\3\2\2\2\u0517\u050a\3\2\2\2\u0517\u050f"+
					"\3\2\2\2\u0518\u00fd\3\2\2\2\u0519\u0543\5\u00d0i\2\u051a\u051c\7.\2\2"+
					"\u051b\u051d\5\u011a\u008e\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
					"\u0543\3\2\2\2\u051e\u051f\7+\2\2\u051f\u0543\5\u0116\u008c\2\u0520\u0543"+
					"\5\u0086D\2\u0521\u0522\7\"\2\2\u0522\u0543\5\u0102\u0082\2\u0523\u0527"+
					"\5\u010e\u0088\2\u0524\u0528\5\u0118\u008d\2\u0525\u0526\7.\2\2\u0526"+
					"\u0528\5\u011a\u008e\2\u0527\u0524\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u0543"+
					"\3\2\2\2\u0529\u052e\7g\2\2\u052a\u052b\7D\2\2\u052b\u052d\7g\2\2\u052c"+
					"\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2"+
					"\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0533\5\u0100\u0081"+
					"\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0543\3\2\2\2\u0534\u0539"+
					"\5p9\2\u0535\u0536\7@\2\2\u0536\u0538\7A\2\2\u0537\u0535\3\2\2\2\u0538"+
					"\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\3\2"+
					"\2\2\u053b\u0539\3\2\2\2\u053c\u053d\7D\2\2\u053d\u053e\7\f\2\2\u053e"+
					"\u0543\3\2\2\2\u053f\u0540\7\63\2\2\u0540\u0541\7D\2\2\u0541\u0543\7\f"+
					"\2\2\u0542\u0519\3\2\2\2\u0542\u051a\3\2\2\2\u0542\u051e\3\2\2\2\u0542"+
					"\u0520\3\2\2\2\u0542\u0521\3\2\2\2\u0542\u0523\3\2\2\2\u0542\u0529\3\2"+
					"\2\2\u0542\u0534\3\2\2\2\u0542\u053f\3\2\2\2\u0543\u00ff\3\2\2\2\u0544"+
					"\u0545\7@\2\2\u0545\u0547\7A\2\2\u0546\u0544\3\2\2\2\u0547\u0548\3\2\2"+
					"\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b"+
					"\7D\2\2\u054b\u0561\7\f\2\2\u054c\u054d\7@\2\2\u054d\u054e\5\u00d8m\2"+
					"\u054e\u054f\7A\2\2\u054f\u0561\3\2\2\2\u0550\u0561\5\u011a\u008e\2\u0551"+
					"\u0552\7D\2\2\u0552\u0561\7\f\2\2\u0553\u0554\7D\2\2\u0554\u0561\5\u010c"+
					"\u0087\2\u0555\u0556\7D\2\2\u0556\u0561\7.\2\2\u0557\u0558\7D\2\2\u0558"+
					"\u0559\7+\2\2\u0559\u0561\5\u011a\u008e\2\u055a\u055b\7D\2\2\u055b\u055d"+
					"\7\"\2\2\u055c\u055e\5\u010e\u0088\2\u055d\u055c\3\2\2\2\u055d\u055e\3"+
					"\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\5\u0106\u0084\2\u0560\u0546\3\2"+
					"\2\2\u0560\u054c\3\2\2\2\u0560\u0550\3\2\2\2\u0560\u0551\3\2\2\2\u0560"+
					"\u0553\3\2\2\2\u0560\u0555\3\2\2\2\u0560\u0557\3\2\2\2\u0560\u055a\3\2"+
					"\2\2\u0561\u0101\3\2\2\2\u0562\u0563\5\u010e\u0088\2\u0563\u0564\5\u0104"+
					"\u0083\2\u0564\u0565\5\u010a\u0086\2\u0565\u056c\3\2\2\2\u0566\u0569\5"+
					"\u0104\u0083\2\u0567\u056a\5\u0108\u0085\2\u0568\u056a\5\u010a\u0086\2"+
					"\u0569\u0567\3\2\2\2\u0569\u0568\3\2\2\2\u056a\u056c\3\2\2\2\u056b\u0562"+
					"\3\2\2\2\u056b\u0566\3\2\2\2\u056c\u0103\3\2\2\2\u056d\u056f\7g\2\2\u056e"+
					"\u0570\5\u0110\u0089\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0578"+
					"\3\2\2\2\u0571\u0572\7D\2\2\u0572\u0574\7g\2\2\u0573\u0575\5\u0110\u0089"+
					"\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0571"+
					"\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
					"\u057d\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057d\5p9\2\u057c\u056d\3\2\2"+
					"\2\u057c\u057b\3\2\2\2\u057d\u0105\3\2\2\2\u057e\u0580\7g\2\2\u057f\u0581"+
					"\5\u0112\u008a\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3"+
					"\2\2\2\u0582\u0583\5\u010a\u0086\2\u0583\u0107\3\2\2\2\u0584\u05a0\7@"+
					"\2\2\u0585\u058a\7A\2\2\u0586\u0587\7@\2\2\u0587\u0589\7A\2\2\u0588\u0586"+
					"\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
					"\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u05a1\5`\61\2\u058e\u058f\5\u00d8"+
					"m\2\u058f\u0596\7A\2\2\u0590\u0591\7@\2\2\u0591\u0592\5\u00d8m\2\u0592"+
					"\u0593\7A\2\2\u0593\u0595\3\2\2\2\u0594\u0590\3\2\2\2\u0595\u0598\3\2"+
					"\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059d\3\2\2\2\u0598"+
					"\u0596\3\2\2\2\u0599\u059a\7@\2\2\u059a\u059c\7A\2\2\u059b\u0599\3\2\2"+
					"\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a1"+
					"\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u0585\3\2\2\2\u05a0\u058e\3\2\2\2\u05a1"+
					"\u0109\3\2\2\2\u05a2\u05a4\5\u011a\u008e\2\u05a3\u05a5\5,\27\2\u05a4\u05a3"+
					"\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u010b\3\2\2\2\u05a6\u05a7\5\u010e\u0088"+
					"\2\u05a7\u05a8\5\u0118\u008d\2\u05a8\u010d\3\2\2\2\u05a9\u05aa\7G\2\2"+
					"\u05aa\u05ab\5*\26\2\u05ab\u05ac\7F\2\2\u05ac\u010f\3\2\2\2\u05ad\u05ae"+
					"\7G\2\2\u05ae\u05b1\7F\2\2\u05af\u05b1\5t;\2\u05b0\u05ad\3\2\2\2\u05b0"+
					"\u05af\3\2\2\2\u05b1\u0111\3\2\2\2\u05b2\u05b3\7G\2\2\u05b3\u05b6\7F\2"+
					"\2\u05b4\u05b6\5\u010e\u0088\2\u05b5\u05b2\3\2\2\2\u05b5\u05b4\3\2\2\2"+
					"\u05b6\u0113\3\2\2\2\u05b7\u05b8\7D\2\2\u05b8\u05ba\7g\2\2\u05b9\u05bb"+
					"\5\u011a\u008e\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05ce\3"+
					"\2\2\2\u05bc\u05bd\7D\2\2\u05bd\u05ce\5\u010c\u0087\2\u05be\u05bf\7D\2"+
					"\2\u05bf\u05ce\7.\2\2\u05c0\u05c1\7D\2\2\u05c1\u05c2\7+\2\2\u05c2\u05ce"+
					"\5\u0116\u008c\2\u05c3\u05c4\7D\2\2\u05c4\u05c6\7\"\2\2\u05c5\u05c7\5"+
					"\u010e\u0088\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2"+
					"\2\2\u05c8\u05ce\5\u0106\u0084\2\u05c9\u05ca\7@\2\2\u05ca\u05cb\5\u00d8"+
					"m\2\u05cb\u05cc\7A\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05b7\3\2\2\2\u05cd\u05bc"+
					"\3\2\2\2\u05cd\u05be\3\2\2\2\u05cd\u05c0\3\2\2\2\u05cd\u05c3\3\2\2\2\u05cd"+
					"\u05c9\3\2\2\2\u05ce\u0115\3\2\2\2\u05cf\u05d6\5\u011a\u008e\2\u05d0\u05d1"+
					"\7D\2\2\u05d1\u05d3\7g\2\2\u05d2\u05d4\5\u011a\u008e\2\u05d3\u05d2\3\2"+
					"\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05cf\3\2\2\2\u05d5"+
					"\u05d0\3\2\2\2\u05d6\u0117\3\2\2\2\u05d7\u05d8\7+\2\2\u05d8\u05dc\5\u0116"+
					"\u008c\2\u05d9\u05da\7g\2\2\u05da\u05dc\5\u011a\u008e\2\u05db\u05d7\3"+
					"\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u0119\3\2\2\2\u05dd\u05df\7<\2\2\u05de"+
					"\u05e0\5\u00d2j\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1"+
					"\3\2\2\2\u05e1\u05e2\7=\2\2\u05e2\u011b\3\2\2\2\u00b2\u0121\u0127\u012e"+
					"\u0131\u0136\u013b\u0141\u0145\u014d\u0152\u0158\u015d\u0162\u0167\u016c"+
					"\u0171\u0176\u017a\u017e\u0188\u0190\u0197\u019e\u01a4\u01a7\u01aa\u01b3"+
					"\u01b7\u01bb\u01be\u01c4\u01c9\u01ce\u01d2\u01db\u01e2\u01eb\u01f2\u01f8"+
					"\u0203\u0208\u020f\u0215\u0221\u022a\u0234\u023b\u0240\u0244\u0249\u024d"+
					"\u0254\u0259\u0260\u0268\u026f\u027b\u0281\u0288\u028f\u029a\u029f\u02a7"+
					"\u02ab\u02ad\u02b3\u02c0\u02c8\u02cc\u02d2\u02d7\u02db\u02e2\u02ea\u02f3"+
					"\u02f5\u02fc\u0301\u030c\u0310\u031b\u0323\u032a\u032d\u0334\u033c\u0346"+
					"\u034e\u0351\u0354\u0361\u036a\u0372\u0376\u037a\u037e\u0380\u0384\u038a"+
					"\u0395\u039d\u03a9\u03b1\u03ba\u03d0\u03d3\u03d9\u03dc\u03ea\u03f3\u03f8"+
					"\u0402\u0407\u0416\u041f\u0428\u0438\u043e\u0443\u0450\u0454\u0458\u045c"+
					"\u045e\u0462\u0475\u0480\u048a\u0491\u0499\u04a1\u04a9\u04b1\u04b9\u04bf"+
					"\u04c7\u04d2\u04dc\u04e3\u04eb\u04f7\u0502\u0506\u0508\u0512\u0517\u051c"+
					"\u0527\u052e\u0532\u0539\u0542\u0548\u055d\u0560\u0569\u056b\u056f\u0574"+
					"\u0578\u057c\u0580\u058a\u0596\u059d\u05a0\u05a4\u05b0\u05b5\u05ba\u05c6"+
					"\u05cd\u05d3\u05d5\u05db\u05df";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}