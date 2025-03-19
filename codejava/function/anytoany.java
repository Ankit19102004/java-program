import java.util.Scanner;

public class anytoany {

    //any base to any base
    
    public static int binary(int n){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*2;
    
        }
        return rv;
        
    }
    public static int octal(int n){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*8;
        }
        return rv;
    }
        public static int decimal(int q,int c){
        int rv=0;
        int p=1;
        while(q>0){
            int dig=q%c;
            q=q/c;
            rv +=dig*p;
            p=p*10;
            
        }
        return rv;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n=sc.nextInt();
        System.out.println("chosse any one \n1.Binary to decimal\n2.Binary to octal\n3.octal to binary\n4.octal to decimal\n5.Decimal to octal\n6.Decimal to Binary");
        int b=sc.nextInt();
         sc.close();
         if(b==1){
            int val=binary(n);
            System.out.println(val);

         }
         else if(b==2){
           int q= binary(n);
            int c=8;
            int val=decimal(q,c);
            System.out.println(val);

         }
         else if(b==3){
           int q= octal(n);
            int c=2;
            int val= decimal(q, c);
            System.out.println(val);

         }
         else if(b==4){
            int val= octal(n);
            System.out.println(val);
            
         }
         else if(b==5){
            int c=8;
            int val= decimal(n, c);
            System.out.println(val);
            
         }
         else if(b==6){
            int c=2;
            int val=  decimal(n, c);
            System.out.println(val);
            
         }
         else{
            System.out.println("worng choice");
         }
    
    
}
}