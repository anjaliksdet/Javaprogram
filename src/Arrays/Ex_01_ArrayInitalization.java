package Arrays;

import java.util.Arrays;

public class Ex_01_ArrayInitalization {
    static void main() {

        int[] marks= {1,5,6,7,};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        int[] scores= new int[5];
        scores[1]=2;
        scores[3]=56;
        System.out.println(scores[0]);

        String[] names= {"Anj","SEDT\n"," ","GOT PLACED"};
        System.out.println(Arrays.toString(names));
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

    }


}
