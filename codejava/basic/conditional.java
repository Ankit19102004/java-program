import java.util.Scanner;

public class conditional {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Character");
    String str=sc.nextLine();
    sc.close();
    int odd=0;
    for (int i=0;i == str.length();i++){
      ++odd;

    }
    System.out.println(odd);



   }
}
