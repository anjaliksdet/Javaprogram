package Conditions;

import java.util.Scanner;

public class Ex_05_TypeOfTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the one side value a ");
        float a =sc.nextFloat();
        System.out.println("enter the value of b");
        float b= sc.nextFloat();
        System.out.println("enter the value of c");
        float c= sc.nextFloat();


        if (a==b && b==c){
            System.out.println("The triangle is Equivelent ");
        } else if (a==b && b!=c) {
            System.out.println("iscoclese");
        }
        else {
            System.out.println("Scaler triangle");
        }



    }
}
