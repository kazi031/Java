public class StringChecker extends Thread{
    String s;

    public StringChecker(String str) {
        this.s = str;
    }

    @Override
    public void run() {
         Driver.stringPrinter(s);
    }
    
    
}
