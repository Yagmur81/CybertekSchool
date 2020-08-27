package group12.practice1;
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
public class loops6 {
    public static void main(String[] args) {

    for(int j=5;j>=1;j--) {
        for (int i = j; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    }
}
