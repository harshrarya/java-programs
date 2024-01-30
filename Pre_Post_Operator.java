public class Pre_Post_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println("PrePost Increment.. ");
        System.out.println(a++); //10 (11)
        System.out.println(++a); //12

        System.out.println("PrePost Decrement.. ");
        System.out.println(a--); //12 (11)
        System.out.println(--a); //10
        
    }
}
