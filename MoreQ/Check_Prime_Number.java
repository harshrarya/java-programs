import java.util.Scanner;

public class Check_Prime_number {
    public static void main(String[] args) {
        
        int n, count=0;
        System.out.println("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=0; i<=n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number: ");
        }
        else {
            System.out.println("Not A Prime Number: ");
        }
        
    }
}
