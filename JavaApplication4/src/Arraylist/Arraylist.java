package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size=" + number.size());
        number.add(0, 10);
        number.add(1, 20);
        number.add(10);
        number.add(10);
        //System.out.println(number);
       /* for(int x:number)
        {
            System.out.println(" "+x);
    }
         System.out.println("size=" + number.size());
}*/
   Iterator itr=number.iterator();
   while(itr.hasNext()){
       System.out.println(" "+itr.next());

   }
   //removing elements(2)
   number.remove(2);
        System.out.println("arraylist"+number);
        number.clear();
        //check array list empty
        boolean check = number.isEmpty();
        System.out.println("arraylist empty="+check);
    }
    }