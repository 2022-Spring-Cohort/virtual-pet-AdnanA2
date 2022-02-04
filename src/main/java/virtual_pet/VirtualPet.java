package virtual_pet;

public  class VirtualPet {
    private String name;

    private int hunger;
    private int thirst;
    private int boredom;
    private int age;
    private int sleep;



    public VirtualPet(String name, int hunger, int thirst, int boredom, int age) {
        this.name = name;
        this.hunger = this.hunger;
        this.thirst = this.thirst;
        this.boredom = this.boredom;
        this.age = this.age;
        this.sleep = sleep;
    }



    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public int isHungerLevel() {

        return hunger;
    }

    public int isThirstLevel() {

        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void play(){
        boredom += 20;
        thirst += 20;
        hunger += 40;

    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getSleep() {
        return sleep;
    }

    public String hasToPee() {

        return "I need to pee";
    }

    public String sleepy(){

        return "I need to sleep";
    }

    public void  water(){

        thirst += 30;
    }

    public void feed(){

        hunger += 40;
    }

    public void tick(){
        boredom++;
        thirst++;
        hunger++;


    }
    public VirtualPet(String name) {
    }
    public void hunger() {

        hunger = +50;
    }

    public void sleep() {

        sleep = +50;
    }

    public String stats(){
        //TODO finish the stats method

        return name+":\n|Hunger: "+hunger+"| \t|Boredom: "+boredom+"| \t|Thirst: "+thirst+"|";
    }


    @Override
    public String toString() {
        return  name;
    }
    
    public void eat(){
        System.out.println("What do you eat?");
    }
}
//TODO I need to fix the numbers and how they go up and need to figure out what range is good.
