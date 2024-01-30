import java.util.Scanner;

public class Print_Alphabets {
    public static void main(String[] args) {

        char ch;
        System.out.println("Enter your alphabets: ");
        Scanner r=new Scanner(System.in);
        // ch=r.next().charAt(0);

        for(char i='A'; i<='Z'; i++) {
            System.out.println(i + " ");
        }
    }
}
