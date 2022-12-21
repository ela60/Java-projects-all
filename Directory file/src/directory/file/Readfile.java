
package directory.file;

import java.io.File;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) {
        try{
            File file =new File("ela");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                String id = Scanner.next();
                String name = Scanner.next();
                System.out.println("id"+id+"name"+name);
            }
            Scanner.close();
        }catch(Exception e){
            System.out.println("e"+e);
        }
    }
}
