package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Schreiben Sie eine Zahl: ");
       int number = input.nextInt();

       int Rückzahl = 0;
       int verwendeteZahl = number;
       while(verwendeteZahl > 0) {
        int nächsteZiffer = verwendeteZahl % 10;
        Rückzahl = Rückzahl * 10 + nächsteZiffer;
        verwendeteZahl = verwendeteZahl / 10; 
       } 

       boolean palindrome = number == Rückzahl;
        System.out.println("Palindrome: " + palindrome);

    }
}
