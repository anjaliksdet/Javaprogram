package Arrays;

import java.util.Scanner;

public class Ex_07_Patterns {
    static void main() {
        Scanner n =new Scanner(System.in);
        System.out.println("enter the value of n");
        int a = n.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
