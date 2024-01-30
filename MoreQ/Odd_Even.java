import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number... ");
        Scanner r=new Scanner(System.in);

        n=r.nextInt();

        if(n%2 == 0) {
            System.out.println("Even ");
        }
        else {
            System.out.println("Odd ");
        }
    }
}