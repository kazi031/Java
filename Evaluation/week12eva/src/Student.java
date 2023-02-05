public class Student {
    int id;
    int theoryMarks;
    int sessionalMarks;

    @Override
    public String toString() {
        return id + "\t" + theoryMarks + "\t" + sessionalMarks + "\t";
    }

    public Student(int id, int theoryMarks, int sessionalMarks) {
        this.id = id;
        this.theoryMarks = theoryMarks;
        this.sessionalMarks = sessionalMarks;
    }
    
    int getTotalMarks()
    {
        return theoryMarks + sessionalMarks;
    }
}
