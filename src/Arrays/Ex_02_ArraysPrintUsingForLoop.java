package Arrays;

import java.util.Arrays;

public class Ex_02_ArraysPrintUsingForLoop {
    static void main() {

          int[] marks={23,45,67,89,23};
        Arrays.sort(marks);
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

        String[] names = {"Anjali","PAKAGE-20LPA","SDET","Placed in Jan2026"};
        Arrays.toString(names);
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);

        }

    }
}
