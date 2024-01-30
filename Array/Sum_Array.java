import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum=0;

        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in array: ");
        for(int i=0; i<5; i++){
            a[i]=r.nextInt();
        }
        System.out.print("Arrays elements: ");
        for(int i=0; i<5; i++) {
            System.out.print(a[i]+" ");
            sum = sum+a[i];
        }

        System.out.print("\nAddition of array elements: "+sum);
        
    }

}
