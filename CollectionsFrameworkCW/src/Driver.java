import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		ArrayList <Student> records = new ArrayList<>();
		records.add(new Student("A", 4.5, 74));
		records.add(new Student("B", 5.0, 80));
		records.add(new Student("C", 5.0, 79));
		
		for(Student s: records)
			System.out.println(s);

		//Collections.sort(records);
		
		Collections.sort(records, new StudentComparator());
		//SECOND PARAMETER REQUIRES AN OBJECT OF THE COMPARATOR CLASS WE MADE
		
		System.out.println("AFTER SORTING: ");
		
		for(Student s: records)
			System.out.println(s);
		
		
		
	}
}
