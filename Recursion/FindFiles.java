import java.io.File;

public class FindFiles
{
    public static void main(String[] args) {
        Find(new File("D:/personal/Big Java"), ".java");
    }

    /**
     * This method will take the folder and the file extension, and prints all files with that extension in that folder
     * @param folder folder where to search for files with given extension
     * @param extension the file extension to need to print
     */
    public static void Find(File folder, String extension)
    {
        /*
        If given File is folder, we can get all files in it, and check if it is a file or a folder
        If a child is folder, we shall call the same method recursively
        */
        if(folder.isDirectory())
        {
            File[] childrenFiles = folder.listFiles();
            for(File child: childrenFiles)
            {
                if(child.isDirectory())
                {
                    Find(child, extension);
                }
                else if(child.toString().endsWith(extension))
                {
                    System.out.println(child.getName());
                }
            }
        }
        else{
            if(folder.toString().endsWith(extension))
            {
                System.out.println(folder.getName());
            }
        }
    }
}