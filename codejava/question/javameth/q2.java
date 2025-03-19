package question.javameth;

import java.util.Scanner;

public class q2 {
    public static void radius(int r){
        double a= (Math.PI*r*r);
        System.out.println(a);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        radius(r);
        sc.close();
    }
}
