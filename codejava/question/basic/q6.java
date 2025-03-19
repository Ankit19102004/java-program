package question.basic;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(" Are numbers equal "+(n1==n2));
        System.out.println(" Are numbers not equal "+(n1!=n2));
        System.out.println(" Is the first number greater "+(n1>n2));
        System.out.println(" Is the first number less "+(n1<n2));
        sc.close();

    }
    
}
