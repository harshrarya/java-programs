/**
 * input_user
 */
 import java.util.Scanner;
 class input_user {

    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter Data: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();


        System.out.println("Get input Data: "+a);
        System.out.println("Get input Data: "+b);
    
    }
}