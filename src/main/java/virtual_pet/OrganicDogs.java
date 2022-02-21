package virtual_pet;

public class OrganicDogs extends OrganicClass implements Walkable{


    public OrganicDogs(String name, int age) {
        super(name, age);
    }

    public boolean cageRequiresCleaning() {
        if(soiledLevel > 50){
            return true;
        }
        return false;
    }
    public void walk(){
        boredom -= 30;
        sleep += 20;
        thirst += 20;
        soiledLevel -=10;
    }

}

