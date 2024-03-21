package Competitive_Prog.Interview.PSI;

public class SwappingNums {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Before swapping : ");
        System.out.println("a " + a);
        System.out.println("b " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping : ");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
