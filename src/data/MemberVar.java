package data;

public class MemberVar {
	private String className;
	private String type;
	private String name;
	
	
	public boolean isMatch(MemberVar comp) {
		if(this.className.equals(comp.getClassName()) && this.name.equals(comp.getName()) ) {
			return true;
		}
		
		return false;
	}
	
	
	public MemberVar(String className, String name) {
		this.className = className;
		this.name = name;
	}


	public MemberVar(String className, String type, String name) {
		this.className = className;
		this.type = type;
		this.name = name;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "MemberVar [className=" + className + ", type=" + type + ", name=" + name + "]";
	}
}
