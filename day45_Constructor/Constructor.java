package day45_Constructor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {
    public Constructor(){
        System.out.println("No argument constructor");
    }
    public Constructor(int a){
        System.out.println("with int argument");
    }
    public Constructor(String a){
        System.out.println("String argument");
    }
    public Constructor(int a,int b){
        System.out.println("Two int argument");
    }

    public static void main(String[] args) {
        Constructor obj1 =new Constructor(10);
        Constructor objNoArgument = new Constructor();
        Constructor objWithString = new Constructor("Roma");
        Constructor objWithTwoInt = new Constructor(2,4);


        ArrayList <Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));


        ArrayList<Integer>list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
}
