import java.util.Scanner;
// import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        System.out.println("Enter elements: ");
        Scanner r=new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0; i<5; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("array reverse elements: ");
        for(int i=5-1; i>=0; i--){
            System.out.println(a[i]+" ");
        }
    }
}
