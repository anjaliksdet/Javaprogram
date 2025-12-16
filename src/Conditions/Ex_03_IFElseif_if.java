package Conditions;

import java.util.Scanner;

public class Ex_03_IFElseif_if {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value1");
        int num1 = sc.nextInt();
        System.out.println("enter value2");
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else if(num2 >num1)
        {
            System.out.println("num 2 is greater than num1");
        }
        else {
            System.out.println("Both are equal");
        }


    }
}
