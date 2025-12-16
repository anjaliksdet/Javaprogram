package Arrays;

import java.util.Arrays;

public class Ex_03_MaxMininArray {
    static void main() {
        int[] a = {1, 5, 7, 9, 10, 23, 789};
        //Sort the array
//        Arrays.sort(a);
//        System.out.println("min number in the array"+" " +  a[0]);
//        System.out.println("the max value is " + a[a.length-1]);
        int maximum = max(a);
       int minimum =  mini(a);
        System.out.println("Max numbe is "+ maximum);
        System.out.println("Min number is "+ minimum);
    }

    static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int  mini(int[] a){
       int min =a[0];
       for (int i =0;i<a.length;i++){
           if (a[i]<min) {
              min= a[i];
           }
       }
       return min;
    }
    }






