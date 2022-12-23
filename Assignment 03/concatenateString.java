//Given few lines of input(number of lines unknown) where each line has two
//strings, concatenate the strings.

//*NOTE- To terminate hasNextLine function  press CTRL+Z in intelliJ Shell*

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine())
        {
            String String1=sc.next();
            String String2=sc.next();
            System.out.println(String1+String2);
        }

    }
}
