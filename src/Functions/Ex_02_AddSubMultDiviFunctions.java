package Functions;

import java.util.Scanner;

public class Ex_02_AddSubMultDiviFunctions {
    static void main() {

        //accepting entery form the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");

        float value1 = sc.nextFloat();
        System.out.println("Enter the number2");
        float value2 = sc.nextFloat();

        //Calling method for the addition
        add(value1, value2);

        //calling method for the multiplication
        float multiply = mul(value1, value2);
        System.out.println("Multiplication value-->" + multiply);

        //calling method for division
        float division = div(value1, value2);
        System.out.println("Division value-->" + division);

        //calling method for substraction
        float miun = sub(value1, value2);
        System.out.println("Substraction value-->" + miun);

    }


    static float add(float a, float b) {
        float sum = a + b;
        System.out.println("addition value-->" + sum);
        return sum;

    }

    static float mul(float a, float b) {
        return a * b;
    }

    static float div(float a, float b) {
        if (b == 0) {
            System.out.println("zero value for b is not allowed");
            return 0;
        }
        return a / b;
    }


        static float sub ( float a, float b)
        {
            return a - b;
        }
    }

