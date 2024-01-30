import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        
        int l, b, area;
        System.out.println("Enter value of two sides");
        Scanner r=new Scanner(System.in);
        l=r.nextInt();
        b=r.nextInt();
        area = l*b;
        System.out.println("Area of rectangle "+area);
        
        
    }
    
}
