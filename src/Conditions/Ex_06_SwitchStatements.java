package Conditions;

import java.util.Scanner;

public class Ex_06_SwitchStatements {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of number from 1 to 7");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
            case 3 :
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("invalid");



        }
    }
}
