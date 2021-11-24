package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passwortValid = false;
        do {
          System.out.print("Geben Sie ein Passwort ein:  ");
          String passwort = input.nextLine();
          
          if(passwort.length() < 8) {
            continue;
          }
          boolean lettersAndDigits = true;
          int digitCount = 0;
          for(int index = 0; index < passwort.length(); index++){
            char symbol = passwort.charAt(index);
            if (!Character.isLetterOrDigit(symbol)) {
              lettersAndDigits = false;
              break;
            }
            
            if(Character.isDigit(symbol)) {
              digitCount++;
            }
          }

          if(lettersAndDigits && digitCount >= 2) {
            passwortValid = true;
          }

        } while (!passwortValid);

        System.out.println("Passwort valid!");
    }
}
