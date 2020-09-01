package day45_Constructor.replit;

public class rep222 {
    public static void main(String[] args) {

        System.out.println("1+1 = "+Calc.plus(1,1) );
        System.out.println("1-1 = "+Calc.minus(1,1) );

    }

    private static class Calc {


        public static int plus(int i, int i1) {
            return i+i1;
        }

        public static int minus(int i, int i1) {
            return i-i1;
        }
    }
}
