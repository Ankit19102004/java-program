import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
          System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i=  0;
        int inv=0;
        int op=1;
        while(n!=0){
            int od=n%10;
            int id = op;
            int ip=od;
            inv = inv +id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
        sc.close();

    }
}
