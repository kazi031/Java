
import java.io.File;

public class FolderManager extends FileManager{
    FolderManager(String filename)
    {
        super(filename);
    }
    
    void printFileList()
    {
        if (f.isDirectory())
        {
            File [] files = f.listFiles();
            for (File t : files)
            {
                System.out.println(t.getName() + " " + t.length() + "bytes");
            }
        }
    }
}
