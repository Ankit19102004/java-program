package pattern;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            for(int i=1;i<=10;i++){
                int v=n*i;
                System.out.println(n+ " * "+ i +" =" +v);
            }
    }
    
}
