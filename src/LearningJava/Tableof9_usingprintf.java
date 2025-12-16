package LearningJava;

import java.util.Scanner;

public class Tableof9_usingprintf {
    public static void main(String[] args) {
        /*int i;
       int n=9;
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n,i,(n * i));
            System.out.printf("9 * %d=%d\n", i, 9 * i);
        */

        tables();
    }

    static void tables() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        if (input.hasNextFloat()) {
            float number = input.nextFloat();

            for (float i = 1; i <= 10; i++) {
                System.out.printf("%f * %f= %f \n", number, i, number * i);
            }
        } else System.out.println("Invalid input");


    }
}
