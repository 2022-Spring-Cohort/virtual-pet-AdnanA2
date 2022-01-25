package virtual_pet;

public class VirtualPet {
    private String name;
    private String breed;
    private int hunger;
    private int thirst;
    private int boredom;
    private int age;
    private int sleep;



    public VirtualPet(String name, String breed, int hunger, int thirst, int boredom, int age) {
        this.name = name;
        this.breed = breed;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.age = age;
        this.sleep = sleep;
    }

    public String getBreed() {
        return breed;
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
        boredom = +3;
//         return "currently playing";

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

    public String talk(){
        return "Bark!";
    }

    public void feed(){
        hunger +=5;
    }

    public void Tick(){
        boredom++;
        thirst++;
        hunger--;


    }

    public void hunger() {
        hunger = -5;
    }

    public void sleep() {
        sleep = +5;
    }
}
