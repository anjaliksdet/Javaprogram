package Strings;

public class Ex_03_FunctionOfStringClass {
    static void main() {
        String s1="Anjali";

        //Print the length of the Strings
       int  s2=s1.length();
        System.out.println(s2);

        //new string is added at the end
        String s3=s1.concat("@Kondapure");
        System.out.println(s3);

        //check if the specific character is present in the given strings
       Boolean s4=s1.contains("p");
        System.out.println(s4);

        //check if the content of 2 objects are same
        boolean s5=s1.equals(s3);
        System.out.println(s5);

       //check index
        int s6=s3.indexOf("K");
        System.out.println(s6);

        //Replace the values
         String s7= s1.replace('A','y');
        System.out.println(s7);

        //Split the values
        String[] sp1 =s3.split("@");
        System.out.println(sp1[1]);

        //
    }

}
