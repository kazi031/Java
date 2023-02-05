
public class Driver {
	public static void main(String args[])
	{
		FileManager f1 = new FileManager("Sample.txt");
		
		String s = "Id,Name,Address";
		String a[] = s.split(",");
		for (String s1 : a)
		{
			System.out.println(s1);
		}
		//f1.printDetails();
		
		//f1.write("This is a line\r\n");
		//f1.append("This is another line\r\n");
		f1.printAllScan();
		//f1.delete();
		//f1.delete();
		
		//FolderManager fd1 = new FolderManager("C:\\");
		//fd1.printFileList();
	}
}
