package day48_Inheritance.Device;
/*
create a sub class of Device called Laptop:
					attributes: brand, model, price, MadeIn, hasBattery, hasMemory
					methods: coding, watching, setInfo, toString

					add a constructor that can set the fileds

 */
public class Laptop extends Device {

    public boolean hasCPU;
    public boolean hasMouse;
    public boolean hasKeyboard;

    public Laptop(String model, String brand, double price, boolean hasBattery, boolean hasMemory, int screenSize,boolean hasCPU,boolean hasMouse,boolean hasKeyboard){
        setInfo(model, brand, price, hasBattery, hasMemory, screenSize);
        this.hasCPU=hasCPU;
        this.hasKeyboard=hasKeyboard;
        this.hasMouse=hasMouse;
    }
    public void coding(){
        System.out.println("Coding on"+brand+" "+model);

    }
    public void watching(){
        System.out.println("Watching Netflix on "+brand+" "+model);
    }

}
