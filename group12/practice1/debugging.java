package group12.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class debugging {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(findAverage(arr));

    }

    private static  int findAverage(ArrayList<Integer>arr) {
        int average =0;
        for(Integer each:arr){
            average+=each;
        }
        return average;
    }
}

