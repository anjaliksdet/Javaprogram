package Conditions;

import java.util.Scanner;

public class Ex_07_StatementProgram_ifelse {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the number");
        int N = scanner.nextInt();


        scanner.close();

        if(N%2==0 )
        {
            if((N>2)&&(N<5))
            {
                System.out.println("Not Weird");
            }
            else if((N>=6)&&(N<=20)){
                System.out.println("Weird");
            }
            else if (N>20)
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}
