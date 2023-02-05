public class StudentInfo<T> {
	String name, subject;
	T grade;

	public StudentInfo(String name, String subject, T grade) {
		super();
		this.name = name;
		this.subject = subject;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", subject=" + subject + ", grade=" + grade + "]";
	}
	
}
