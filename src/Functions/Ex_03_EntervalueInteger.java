package Functions;

import java.util.Scanner;

public class Ex_03_EntervalueInteger {
    static void main() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");

        if(input.hasNextInt()){
            int number = input.nextInt();

        }
        else {

            System.out.println("enter value is not integer");
        }
    }
}
