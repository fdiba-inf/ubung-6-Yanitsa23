package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passwordValid = false;
        do {
          System.out.print("Geben Sie ein Password ein:  ");
          String password = input.nextLine();
          
          if(password.length() < 8) {
            continue;
          }
          boolean lettersAndDigits = true;
          int digitCount = 0;
          for(int index = 0; index < password.length(); index++){
            char symbol = password.charAt(index);
            if (!Character.isLetterOrDigit(symbol)) {
              lettersAndDigits = false;
              break;
            }
            
            if(Character.isDigit(symbol)) {
              digitCount++;
            }
          }

          if(lettersAndDigits && digitCount >= 2) {
            passwordValid = true;
          }

        } while (!passwordValid);

        System.out.println("Password valid!");
    }
}
