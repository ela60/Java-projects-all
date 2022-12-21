
package javaapplication8;

public class JavaApplication8 {
    String name;
    int age;
    float b,c,sum;
    JavaApplication8 (int age,String n,float b,float c)
    {   
        this.age=age;
        name=n;
        this.b=b;
        this.c=c;
        sum=b+c;
        public void display(){
        
            System.out.println("name :"+name + "age :"+ "sum :"+sum);
        }
    }

