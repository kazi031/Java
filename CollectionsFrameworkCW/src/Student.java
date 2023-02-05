public class Student {
	String name;
	double HSCgrade;
	int math;
	
	public Student(String name, double hSCgrade, int math) {
		this.name = name;
		HSCgrade = hSCgrade;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student {name=" + name + ", HSCgrade=" + HSCgrade + ", math=" + math + "}";
	}
	
	
	
	
}
