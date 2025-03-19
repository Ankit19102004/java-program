import java.util.Scanner;

public class benjamn {
    public static void main(String[] args) {
System.out.print("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1;i*i<=n;i++){
            System.out.println(i*i);
        }
    sc.close();}
}
