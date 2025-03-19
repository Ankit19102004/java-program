import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter the No. ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println("multiplication of "+n+" is "+n*i );
        }sc.close();
    }
}
