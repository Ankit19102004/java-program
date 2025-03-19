package question.basic;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r= sc.nextDouble();
        double a= Math.PI*r*r;
        System.out.println("Area of Circle :"+ a); 
        //sc.close();

   // public static void simple() {
      //  Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        int p= sc.nextInt();
        System.out.print("Enter rate of interest : ");
        int e= sc.nextInt();
        System.out.print("Enter Time : ");
        int t= sc.nextInt();
        int ans=(p*e*t)/100;
        System.out.println("Simple Interest : "+ans);
        sc.close();


        
    }
}
