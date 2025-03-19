import java.util.Scanner;

public class decimaltoanybase {
    //changing decimal no. into any base
    public static int octal(int n){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%8;
            n=n/8;
            rv +=dig*p;
            p=p*10;
            
        }
        return rv;

    }
    public static int binary(int n){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%2;
            n=n/2;
            rv +=dig*p;
            p=p*10;
            
        }
        return rv;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal no. ");
        int n=sc.nextInt();
        sc.close();
        int o=octal(n);
        int b=binary(n);
        System.out.println("into octal "+o);
        System.out.println("into binary "+b);

    }
}
