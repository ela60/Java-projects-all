package Arraylist;

public class Stringdemo {

    public static void main(String[] args) {

        String str = "Ela";
        String ptr = "";
        char ch;

        System.out.print("Original word: " + str);
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); 
            ptr = ch + ptr; 
        }
        System.out.println("Reversed word: " + ptr);
    }
}
