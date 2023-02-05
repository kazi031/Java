public class Driver {
    public static void main(String[] args) {
        StudentInfo std1 = new StudentInfo("Mike","English","B+");
        StudentInfo std2 = new StudentInfo("Nancy","Math",'A');
        StudentInfo std3 = new StudentInfo("Charly","Physics",-1);
        
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
    }
}
