public class booklist extends FileManager{
     booklist(String s){
         super(s);
     }
     void tabularPrint(){
         String [] topics = getLines(11);
         for(String s : topics){
             //System.out.println(s);
             String [] column = s.split(",");
             for(String col : column){
                 System.out.print(col + "\t\t");
             }
             System.out.println();
         }
     }
     void printCategory(String s,String s1){
        String [] topics = getLines(50001);
        int j = 0;
        for(String i : topics){
            String [] column = i.split(",");
            if(column[0].equals(s) && column[1].equals(s1)|| j==0)
            {
                for(String col : column){
                 System.out.print(col + "\t\t");
             }
                System.out.println("");
                j++;
            }
        }
        
     }
}
