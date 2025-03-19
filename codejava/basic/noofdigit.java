import java.util.Scanner;

public class noofdigit{
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig =0;
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
        sc.close();
    }
 }