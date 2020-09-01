package warm_up_tasks;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
