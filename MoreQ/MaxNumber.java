import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter any two number: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        
        if(a>b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
