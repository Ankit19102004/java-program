import java.util.Scanner;

public class hypo {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
        if(max==n1){
        boolean flag=(n2*n2+n3*n3)==(n1*n1);
        System.out.print(flag);
        
    }
    else if(max==n2){
        boolean flag=(n1*n1+n3*n3)==(n2*n2);
        System.out.println(flag);
    }else {
        boolean flag=(n2*n2+n1*n1)==(n3*n3);
        System.out.println(flag);
    }sc.close();

    }
    }

