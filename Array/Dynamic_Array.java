import java.util.Scanner;

/**
 * Dynamic_Array
 */
public class Dynamic_Array {

    public static void main(String[] args) {
        
        int size, i;
        System.out.println("Enter size of array");
        Scanner r=new Scanner(System.in);
        size=r.nextInt();
        int a[] = new int [size];

        for(i=0; i<size; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.println("Printed array element : ");
        for(i=0; i<size; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}