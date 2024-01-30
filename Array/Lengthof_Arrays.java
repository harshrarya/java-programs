import java.util.Scanner;

public class Lengthof_Arrays {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter elements in array: ");

        for(int i=0; i<5; i++) {
            a[i]=r.nextInt();
        }
        System.out.println("Array elements ");
        for(int i=0; i<5; i++) {
            System.out.println(a[i]+" ");
        }
        
        System.out.println("Array length "+5);
    }
}
