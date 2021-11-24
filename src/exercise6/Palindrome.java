package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("Schreiben Sie eine Zahl: ");
       int number = input.nextInt();

       int Rueckzahl = 0;
       int verwendeteZahl = number;
       while(verwendeteZahl > 0) {
        int naechsteZiffer = verwendeteZahl % 10;
        Rueckzahl = Rueckzahl * 10 + naechsteZiffer;
        verwendeteZahl = verwendeteZahl / 10; 
       } 

       boolean palindrome = number == Rueckzahl;
        System.out.println("Palindrome: " + palindrome);

    }
}
