package virtual_pet;

import java.util.ArrayList;

public class PetShelter {
    private String petByName;
    ArrayList<VirtualPet> pets;

    public PetShelter() {
        this.pets = new ArrayList<>();
        pets.add(new VirtualPet("Dino", 3, 5, 6, 6));
        pets.add(new VirtualPet("Ox", 7, 4, 6, 4));
        pets.add(new VirtualPet("Panda", 3, 6, 8, 1));
        pets.add(new VirtualPet("Chimpanzee", 3, 5, 6, 7));
    }

    public void addPet(VirtualPet pet) {

        pets.add(pet);
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets) {
            pet.feed();
        }
    }

    public void playWithAllPets() {
        for (VirtualPet pet : pets) {
            pet.play();
        }
    }

    public void playWithPetByName(String name){

        findPetByName(name).play();
    }
    public void waterAllPets() {
        for (VirtualPet pet : pets) {
            pet.water();
        }
    }

    public void adoptPetByName(String adoptedPet) {
        pets.remove(findPetByName(adoptedPet));
    }

    public void feedPetByName(String name) {
        findPetByName(name).feed();

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
