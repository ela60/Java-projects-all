
package Arraylist;

 class EXAMPLE {
    
     String name;
     String sub;
     EXAMPLE(String n,String s){
         name=n;
         sub=s;
     }
     public void display()
     {
         System.out.println("name ="+name + " sub ="+sub);
     }
 }
     public class B{
         public static void main(String[] args) {
             System.out.println("");
             EXAMPLE p1=new EXAMPLE("e","cse");
             p1.display();
             EXAMPLE p2=new EXAMPLE("n","eee");
             p2.display();
         }
     }

