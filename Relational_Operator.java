import java.util.Scanner;

public class Relational_Operator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two Numbers.. ");
        Scanner obj=new Scanner(System.in);

        a=obj.nextInt(); //Greater
        b=obj.nextInt(); //Lessaar

        System.out.println("True/False "+(a<b));
        System.out.println("True/False "+(a>b));
        System.out.println("True/False "+(a<=b));
        System.out.println("True/False "+(a>=b));
        System.out.println("True/False "+(a!=b));
        System.out.println("True/False "+(a==b));
    }
}
