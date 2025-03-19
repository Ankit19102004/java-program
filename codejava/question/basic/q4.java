package question.basic;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int d = n--;
         int e= d++;
         int a=d%e;
        System.out.println(" Original Value : "+temp);
        System.out.println("After Increment : "+d);
        System.out.println("After Decrement : "+e);
        System.out.println("Remainder : "+a);
        sc.close();

    }
}
