import java.util.Scanner;

public class Print_Character {
    public static void main(String[] args) {

        char ch;
        System.out.println("Enter character: ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.println(ch);

    }
}
