import java.util.Scanner;

class Print_OddNumber {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter Your Numbers ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i=i+2) {
            System.out.println(i);
        }
    }
}
