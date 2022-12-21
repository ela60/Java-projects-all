package Arraylist;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any  number :");
        int num = input.nextInt();
        int sum = 0, temp, r;
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (num == sum) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }

}
