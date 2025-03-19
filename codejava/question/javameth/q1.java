package question.javameth;

import java.util.Scanner;

public class q1 {
    public static void square(int n){
        for (int i =1;i<= n;i++){
               int a=i*i;
             System.out.println(a);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        square(n);
        // for (int i =1;i<= n;i++){
        //     int a=i*i;
        //     System.out.println(a);

        // }
        sc.close();
    }
}
