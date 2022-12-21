
package directory.file;

import java.io.File;

public class Create {
    public static void main(String[] args) {
        File dir=new File("Ela");
        dir.mkdir();
        File file1 =new File("sm.text");
        File file2 =new File("am.text");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("file are created");
        }catch(Exception e){
            System.out.println("e"+e);
        }if(file1.exists())
        {System.out.println("File exist");
        
    } else{
            System.out.println("dose not file exist");
        }
}
}
