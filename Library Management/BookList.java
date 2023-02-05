/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MMG
 */
public class BookList extends FileManager{
    BookList(String filename)
    {
        super(filename);
    }
    
    void printTabular()
    {
        String [] values = getLines(11);
        for (String line : values)
        {
            String [] columns = line.split(",");
            for (String col : columns)
                System.out.print(col + "\t");
            System.out.print("\n");
        }
    }
    void printCategory(String cat)
    {
        String [] values = getLines(11);
        int i = 0;
        for (String line : values)
        {
            String [] columns = line.split(",");
            if (columns[3].equals(cat) || i == 0)
            {
                for (String col : columns)
                System.out.print(col + "\t");
                System.out.print("\n");
            }
            i++;
        }
    }
    
}
