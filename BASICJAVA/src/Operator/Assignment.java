
package Operator;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base,height,area;
        System.out.println("ENTER");
        base=input.nextDouble();
        System.out.println("ENTER");
        height=input.nextDouble();
        area=.5*base*height;
        System.out.println("area="+area);
        
        
        
        
        int x=20,y=4;
        x+=y;
        System.out.println("x="+x);
        x-=y;
        System.out.println("x="+x);
        x*=y;
        System.out.println("x="+x);
        x/=y;
        System.out.println("x="+x);
        x%=y;
        System.out.println("x="+x);
    }
    
}
