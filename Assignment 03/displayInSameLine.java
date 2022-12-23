//Q2 - Input two different string and print them in same line.

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the first String");
        String firstString=sc.next();
      
        System.out.println("Enter the second String");
        String secondString=sc.next();


        System.out.print(firstString + secondString);
    }
}
