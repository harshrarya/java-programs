import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {

        int n, c, r, sum=0;
        System.out.println("Enter any number: ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;

        while(n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(c==sum) {
            System.out.println("is a palindrome.");
        }
        else{
            System.out.println("is not a palindrome.");
        }
    }
}
