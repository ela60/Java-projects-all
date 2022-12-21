
package Operator;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        int num1,num2,result;
       Scanner input=new Scanner(System.in);
        
       
        result=num1+num2;
        System.out.println("enter any number:");
         num1=input.nextInt();
        System.out.println("sum="+result);
        result=num1-num2;
        System.out.println("sub="+result);
        result=num1*num2;
        System.out.println("mul="+result);
        result =num2 \ num1;
        System.out.println("div="+result);
        
        
    }
            
}
