import java.util.Scanner;

/**
 * Copy_OneArray_AnotherArray
 */
public class Copy_OneArray_AnotherArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in arrays: ");

        for(int i=0; i<5; i++){
            a[i]=r.nextInt();
        }
        System.out.print("First array elemnts: ");
        for(int i=0; i<5; i++){
            System.out.print(a[i]+" ");
        }

        System.out.print("\nSecond array elemnts: ");
        for(int i=0; i<5; i++){
            b[i] = a[i];
            System.out.print(b[i]+" ");
        }

    }
}