package virtual_pet;

public class RoboticCat extends RoboticClass{
    public RoboticCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk(){
        batteryLevel += 30;
        oilLevel += 20;
        chargingLevel += 25;
        maintenance += 20;
    }

}
