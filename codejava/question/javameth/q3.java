package question.javameth;

import java.util.Scanner;

public class q3 {
    public static void oddno(int n1,int n2){
        for (int i=n1;i<=n2;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        oddno(n1,n2);
        sc.close();
}
}