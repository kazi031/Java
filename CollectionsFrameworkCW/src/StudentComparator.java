import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.HSCgrade > o2.HSCgrade)
			return -1; //NO NEED TO SWAP
		
		else if(o1.HSCgrade < o2.HSCgrade)
			return 1; //SWAP IN THIS CASE
		
		else {
			if(o1.math > o2.math)
				return -1; //NO NEED TO SWAP
			
			else if(o1.math < o2.math)
				return 1; //SWAP IN THIS CASE
			else
				return 0;
			
		}
	}
	
}
