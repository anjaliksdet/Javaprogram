package Polymorphism;

public class poly_Overloading {
    static void main() {
        {
            int a = add(2, 3);
            int b = add(3, 4, 2);
            System.out.println("print "+ a);
            System.out.println("Print"+ b);

        }
    }
    static int add (int a ,int b){
        return (a+b);

    }

    static int add (int a ,int b,int c){
        return (a+b+c);
    }

}
