package main;

import java.util.ArrayList;
import java.util.Stack;

import data.ClassMethod;
import data.LocalVar;
import data.MemberVar;
import data.VarSentence;

public class TypeFinder {
	private ArrayList<ClassMethod> classMethodList;
	private ArrayList<VarSentence> varSentenceList;
	private ArrayList<LocalVar> localVarList;
	private ArrayList<MemberVar> memberVarList;
	
	
	public void setList(ArrayList<ClassMethod> classMethodList, ArrayList<VarSentence> varSentenceList,
			ArrayList<LocalVar> localVarList, ArrayList<MemberVar> memberVarList) {
		this.classMethodList = classMethodList;
		this.varSentenceList = varSentenceList;
		this.localVarList = localVarList;
		this.memberVarList = memberVarList;
	}
	
	
	public void getType() {
		String rightSentence;
		String[] tokens;
		String className = null;
		String methodName;
		ArrayList<String> methodParamType;
		int tokenIndex = 1;
		Stack<Character> stack = new<Character> Stack();
		
		for(VarSentence varSentence : varSentenceList) {
			methodName = varSentence.getMethodName();
			methodParamType = varSentence.getMethodParamType();
			
			rightSentence = varSentence.getRightSentence();
			tokens = rightSentence.split(" ");
			
			//new로 시작할때
			if( tokens[0].equals("new") ) {
				rightSentence = rightSentence.substring(4);
				int j = 0;
				boolean parenthesisBit = false;
				while(true) {
					if( rightSentence.charAt(j) == '(' ) {
						stack.push('(');
						parenthesisBit = true;
					}
					else if( rightSentence.charAt(j) == ')' )
						stack.pop();
					
					j++;
					if(parenthesisBit && stack.isEmpty())
						break;
				}
				tokens = rightSentence.substring(j).split("\\.");
				className = rightSentence.split("[\\(\\)]")[0];
				tokenIndex = 1;
			}
			else{
				tokens = rightSentence.split("\\.");
				//메소드로 시작할때
				if( tokens[0].contains("(") ) {
					className = varSentence.getClassName();
					tokenIndex = 1;
				}
				//변수로 시작할때
				else {
					tokenIndex = 0;
				}
			}
			
			for(; tokenIndex < tokens.length; tokenIndex++) {
				String token = tokens[tokenIndex];
				//메소드일때
				if( token.contains("(") ) {
					ClassMethod classMethod = getClassMethodToken(token, className, varSentence);
					className = getMethodReturnType(classMethod);
				}
				//변수일때
				else {
					String type = getLocalVarType(new LocalVar(varSentence.getClassName(), methodName, methodParamType, token));
					if( type == null ) {
						type = getVarSentenceType(new VarSentence(varSentence.getClassName(), methodName, token, methodParamType));
					}
					if( type == null ) {
						type = getMemberVarType(new MemberVar(className, token));
					}
					if( type != null) {
						className = type;
					}
				}
			}
			
			varSentence.setType(className);
		}
	}
	
	
	private ClassMethod getClassMethodToken(String token, String className, VarSentence varSentence) {
		String[] tmp = token.split("[\\(\\)]");
		String methodName = tmp[0];
		ArrayList<String> paramTypes = null;
		
		if( tmp.length > 1 ) {
			paramTypes = getParamTypes(varSentence);
		}
		
		return new ClassMethod(className, methodName, paramTypes);
		
	}
	
	
	private ArrayList<String> getParamTypes(VarSentence varSentence) {
		ArrayList<String> params = varSentence.getRightSentenceParams();
		ArrayList<String> paramTypes = new ArrayList<>();
		
		for(String paramList : params) {
			for(String param : paramList.split(",")) {
				if(param.matches("[0-9]*")) {
					paramTypes.add("int");
				}
				else if(param.matches("\".*\"")) {
					paramTypes.add("String");
				}
				else {
					paramTypes.add(param.trim().split(" ")[0]);
				}
			}
		}
		return paramTypes;
	}
	
	
	private String getMethodReturnType(ClassMethod comp) {
		for(ClassMethod classMethod : classMethodList) {
			if( classMethod.isMatch(comp) ) {
				return classMethod.getReturnType();
			}
		}
		
		return null;
	}
	
	
	private String getMemberVarType(MemberVar comp) {
		for(MemberVar memberVar : memberVarList) {
			if( memberVar.isMatch(comp) ) {
				return memberVar.getType();
			}
		}
		
		return null;
	}
	
	
	private String getLocalVarType(LocalVar comp) {
		for(LocalVar localVar : localVarList) {
			if( localVar.isMatch(comp) ) {
				return localVar.getType();
			}
		}
		
		return null;
	}
	
	
	private String getVarSentenceType(VarSentence comp) {
		for(VarSentence varSentence : varSentenceList) {
			if( varSentence.getType() == null ) 
				break;
			
			if( varSentence.isMatch(comp) ) {
				return varSentence.getType();
			}
		}
		
		return null;
	}
}
