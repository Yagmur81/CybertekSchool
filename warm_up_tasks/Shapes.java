package warm_up_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Shapes {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>(Arrays.asList(new Circle(4), new Circle(3), new Circle(6), new Circle(25), new Circle(9)));
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for(Circle each:circles){
            if(each.area()>max){
                max=each.area();
            }

            if (each.area()<min){
                min=each.area();
            }
        }
        if(each.area()==max){
            System.out.println(each);
        }



    }
}
