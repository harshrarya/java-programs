import java.util.Scanner;

/**
 * AreaofSquare
 */
public class AreaofSquare {

    public static void main(String[] args) {
        
        int side, area;
        System.out.println("Enter side of squsre: ");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();

        area = side*side;
        System.out.println("Area of Square "+area);
    }
}