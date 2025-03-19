import java.util.Scanner;

public class rotata {
    public static void main(String[] args) {
        System.out.println("Enter the no. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int dig =0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            dig++;

    }
    k=k%dig;
    if (k<0){
        k=k+dig;
    }
    int div=1;
    int mult=1;
    for (int i =1;i<=dig;i++){
        if (i<=k){
        div =div*10;

    }else{
        mult=mult*10;
    }

}
int q=n/div;
int r=n%div;
int h= r*mult+q;
System.out.println(h);sc.close();
}
}