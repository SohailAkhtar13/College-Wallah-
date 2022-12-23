//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//100), write a program to calculate his total marks and percentage marks.
//Input :
//78
//89
//95
//Output : Total marks: 262
//Percentage marks: 87%

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the mark in first subject");
        int mark_one=sc.nextInt();
        System.out.println("Enter the mark in second subject");
        int mark_two=sc.nextInt();
        System.out.println("Enter the mark in third subject");
        int  mark_three=sc.nextInt();

        int totalMarks= mark_one+mark_two+mark_three;
        int percentage= totalMarks/3;

        System.out.println("total marks: "+totalMarks);
        System.out.println("Percentage marks: "+percentage +"%");
    }
}
