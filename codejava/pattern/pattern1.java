package pattern;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        
    
    System.out.print("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* \t");
            }
            System.out.println(" ");
        }sc.close();
}
}