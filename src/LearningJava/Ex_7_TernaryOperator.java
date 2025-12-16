package LearningJava;

public class Ex_7_TernaryOperator {
    static void main() {
        int age = 18;
        String output = age >= 18 ? "can vote" : "cant vote";
        System.out.println(output);
        //ternary with output integer
        int a = 20;
        int b = 30;
        int output1 = a < b ? a : b;
        System.out.println(output1);

        //ternary with string as output
        int c=20;
        int d= 40;
        String output2= d>c?"value of d is greater ": "value of c is greater";
        System.out.println(output2);

        // out of two numbers which is even or odd
        int e= 20;
        String output3= e%2==0?"Even":"Odd";
        System.out.println(output3);

        // largest of 3 numbers
        int n1=1,n2=3,n3=-1;
        int largest= n1>=n2?((n1>n3)?n1:n3):(n2>n3)?n2:n3;
        System.out.println("largest number" +largest );

        //age clacification
        int age1= 10;
        String output4=(age1<65)?((age1<18)?"Minor":"ADULT"):"SENIOR";
        System.out.println("Age person is"+output4);



    }
}
