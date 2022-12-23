//Q4 - Given two numbers, return their sum in the following format:
//Int t representing number of test cases
//T lines of Two integers representing the numbers to be added

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases to be added");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(num1+num2);
        }
    }
