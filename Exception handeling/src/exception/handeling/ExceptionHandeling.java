
package exception.handeling;

public class ExceptionHandeling {

    public static void main(String[] args) {
        try{ 
            int a[]=new int [5];
                a[5]=32;
       
    }//catch(ArrayindexoutofboundException e1){
           //System.out.println("Exception "+e1);
    catch(Exception e2){
            System.out.println("Exception "+e2);
    }
    
    
    finally{
            System.out.println("The last line of the program");
}
}
}
