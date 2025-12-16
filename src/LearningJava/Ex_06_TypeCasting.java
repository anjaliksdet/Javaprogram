package LearningJava;

public class Ex_06_TypeCasting {
    static void main() {
        byte b =10; //datatype is smaller changing to bigger in the next line
        int a =b+10; // this is implicit type casting , int a= (int)b+10//this is expicit type casting
        System.out.println(a);
        int b1=200;
        byte a1 =(byte)b1;
        System.out.println(a1);

    }
}
