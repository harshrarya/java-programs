import java.util.Scanner;

public class Search_Elements {
    public static void main(String[] args) {
        int a[] =new int[5];
        int n, count=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter elements in array: ");

        for(int i=0; i<5; i++){
            a[i]=r.nextInt();
        }
        System.out.print("Array elements: ");
        for(int i=0; i<5; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("Enter search elements: ");
        n=r.nextInt();
        for(int i=0; i<5; i++){

            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("Element found "+count+" items");
        }
        else{
            System.out.println("element not found ");
        }
    }
}
