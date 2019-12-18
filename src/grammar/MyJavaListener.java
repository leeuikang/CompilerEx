package grammar;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import data.ClassMethod;
import data.LocalVar;
import data.MemberVar;
import data.VarSentence;
import main.Main;

import org.antlr.v4.runtime.misc.Interval;

public class MyJavaListener extends JavaBaseListener{
   JavaParser parser;
   String returnType;
   String methodName = null;
   String className;
   ArrayList<String> params = new ArrayList<>();
   Main main = Main.getInstance();
   
   //변수들의 정보
   boolean var_bit = false;		//varType일때 참
   boolean member_bit = false;	//전역변수일때 참
   ArrayList<String> rightSentenceParams = new ArrayList<>();
   String rightSentence;
   String varName;
   String varType;
   
   public MyJavaListener(JavaParser parser){ this.parser =parser;}
   
   
   //클래스이름 파싱
   @Override public void enterNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx) { 
      className = ctx.Identifier().getText();
      if( ctx.typeParameters() != null ) {
    	  className += ctx.typeParameters().getText();
      }
   }
   
   
   //클래스 종료
   @Override public void exitNormalClassDeclaration(JavaParser.NormalClassDeclarationContext ctx) {
	   className = null;
   }

   
   //메소드 정의 시작 , 리턴타입과 메소드이름 파싱
   @Override public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) { 
	   JavaParser.MemberDeclarationContext parentCtx = (JavaParser.MemberDeclarationContext)ctx.getParent();
	   returnType = parentCtx.type().getText();
	   methodName = ctx.Identifier().getText();
   }
   
   
   //메소드 정의 끝났을때 메소드의 모든 정보를 Main클래스의 symTabList에 넣음
   //전역변수 초기화
   @Override public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
	   //System.out.println(methodName + "\t" + params);
	   main.addToClassMethodList(new ClassMethod(className, returnType, methodName, params));
	   methodName = null;
	   params = new ArrayList<>();
   }
   
   
   //void형 메소드일 경우
   @Override public void enterVoidMethodDeclaratorRest(JavaParser.VoidMethodDeclaratorRestContext ctx) {
	   JavaParser.MemberDeclContext memberDeclContext = (JavaParser.MemberDeclContext) ctx.getParent();
	   methodName = memberDeclContext.Identifier().getText();
   }
   

   //메소드 정의를 타고 내려온 경우에 파라미터 파싱
   @Override public void enterFormalParameterDecls(JavaParser.FormalParameterDeclsContext ctx) {
      if(methodName != null) {
    	  params.add(ctx.type().getText());
    	  varType = ctx.type().getText();
      }
  }

   
   //.java파일에서 varType이 존재하는 문장
   @Override public void enterVarType(JavaParser.VarTypeContext ctx) {
		var_bit = true;
	}
   
   
   @Override public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
	   varName = ctx.getText();
	   
	   if( !var_bit && !member_bit) {
		   main.addToLocalVarList(new LocalVar(className, methodName, varType, varName, params));
		   
		   varName = null;
	   }
	   else if( member_bit ) {
		   main.addToMemberVarList(new MemberVar(className, varType, varName));
	   }
   }
   
   
   //변수의 타입 파싱
   @Override public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
	   if( !var_bit ) {
		   varType = ctx.type().getText();
	   }
   }
   
   
   @Override public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
	   if( var_bit ) {
		   var_bit = false;
	   }
   }
   
   
   //varType이 존재하는 문장에서 =연산자의 오른쪽 부분 파싱
   @Override public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
	   if( var_bit ) {
		   int startIndex = ctx.start.getStartIndex();
		   int stopIndex = ctx.stop.getStopIndex();
		   Interval interval = new Interval(startIndex, stopIndex);
		   rightSentence = ctx.start.getInputStream().getText(interval);
		   
		   main.addToVarSentenceList(new VarSentence(className, methodName, varName, rightSentence, params, rightSentenceParams));
		   rightSentenceParams = new ArrayList<>();
		   rightSentence = null;
		   varName = null;
	   }
   }
   
   
   //파라미터 파싱
   @Override public void exitArguments(JavaParser.ArgumentsContext ctx) { 
	   if( var_bit ) {
		   if( !ctx.getText().equals("()") ) {
			   rightSentenceParams.add(ctx.getText().substring(1, ctx.getText().length() - 1));
		   }
	   }
   }
   
   
   //멤버 변수 파싱
   @Override public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
	   JavaParser.MemberDeclarationContext memberDeclarationContext = (JavaParser.MemberDeclarationContext) ctx.getParent();
	   varType = memberDeclarationContext.type().getText();
	   
	   member_bit = true;
   }
   
   
   @Override public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
	   member_bit = false;
   }
}