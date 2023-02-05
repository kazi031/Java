public class FinalYearStudent extends Student{
    int thesisMarks;

    public FinalYearStudent( int id, int theoryMarks, int sessionalMarks,int thesisMarks) {
        super(id, theoryMarks, sessionalMarks);
        this.thesisMarks = thesisMarks;
    }
    
    int getTotalMarks()
    {
        return theoryMarks + sessionalMarks + thesisMarks;
    }

    @Override
    public String toString() {
        return id + "\t" + theoryMarks + "\t" + sessionalMarks + "\t" + thesisMarks + "\t" + "Final Year Student";
    }
}
