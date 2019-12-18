package data;

import java.util.ArrayList;

public class LocalVar {
	private String className;
	private String methodName;
	private ArrayList<String> methodParamType;
	private String type;
	private String name;

	
	public boolean isMatch(LocalVar comp) {
		if( this.className.equals(comp.getClassName()) && this.methodName.equals(comp.getMethodName()) 
				&& this.name.equals(comp.getName()) && this.methodParamType.equals(comp.getMethodParamType()) ) {
			return true;
		}
		
		return false;
	}
	
	
	public LocalVar(String className, String methodName, ArrayList<String> methodParamType, String name) {
		this.className = className;
		this.methodName = methodName;
		this.methodParamType = methodParamType;
		this.name = name;
	}

	
	public LocalVar(String className, String methodName, String localVarType, String localVarName, ArrayList<String> methodParamType) {
		this.className = className;
		this.methodName = methodName;
		this.type = localVarType;
		this.name = localVarName;
		this.methodParamType = methodParamType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getType() {
		return type;
	}

	public void setType(String localVarType) {
		this.type = localVarType;
	}

	public String getName() {
		return name;
	}

	public void setName(String localVarName) {
		this.name = localVarName;
	}

	public ArrayList<String> getMethodParamType() {
		return methodParamType;
	}

	public void setMethodParamType(ArrayList<String> methodParamType) {

		this.methodParamType = methodParamType;
	}
	
	

	@Override
	public String toString() {
		return "LocalVar [className=" + className + ", methodName=" + methodName + ", methodParamType="
				+ methodParamType + ", type=" + type + ", name=" + name + "]";
	}
	
	
	
}
