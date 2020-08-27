package group12.practice1;

public class debugging2 {
    public static void main(String[] args) {
        double avg = findAverage(args);
        System.out.println("average:  " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
