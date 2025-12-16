package Conditions;

import java.util.Scanner;

public class Ex_02_EvenOdd {
    static void main() {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        float n= sc.nextFloat();

        if (n%2==0.0){
            System.out.println("enter value is even");
        }
        else {
            System.out.println("enter value is odd");
        }
    }
}
