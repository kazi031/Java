public class Driver {
    public static void main(String [] args)
    {
        //FileManager f1 = new FileManager("booklist.csv");
        //FileManager f1 = new FileManager("textbook.txt");
        //f1.Write("I love food");
        //f1.append("I love football");
        //f1.append("Arctic Monkeys - 'Snap Out Of It' from 'AM' released 2013 on Domino Record Co.\n" +
        //"Subscribe to Arctic Monkeys on YouTube: http://bit.ly/ArcticMonkeysYT" );
        //f1.PrintAll();
        //f1.bufferScanner();
        //f1.PrintAllScan();
        booklist book1 = new booklist("records.csv");
        //book1.tabularPrint();
        book1.printCategory("Sub-Saharan Africa","Namibia");
    }
}
