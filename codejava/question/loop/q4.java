package question.loop;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        sc.close();
        char[] s= n.toCharArray(); 
        char[] rev=new char[s.length];
        for (int i = s.length-1; i >=0; i--) {
            rev[s.length-1-i]=s[i];
            
            
        }
       
       String j= new String(rev);
        s.toString();
        
            
        
        if (n.equals(j)){
            System.out.println("palindrome");


        }
        else{
            System.out.println("not");
        }
        
    
    }
}
