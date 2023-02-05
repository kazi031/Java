public class RecordClass extends FileManager{
    String [] String1 = new String[14];
    String [] String2 = new String[14];
    RecordClass(String filename)
    {
        super(filename);
    }
    void RecordHolder(int m)
    {
        String [] values = getLines(m);
        String [] columns = values[0].split(",");
        String [] columns2 = values[m-1].split(",");
        for(int k = 0;k<columns.length;k++)
        {
            String1[k] = columns[k];
        }
        for(int k = 0;k<columns2.length;k++)
        {
            String2[k] = columns2[k];
        }
    }
    void PrintAll()
    {
        for(String s : String1)
        {
            System.out.print(s + "\t\t");
        }
        System.out.println();
        for(String s2 : String2)
        {
            System.out.print(s2 + "\t\t");
        }
        
    }
    void print_catagory(String s)
    {
        String [] values = getLines(11);
        int i = 0;
        for(String line : values)
        {
            String [] columns = line.split(",");
            if(columns[1].equals(s) || i == 0)
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
