import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("Enter your number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("Enter Power: ");
        p=r.nextInt();

        for(int i=1; i<=p; i++) {
            result = n*result;
        }
        System.out.println("Power " +result);
    }
}
