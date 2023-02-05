public class Driver {
    public static void main(String [] args)
    {
        RecordClass r1 = new RecordClass("records.csv");
        r1.RecordHolder(2);
        r1.PrintAll();
        //r1.print_catagory("Europe");
    }
}
