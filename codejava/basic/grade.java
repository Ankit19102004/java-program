import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("Enter the grade");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        if (g > 90) {
            System.out.println("excellent");

        } else if (g > 80) {
            System.out.println("good");
        } else if (g > 70) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        sc.close();
    }
}
