package day45_Constructor;

public class Sum {
    public Sum(int a,int b){
        System.out.println(a+b);
    }
    public Sum (double a,double b){
        System.out.println(a+b);
    }
    public Sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public Sum (double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Sum one = new Sum(1,2);
        Sum two = new Sum(0.4,0.9,0.67);
    }
}
