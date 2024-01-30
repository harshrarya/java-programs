import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an enteger: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(num+ "*" + i +"=" +num*i);
        }
    }
}
