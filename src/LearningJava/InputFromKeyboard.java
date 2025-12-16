package LearningJava;

import java.util.Scanner;

public class InputFromKeyboard {
    static void main() {
   /*     Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add");
        int a = input.nextInt();
        System.out.println(a + "+" + a);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int integer : arr) {
            sum = sum + integer;

        }
        System.out.println(sum);
    }
}
