package data;

import java.util.ArrayList;

public class VarSentence {
	private String className;
	private String methodName;
	private String name;
	private String rightSentence;
	private ArrayList<String> methodParamType;
	private String type;
	private ArrayList<String> rightSentenceParams;
	
	
	public boolean isMatch(VarSentence comp) {
		if( this.className.equals(comp.getClassName()) && this.methodName.equals(comp.getMethodName())
				&& this.name.equals(comp.getName()) && this.methodParamType.equals(comp.getMethodParamType()) ) {
			return true;
		}
		
		return false;
	}
	
	
	public VarSentence(String className, String methodName, String name, ArrayList<String> methodParamType) {
		this.className = className;
		this.methodName = methodName;
		this.name = name;
		this.methodParamType = methodParamType;
	}


	public VarSentence(String className, String methodName, String name, String rightSentence,
			ArrayList<String> methodParamType, ArrayList<String> rightSentenceParams) {
		this.className = className;
		this.methodName = methodName;
		this.name = name;
		this.rightSentence = rightSentence;
		this.methodParamType = methodParamType;
		this.rightSentenceParams = rightSentenceParams;
		type = null;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRightSentence() {
		return rightSentence;
	}


	public void setRightSentence(String rightSentence) {
		this.rightSentence = rightSentence;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public ArrayList<String> getMethodParamType() {
		return methodParamType;
	}


	public void setMethodParamType(ArrayList<String> methodParamType) {
		this.methodParamType = methodParamType;
	}

	
	

	public ArrayList<String> getRightSentenceParams() {
		return rightSentenceParams;
	}


	public void setRightSentenceParams(ArrayList<String> rightSentenceParams) {
		this.rightSentenceParams = rightSentenceParams;
	}


	@Override
	public String toString() {
		return "VarSentence [className=" + className + ", methodName=" + methodName + ", name=" + name
				+ ", rightSentence=" + rightSentence + ", methodParamType=" + methodParamType + ", type=" + type + ", rightSentenceParams=" + rightSentenceParams + "]";
	}
}
