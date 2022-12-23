//Q1 - Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name");
        String name= sc.next();
        System.out.println("Enter your roll no");
        int rollNumber= sc.nextInt();
        System.out.println("Enter your Field of Interest");
        String fieldOfInterest= sc.next();

        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNumber);
        System.out.println("Field Of Interest "+fieldOfInterest);

    }
}
