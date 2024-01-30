import java.util.Scanner;

public class Make_Calculator {
    public static void main(String[] args) {
        int n1, n2, ch, cal;
        System.out.println("Enter two number: ");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.println("Selector operator ");
        ch=r.nextInt();

        if(ch == 1) {
            cal=n1+n2;
            System.out.println("Addition "+cal);
        }
        else if(ch == 2) {
            cal=n1-n2;
            System.out.println("Substraction "+cal);
        }
        else if(ch == 3) {
            cal=n1*n2;
            System.out.println("Multiplication "+cal);
        }
        else if(ch == 4) {
            cal=n1/n2;
            System.out.println("Division "+cal);
        }
        else if(ch == 4) {
            cal=n1%n2;
            System.out.println("remainder" +cal);
        }

    }
}

