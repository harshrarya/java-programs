import java.util.Scanner;

public class Months_Name {
    public static void main(String[] args) {
        
        int months;
        System.out.println("Enter a number: ");
        Scanner r=new Scanner(System.in);
        months=r.nextInt();

        switch (months) {
            case 0:
                System.out.println("January = 31");
                break;
            case 1:
                System.out.println("February = 28");
                break;
            case 2:
                System.out.println("March = 31");
                break;
            case 3:
                System.out.println("April = 30");
                break;
            case 4:
                System.out.println("May = 31");
                break;
            case 5:
                System.out.println("June = 30");
                break;
            case 6:
                System.out.println("July = 31");
                break;
            case 7:
                System.out.println("August = 30");
                break;
            case 8:
                System.out.println("September = 31");
                break;
            case 9:
                System.out.println("October = 30");
                break;
            case 10:
                System.out.println("November = 31");
                break;
            case 11:
                System.out.println("December = 30");
                break;
        
            default:
            System.out.println("Invalid Number:");
                break;
        }
    }
}
