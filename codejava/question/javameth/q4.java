package question.javameth;

import java.util.Scanner;

public class q4 {
    public static int digit(int n) {
        int c = 0;
        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            n = n / 10;
            ++c;
        }
        // System.out.println(c);
        return c;

    }

    public static void numsquare(int c) {
        int sq = c * c;
        System.out.println(sq);
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digit(n);
        int c=digit(n);
        System.out.println(c);
        sc.close();
        numsquare(c);
    }
}
