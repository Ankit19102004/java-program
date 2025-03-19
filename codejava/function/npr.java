import java.util.Scanner;

public class npr {
    public static int fact(int n){
        int re=1;
        for (int j = 1; j <=n; j++) {
            re= re*j;
        }
        return re;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int rfact=fact(n-r);
        int npr =(nfact/rfact);
        System.out.println(npr);
        sc.close();

        
    }
}