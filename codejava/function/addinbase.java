import java.util.Scanner;

public class addinbase {
    // add in the base they are
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();
        int d=getsum(b,n,n2);
        System.out.println(d);
        sc.close();
       

    }
    public static int getsum(int b,int n,int n2){
        int rv=0;
        int c=0;
        int p=1;
        while(n>0||n2>0||c>0){
            int d1=n%10;
            int d2=n2%10;
            n=n/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;
        }

        return rv;



    }
}
