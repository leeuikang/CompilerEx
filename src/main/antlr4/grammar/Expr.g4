grammar Expr; 
@header {
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
}

@parser::members {
   public static void main(String... args) 
   {
	ANTLRInputStream input=null;
	try{
		input = new ANTLRInputStream(System.in); 
	} catch (Exception e)
    {
        e.printStackTrace();
    }

    ExprLexer lexer = new ExprLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer); 
    ExprParser parser = new ExprParser((TokenStream)tokens);      
    ParserRuleContext tree= parser.compilationUnit();
	ParseTreeWalker walker = new ParseTreeWalker();
	MyExprListener extractor = new MyExprListener(parser);
	walker.walk(extractor, tree);
   }
}

compilationUnit
   : (test NEWLINE)*
   ;
   
test 
	: elsesentence
	| varsentence ';'
	;

elsesentence
	: Number1
	;
	  
varsentence
	: 'var' Identifier '=' daeib 
	;
	
daeib 
	:  'new' wonv 
	|	Identifier ('.' wonv2)+
	|	error
	;
	 
error 
	:  Identifier '(' Identifier* ')'     # implicterr
	|  '"'* Number1  '"'*						# primitiveerr
	| '{' ( Identifier (',' Identifier)* (',')? )? '}'		# arrayerr
	;  	

wonv
	: Identifier temp argument #uigang
	;
 
wonv2
	: Identifier argument  	
	; 
	
argument 
	: '(' Identifier? (',' Identifier)* ')' # what
	;



Identifier
	:	JavaLetter JavaLetterOrDigit*
	;
 
fragment
JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;
 
fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;
Number1 : [0-9a-zA-Z]*;
NEWLINE : [\r\n]+ ;
temp : ('<'Identifier'>')? ;
WS  :  (' '|'\t')+ {skip();} ;