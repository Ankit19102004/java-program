package question.basic;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division");
        System.out.println("Choose the opretor ");
        int c= sc.nextInt();
        float z = 0;
        if(c==1){
             z = a+b;
        }
        else if (c==2){
             z= a-b;
            
        }
        else if (c==3){
             z= a*b;
            
        }
        else if (c==4){
             z= a/b;
            
        }
        else{
            System.out.println("Worng operation ");
        }
        
                System.out.println("Answer "+ z);
                sc.close();
    }
    
}
