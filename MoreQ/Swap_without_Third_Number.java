import java.util.Scanner;

public class Swap_without_Third_Number {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before Swapping "+ a+ " "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After Swapping "+ a+ " "+b);
    }
}
