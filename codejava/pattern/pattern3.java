package pattern;
import java.util.Scanner;

public class pattern3 {
        public static void main(String[] args) {
        
    
    System.out.print("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n-1; 
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("* \t");
            }
            
           // System.out.println(sp+" * "+st);
            sp--;
            st++;
            System.out.println(" ");
        }sc.close();
}
}
