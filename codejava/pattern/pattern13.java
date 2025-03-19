package pattern;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=0;j<=i;j++){
            
                System.out.print(val+"\t");
                int val1=val*(i-j)/(j+1);
                val=val1;

            }System.out.println();
        }
}
}