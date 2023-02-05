public class Driver {
    public static void main(String [] args)
    {
        FileManager f1 = new FileManager("sample.txt");
        f1.PrintDetails();
        //f1.delete();
        f1.write("Kazi loves food\n");
        f1.append("Kazi loves football\n");
        f1.append("Kazi loves Travelling\n");
        //f1.PrintAll();
        //f1.PrintAllBuff();
        f1.PrintAllScan();
    }
}
