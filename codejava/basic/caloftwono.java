import java.util.*;
public class caloftwono {
    public static void main(String[] args) {
         {
            Scanner sc= new Scanner(System.in);
            System.out.print(" Enter first no.:-");
            int a=sc.nextInt();
            System.out.print("Enter Second no.:-");
            int b=sc.nextInt();
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Divison");
            System.out.println("Enter your choice");
            int c=sc.nextInt();
            sc.close();
            if (c==1){
                 int e =(a+b);
                 System.out.println("Answer:-"  +e);
            }
            else if (c==2){
                int e=(a-b);
                System.out.println("Answer:-"  +e);
            }
            else if (c==3){
                int e=(a*b);
                System.out.println("Answer:-"  +e);
            }
            else if (c==4){
                 int e=(a/b);
                 System.out.println("Answer:-"  +e);
            }
            else{
                System.out.println("Worng choice");
            }
        }

    }
}
