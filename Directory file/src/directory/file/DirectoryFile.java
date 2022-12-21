
package directory.file;


import java.io.File;

public class DirectoryFile {

    public static void main(String[] args) {
       File dir =new File ("person");
       dir.mkdir();
       String dirlocation =dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
       if(dir.delete())
       {
           System.out.println(dir.getName()+"folder has been deleted");
    }
    }
}

