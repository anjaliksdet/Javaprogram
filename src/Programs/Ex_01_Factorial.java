package Programs;

import java.util.Scanner;

public class Ex_01_Factorial {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n= sc.nextInt();
         long result =1;
        for (int i=1;i<=n;i++) {
            ;
            result = i*i;
        }
        System.out.println("factorial value for "+ n +"is"+ " "+result );

    }
}
