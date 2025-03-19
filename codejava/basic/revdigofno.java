import java.util.Scanner;

public class revdigofno {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp;
        while(n>0){
             
            temp=n%10;
            n=n/10;
           
            System.out.println(temp);
    }sc.close();
}
}