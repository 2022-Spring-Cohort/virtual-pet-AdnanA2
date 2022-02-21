package virtual_pet;

public abstract class VirtualPet {
    protected String name;
    private int age;

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = this.age;

    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public abstract void walk();
    public abstract void play();

    public abstract void tick();
    public abstract String stats();


    @Override
    public String toString() {
        return  name;
    }

}
