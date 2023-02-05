import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
//		ArrayList<StudentInfo> arr = new ArrayList<>();
//		arr.add(new StudentInfo("Mike", "English", "A+"));
//		arr.add(new StudentInfo("Alice", "Math", "B+"));
//		arr.add(new StudentInfo("Bob", "Physics", -2));
//		
//		for(StudentInfo s: arr)
//			System.out.println(s);
//		
//		
		ArrayList<Integer> intArr = new ArrayList<>();
		
		
		intArr.add(9);
		intArr.add(4);
		intArr.add(6);
		intArr.add(1);
		intArr.add(2);
		System.out.println("Unsorted integer array:\n" + intArr);
		intArr.sort(null);
		System.out.println("Sorted integer array:\n" + intArr);
		
		
		System.out.println();
		System.out.println();
		
		
		ArrayList<Double> doubleArr = new ArrayList<>();
		
		
		doubleArr.add(.215);
		doubleArr.add(.6262);
		doubleArr.add(.3472);
		doubleArr.add(.862);
		doubleArr.add(.1245);
		System.out.println("Unsorted double array:\n" + doubleArr);
		doubleArr.sort(null);
		System.out.println("Sorted double array:\n" + doubleArr);
		
		
		
		//T extends Number to filter out strings + 3 kinds of WILDCARD + UpperBoundWildcard
		//
		
		
	}

}
