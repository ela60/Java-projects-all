
package file;

import java.io.File;

public class Filedemo {
    public static void main(String[] args) {
        File dir = new File("C:/Users/hp/Desktop/person");
       dir.mkdir();
      String s= dir.getAbsolutePath();
        System.out.println(s);
        File file1=new File(s+"ee");
        File file2=new File(s+"e");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("file are ready");
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        
    }
    
}
