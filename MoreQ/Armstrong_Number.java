import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        
        int n, r, c, arm=0;
        System.out.println("Enter your name");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not-Armstrong Number");
        }
    }
}
