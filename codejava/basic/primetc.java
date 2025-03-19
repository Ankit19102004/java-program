import java.util.Scanner;

public class primetc {
    public static void main(String[] args) {
                 System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        for (int i = 2; i *i<= n; i++) {
            if (n % i == 0) {
                flag=1;
                break;
            }
            } 
        if (flag==1) {
                System.out.println(" not prime");
            }
            else {
                System.out.println("prime");
            }
            sc.close();
        }
    }

