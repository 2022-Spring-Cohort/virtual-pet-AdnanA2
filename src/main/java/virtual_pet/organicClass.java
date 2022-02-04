package virtual_pet;

public abstract class organicClass extends VirtualPet{
    private boolean cage;
    private boolean litterBox;



    public organicClass(String name, int hunger, int thirst, int boredom, int age) {
        super(name, hunger, thirst, boredom, age);
    }

    public boolean isCage() {
        return cage;
    }

    public boolean isLitterBox() {
        return litterBox;
    }

}
