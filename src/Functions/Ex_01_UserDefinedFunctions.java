package Functions;

import java.util.Scanner;

public class Ex_01_UserDefinedFunctions {
    static void main() {
        greet();
        String n = name();
        int a = experience();
        System.out.println(name());
        System.out.println("No of yr experience" + experience());
        fullname("Anjali", "Kondapure");
        peronaldetails("Banaglore", 31, 87000);
        peronaldetails("Bidar", 12, 0);

        //accepting value for the keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the valude of place ");
        String place = input.next();
        int age = input.nextInt();
        double salary = input.nextDouble();

        //sending the parameters
        peronaldetails(place, age, salary);

        //accepting 2 numbers from the user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value1");
        int value1 =sc.nextInt();
        System.out.println("Enter the value2");
        int value2=sc.nextInt();
        float sum = addition(value1,value2);
        System.out.println("sum" + addition(value1,value2) );
    }

    //1.No return type no parameters
    static void greet() {
        System.out.println("Hi,I am very happy soul");
    }

    //2.with return type but no parameters
    static String name() {
        return "Anjali";
    }

    static int experience() {
        return 7;
    }

    // 3.without return type with parameters
    static void fullname(String FirtsName, String Surname) {
        System.out.println("Name" + FirtsName + " " + Surname);
    }

    static void peronaldetails(String place, int age, double salary) {
        System.out.println("Personal details\n" + "your place -->" + " " + place + " " + "your age -->" + " " + age + "your salary -->" + " " + salary);
    }

    //4.With returntype with parameters
    static float addition(int a , float b){
        //int add =a+b;
        return a+b;

    }
}




