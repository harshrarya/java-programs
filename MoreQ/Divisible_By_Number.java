import java.util.Scanner;

public class Divisible_By_Number {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter any number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%5==0) {
            System.out.println("Divisible by 5 ");
        }
        else {
            System.out.println("Not divisible by 5 ");
        }
    }
}
