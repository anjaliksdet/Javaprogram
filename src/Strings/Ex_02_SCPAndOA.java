package Strings;

public class Ex_02_SCPAndOA {
    static void main() {
        String S1="Hello";
        String S2="Anjali";
        String a= S1.concat(S2);
        System.out.println(a);
        int r2=a.indexOf("j");
        System.out.println(r2);

//        String S3= new String("hello");
//        String S4= new String("Hello");
//
//         // == in string check for the address /refernces of the instants
//        System.out.println(S1==S2);//IN SCP(String Constant Pool) both are address to the same value
//        System.out.println(S1==S3);//S1 is in SCP and S3 is in Object area ,both are diffrent refrences
//
//        //equals check for the values
//        System.out.println(S1.equals(S3));//
//        System.out.println(S1.equals(S2));
    }
}
