package virtual_pet;

public abstract class RoboticClass extends VirtualPet{
    protected int batteryLevel;
    protected int oilLevel;
    protected int chargingLevel;
    protected int maintenance;

    public RoboticClass(String name, int age) {
        super(name, age);
        this.batteryLevel = 40;
        this.oilLevel = 60;
        this.chargingLevel = 60;
        this.maintenance = 50;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getChargingLevel() {
        return chargingLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void oil(){
        oilLevel += 10;
        if(oilLevel >= 5){
            System.out.println("This Pet Needs Immediate Oil change ");
        }
    }

    public void maintenance(){
        oilLevel += 10;
        batteryLevel += 10;
        if(maintenance >= 5){
            System.out.println("This Pet Needs Immediate Maintenance ");
        }
    }

    @Override
    public void play() {
    batteryLevel = Math.max(0,batteryLevel - 10);
    oilLevel = Math.max(0,oilLevel - 10);
    maintenance = Math.min(0,maintenance + 10);
    }

    @Override
    public void tick() {
        batteryLevel ++;
        oilLevel ++;
        chargingLevel ++;
    }

    @Override
    public String stats() {
        return name+":\n|Battery Level: "+batteryLevel+"| \t|Oil Level: "+oilLevel+"| \t|Maintenance: "+maintenance+ "|";
    }
}
