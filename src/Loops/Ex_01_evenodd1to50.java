package Loops;

import java.util.Scanner;

public class Ex_01_evenodd1to50 {
    static void main() {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the value between 1 to 50" );
//        int i=sc.nextInt();
        for (int i=0;i<=50;i++)
        {
            if (i%2==0){
                System.out.println("Even->" +i);
            }
            else {
                System.out.println("odd->"+ i);
            }
        }
    }
}
