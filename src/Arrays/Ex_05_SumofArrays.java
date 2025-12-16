package Arrays;

public class Ex_05_SumofArrays {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
//        int sum=0;
//        for (int i = 0; i < a.length; i++) {
//             sum=sum+a[i];
//        }
//
//        System.out.println(sum);
//    }
        int sum = 0;
        for(int n : a)
        {
            sum= sum +n;
        }
        System.out.println(sum);
    }
}
