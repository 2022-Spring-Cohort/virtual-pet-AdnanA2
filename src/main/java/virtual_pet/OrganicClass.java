package virtual_pet;

public abstract class OrganicClass extends VirtualPet {

    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int soiledLevel;
    protected int sleep;

    public OrganicClass(String name, int age) {
        super(name, age);
        this.hunger = 40;
        this.thirst = 40;
        this.boredom = 40;
        this.sleep = 40;
    }

    public int getSleep() {
        return sleep;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void play() {
        boredom -= 10;
        thirst += 10;
        hunger += 10;
    }

    public void clean(){
        soiledLevel += 10;
    }

    @Override
    public void tick() {

        boredom++;
        thirst++;
        hunger++;

    }

    @Override
    public String stats(){
        //TODO finish the stats method

        return name+":\n|Hunger: "+hunger+"| \t|Boredom: "+boredom+"| \t|Thirst: "+thirst+"| \t|Clean: "+soiledLevel+"|";
    }


    public void hunger() {

        hunger = +50;
    }

    public void sleep() {

        sleep = +50;
    }
    public void  water(){

        thirst += 30;
    }

    public void feed(){

        hunger += 40;
    }


}
