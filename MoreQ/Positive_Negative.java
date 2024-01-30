import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n>0) {
            System.out.println("Positive number ");
        }
        else if (n<0) {
            System.out.println("Negative number ");
        }
        else {
            System.out.println("Neither Positive nor Negative ");
        }
    }
}
