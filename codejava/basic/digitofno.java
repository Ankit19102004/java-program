import java.util.Scanner;

public class digitofno {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            dig++;

        }
        int div = (int) Math.pow(10, dig - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;

        }sc.close();

    }
}
