import java.util.*;

public class Main {
    static void printOneToN(int n)
    {
        if(n==1)  //Base Case
        {
            System.out.println(n);
            return ;
        }
        printOneToN(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();

       printOneToN(n);
    }


}
