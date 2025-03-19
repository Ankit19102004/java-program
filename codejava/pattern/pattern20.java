package pattern;

import java.util.Scanner;

public class pattern20 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i<=n/2){
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }
                     else{
                        System.out.print("\t");
                    }}
                else if(i==n/2+1){
                    if(j==1||j==n||j==n/2+1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                else if(i>n/2&&(i==j||i+j==n+1)){
                    if(j==1||j==n||j<2/n||j>2/n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");

                }}
                else{
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                }

    }
}System.out.println();
}

}
}