import java.util.Scanner;

public class rangeprime {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h= sc.nextInt();
        for(int i=n ;i<=h;i++){
            int flag=0;
            for (int d=2;d*d<=i;d++ ){
                if (i%d==0)
                 {flag=1;
                    break;
                    
                }
            }
            if(flag==0){
System.out.println(i);
            }
        }
        sc.close();
    }
}
