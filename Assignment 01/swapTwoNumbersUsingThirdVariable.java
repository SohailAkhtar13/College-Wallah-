//Q5 - Write a Java program to swap two numbers with the help of a third variable.\

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber=sc.nextInt();

        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;

        System.out.println("the value of first number is "+firstNumber);
        System.out.println("the value of second number is "+secondNumber);



    }
}
