package data;

import java.util.ArrayList;

public class ClassMethod {
	private String className;
	private String returnType;
	private String methodName;
	private ArrayList<String> paramType;
	
	
	public boolean isMatch(ClassMethod comp) {
		if( this.className.equals(comp.getClassName()) && this.methodName.equals(comp.getMethodName()) 
				&& this.paramType.equals(comp.getParamType()) ) {
			return true;
		}
		
		return false;
	}
	
	
	
	public ClassMethod(String className, String methodName, ArrayList<String> paramType) {
		this.className = className;
		this.methodName = methodName;
		this.paramType = paramType;
	}


	public ClassMethod(String className, String returnType, String methodName, ArrayList<String> argumentType) {
		this.className = className;
		this.returnType = returnType;
		this.methodName = methodName;
		this.paramType = argumentType;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getReturnType() {
		return returnType;
	}
	
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public ArrayList<String> getParamType() {
		return paramType;
	}
	
	public void setParamtType(ArrayList<String> paramType) {
		this.paramType = paramType;
	}

	@Override
	public String toString() {
		return "SymTab [className=" + className + ", returnType=" + returnType + ", methodName=" + methodName
				+ ", paramType=" + paramType + "]";
	}
}