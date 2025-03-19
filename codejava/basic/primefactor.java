import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
         for (int div =2;div*div<=n;div++){
            while (n%div==0){
                n=n/div;
                System.out.print(div+" ");
            }}

            if(n!=1){
                System.out.print(n);
            
         }sc.close();
    }
}
