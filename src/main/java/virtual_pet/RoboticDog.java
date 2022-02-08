package virtual_pet;

public class RoboticDog extends RoboticClass{


    public RoboticDog(String name, int age) {
        super(name, age);
    }
    public void walk(){
        batteryLevel -= 20;
        oilLevel -= 20;
        chargingLevel -= 25;
        maintenance -= 20;
    }

}
