package LearningJava;

import javax.naming.Name;

public class Ex_05_Operators {
    static void main() {
        int a = 10;
        float b = 70;

        //arithmatic operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //relational operators
        int i = 90;
        int j=80;
        boolean p= i>j;
        System.out.println(p);

        //concatination

        String Name1= "Anjali";
        String Name2= "Yashodhar";
        System.out.println(Name1+ " "+Name2);

        //concatination of 2 literals
        System.out.println(Name1 +" "+Name2+i+j);
        System.out.println(i+j+ Name1+ Name2);
        System.out.println(Name1 +" "+Name2+(i+j));

        //Logical operators
        boolean b1= true;
        System.out.println(!b1);
        boolean b2;

        // logical perators
        int Anjali= 12;
        System.out.println(!(Anjali>20||Anjali<5));

        //Compond assignement operators

        int w= 20;
        w +=30; // w=w+30
        System.out.println(w);





    }
}
