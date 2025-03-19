package question.basic;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=n+3;
        System.out.println("original value "+n);
        System.out.println("updated value "+c);
        sc.close();
    }
}
