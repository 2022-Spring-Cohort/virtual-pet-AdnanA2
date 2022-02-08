package virtual_pet;

import java.util.ArrayList;

public class PetShelter {
    private  String petByName;
    ArrayList<VirtualPet> pets;

    public PetShelter() {
        this.pets = new ArrayList<>();
        pets.add(new OrganicDogs("Milo", 3));
        pets.add(new OrganicCats("Willow",4) );
        pets.add(new RoboticDog("Charlie",3));
        pets.add(new RoboticCat("Oliver",4));
    }

    public void addPet(VirtualPet pet) {

        pets.add(pet);
    }


    public void playWithAllPets() {
        for (VirtualPet pet : pets) {
            pet.play();
        }
    }

    public void playWithPetByName(String name){

        findPetByName(name).play();
    }

    public void adoptPetByName(String adoptedPet) {
        pets.remove(findPetByName(adoptedPet));
    }

    private VirtualPet findPetByName(String name) {
        VirtualPet petToFind = null;
        for (VirtualPet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                petToFind = pet;
            }
        }
        return petToFind;
    }
    //TODO need to walk pets and maintain them and make it go through
    public void walkAllPets(){
        for (VirtualPet pet : pets) {
            pet.walk();
        }
    }

    public void oilAllPets(){
        for (VirtualPet pet : pets) {
            if(pet instanceof RoboticClass){
                ((RoboticClass)pet).oil();
            }
        }
    }

    public void cleanAllPets(){
        for (VirtualPet pet : pets) {
            if(pet instanceof OrganicClass){
                ((OrganicClass)pet).clean();
            }
        }
    }

    public void maintainAllPets(){
        for (VirtualPet pet : pets) {
            if(pet instanceof RoboticClass){
                ((RoboticClass)pet).maintenance();
            }
        }
    }

    public String showPets() {
        return pets.toString();
    }

    public String showPetsHealth() {
        String result = "";
        for (VirtualPet pet : pets) {
            result += pet.stats() + "\n";
        }
        return "+------------+---------------+--------------+%n"+result+"+------------+---------------+--------------+%n";
    }

    public void tickAll(){
        for (VirtualPet pet : pets) {
            pet.tick();
        }
    }



}
