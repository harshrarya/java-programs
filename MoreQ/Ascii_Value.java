import java.util.Scanner;

public class Ascii_Value {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character: ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);

        int a = ch;
        System.out.println("ASCII Value of " +ch +" is: "+ a);
    }
}
