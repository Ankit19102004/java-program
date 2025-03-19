//no of time value came in given no

import java.util.Scanner;

public class noft{
    public static int repeat(int n ,int nc){
        int count=0;
        while(n>0){
        int dig=n%10;
            //count=count+1;
            n=n/10;
            if(dig==nc){
                count++;
            }
 

        

    }
            return count;

            
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nc=sc.nextInt();
        int val=repeat(n ,nc);
        System.out.println(val);
        sc.close();
    }
}