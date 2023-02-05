public class booklist extends FileManager{
    booklist(String FileName)
    {
        super(FileName);
    }
    void printTabular()
    {
        String [] values = getLines(11);
        for(String line : values)
        {
            String [] columns = line.split(",");
            for(String col : columns)
            {
               System.out.print(col + "\t");
            }
            System.out.print("\n");
        }
    }
    void print_catagory(String s)
    {
        String [] values = getLines(11);
        int i = 0;
        for(String line : values)
        {
            String [] columns = line.split(",");
            if(columns[3].equals(s) || i == 0)
            {
                for(String col : columns)
                {
                     System.out.print(col + "\t");
                     
                }
                System.out.print("\n");
                i = i + 1;
            }
        }
    }
}
