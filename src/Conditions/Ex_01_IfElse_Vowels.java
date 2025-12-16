package Conditions;

import java.util.Scanner;

public class Ex_01_IfElse_Vowels {
    static void main() {

        //input form the calculator//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a age");
//        float n=input.nextFloat();
//
//
//        if(n>=18){
//            System.out.println("Your are allowed to vote ");
//        }
//        else{
//            System.out.println("you are not  allowed to vote");
//        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the ALPHABET");
        char c = input2.next().charAt(0);
        c=Character.toUpperCase(c);
        System.out.println(c);//check if the value is converted to upercase

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Enter value is VOWELS");
        }
        else {
            System.out.println("Enter value is constants");
        }
    }
}
