import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {

        float r;
        float area;
        float pi=3.14f;
        Scanner w=new Scanner(System.in);
        r=w.nextFloat();
        
        area = pi*r*r;
        System.out.println(area);

        // else you can use double to avoid any errors


    }
}
