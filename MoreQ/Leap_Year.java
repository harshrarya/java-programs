// 1. century (100%=0 and 400%=0)     2000 2400 2800.....
// 2. yearly  (100%!=0 and 4%=0)      2020 2024 2028......

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        
        int y;
        System.out.println("Enter any year: ");
        Scanner r=new Scanner(System.in);
        y=r.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
            System.out.println("Leap Year: ");
        }
        else {
            System.out.println("Not Leap Year: ");
        }
    }
}
