import java.io.File;

public class FolderManager extends FileManager{ 
	FolderManager(String filename)
	{
		super(filename);
	}
	
	void printFileList()
	{
		if (f.isDirectory())
			for (File t : f.listFiles())
				System.out.println(t.getName());
	}
}
