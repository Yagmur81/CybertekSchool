package day48_Inheritance.Device;
/*
create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
 */
public class TV extends Device{
    /*
    Inherited
        variables: brand, model, price, MadeIn, hasBattery, hasMemory;
        methods: setInfo, toString;
     */
    /*
    Need to be initialized:
        variables: remoteControl;
        method: watch;
     */
    public boolean remoteControl;
    public TV(String model, String brand, double price, boolean hasBattery, boolean hasMemory, int screenSize, boolean remoteControl){
       setInfo(model, brand, price, hasBattery, hasMemory, screenSize);
        this.remoteControl=remoteControl;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }


}
