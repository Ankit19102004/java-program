package question.loop;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            
            sum = sum + i;
            System.out.println(i);
        }

        System.out.println(sum);
    }
}