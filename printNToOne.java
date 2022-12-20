import java.util.Scanner;

public class Main {
    static void printdecreasing(int n)
    {
        if(n==1) {
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        printdecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        printdecreasing(n);

    }
}
