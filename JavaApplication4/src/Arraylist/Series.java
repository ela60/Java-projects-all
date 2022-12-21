package Arraylist;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum = sum + i;
        }

        System.out.println("sum =" + sum);
    }
