public class StudentInfo<T> {
    String name,Subject;
    T Grade;

    public StudentInfo(String name, String Subject, T Grade) {
        this.name = name;
        this.Subject = Subject;
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "StudentInfo{" + "name=" + name + ", Subject=" + Subject + ", Grade=" + Grade + '}';
    }
    
}
