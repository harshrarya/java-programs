   // LOGICAL OPERATOR EXAMPLES.......
public class Logical_Operator {
    public static void main(String[] args) {

        //Logical AND(&&)
        System.out.println("Logical AND ");
        System.out.println((10>5) && (2>1));
        System.out.println((10>5) && (2<1));
        System.out.println((10<5) && (2<1));

        //Logical OR(||)
        System.out.println("Logical OR ");
        System.out.println((10>5) || (2>1));
        System.out.println((10>5) || (2<1));
        System.out.println((10<5) || (2<1));

        //Logical NOT(!)
        System.out.println("Logical NOt ");
        System.out.println(!(10>5) );
        System.out.println(!(10<5) );
    }
 
}