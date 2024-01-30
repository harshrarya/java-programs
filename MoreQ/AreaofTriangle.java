import java.util.Scanner;

public class AreaofTriangle{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the base length of the triangle: ");
        double base = r.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = r.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);
    }
}
