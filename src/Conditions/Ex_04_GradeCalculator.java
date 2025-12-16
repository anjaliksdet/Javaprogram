package Conditions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class Ex_04_GradeCalculator {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the marks");
        float marks = sc.nextFloat();
        char grade= 'P';

        if (marks>=90 && marks<=100){
            grade= 'A';
        }
        else if (marks>=80 && marks<=89){
            grade= 'B';
        }
        else if (marks>=70 && marks<=79){
            grade= 'C';
        }
        else if (marks>=60 && marks<=69){
            grade= 'D';
        }
        else if (marks>=0 && marks<=59){
            grade= 'F';
        }

        System.out.println("Grade asssigned is "+ grade);

    }
}
