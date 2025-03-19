import java.util.Scanner;

public class anytodec {
    //any no. to decimal no.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int val=atd(n,b);
        System.out.println(val);
        sc.close();
    }
    public static int atd(int n,int b){
    int rv=0;
    int p=1;
    while(n>0){
        int dig=n%10;
        n=n/10;
        rv+=dig*p;
        p=p*b;


    }
    return rv;
}
}
