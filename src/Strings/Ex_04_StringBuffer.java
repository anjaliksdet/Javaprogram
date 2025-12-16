package Strings;

public class Ex_04_StringBuffer {
    static void main() {
//        //string buffer
        StringBuffer s1= new StringBuffer("Bebo");
        s1.append("Momo");
        s1.reverse();
        System.out.println(s1);

        //string builder
        StringBuilder sb = new StringBuilder("Anjali adores");
        sb.append("Yashodhar");
        sb.reverse();
        System.out.println(sb);
   }
}
