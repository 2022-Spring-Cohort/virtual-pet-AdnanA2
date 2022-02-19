package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

     private Scanner input;

    public static void main(String[] args) {
        new VirtualPetApplication().game();
    }

    public void game() {
        input = new Scanner(System.in);
        System.out.println("\nwelcome to My Pet Shelter\n");
        PetShelter myShelter = new PetShelter();

        while (true) {
            System.out.printf(myShelter.showPetsHealth());
            System.out.println("---------------------------------------------");
            System.out.println("[0].Quit" +
                    " \n[1]. Add Robotic Pet to the shelter" +
                    " \n[2]. Add Organic pet to the shelter" +
                    " \n[3]. Adopt a pet" +
                    " \n[4]. play with a pet" +
                    " \n[5]. Walk the pets" +
                    " \n[6]. Oil or maintain the robotic pets" +
                    " \n[7]. Clean the cage & litter box.");
            System.out.println("---------------------------------------------");
            int choice = input.nextInt();
            input.nextLine();

                if (choice == 0) {
                    System.out.println("\nBYE!");
                    break;
                }

                if (choice == 1) {
                    System.out.println("What kind of Robotic pet would you like to add? \n[1]. Cat \n[2]. Dog");
                    int whichKind = input.nextInt();
                    input.nextLine();
                        if (whichKind == 1) {
                            myShelter.addPet(createRoboticCats());
                        }
                        if (whichKind == 2) {
                            myShelter.addPet(createRoboticDogs());

                        } else {
                            System.out.println("Invalid Response");
                        }
                }

                if (choice == 2) {
                    System.out.println("What kind of Organic pet would you like to add? \n[1]. Cat \n[2]. Dog");
                    int whichKind = input.nextInt();
                    input.nextLine();
                        if (whichKind == 1) {
                            myShelter.addPet(createOrganicCat());
                        }
                        if (whichKind == 2) {
                            myShelter.addPet(createOrganicDog());
                        } else {
                            System.out.println("Invalid Response");
                        }
                }

                if (choice == 3) {
                        System.out.println("Which pet would you like to adopt");
                        System.out.println(myShelter.showPets());
                        String adoptedPet = input.nextLine();
                        myShelter.adoptPetByName(adoptedPet);
                }

                if (choice == 4) {
                    System.out.println("Which pet would you like to play with?");
                    myShelter.playWithAllPets();
                    String playWithAPet = input.nextLine();
                    myShelter.playWithPetByName(playWithAPet);
                }

                if (choice == 5) {
                    myShelter.walkAllPets();
                }

                if(choice == 6) {
                    System.out.println("[1]. Oil the pets" + "\n[2]. Run maintenance diagnostic on the robotic pets");
                    int oil = input.nextInt();
                    if (oil == 1) {
                        myShelter.oilAllPets();
                    }

                    if(oil == 2){
                        myShelter.maintainAllPets();
                    }
                }

                if(choice == 7) {
                    System.out.println("The cage & litter box is clean!");
                    myShelter.cleanAllPets();
                }

            myShelter.tickAll();
        }
    }

    private VirtualPet createOrganicDog() {
        System.out.println("What would you like to name your organic dog? ");
        String name = input.nextLine();
        System.out.println("What is the Organic dogs age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("what is the boredom level of the dog? ");
        int boredom = input.nextInt();
        input.nextLine();
        System.out.println("what is the Thirst level of the pet? ");
        int thirst = input.nextInt();
        input.nextLine();
        System.out.println("what is the Hunger level of the pet? ");
        int hunger = input.nextInt();
        input.nextLine();
        return new OrganicDogs(name,age);
    }
    
    private VirtualPet createRoboticDogs() {
        System.out.println("What would you like to name your mechanical dog? ");
        String userInputName = input.nextLine();
        System.out.println("What is the mechanical dogs age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("what is the battery level of the dog? ");
        int batteryLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the oil level of the pet? ");
        int oilLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the maintenance level of the pet? ");
        int maintenance = input.nextInt();
        input.nextLine();
        return new RoboticDogs(userInputName,age);
    }

    private VirtualPet createOrganicCat() {
        System.out.println("What would you like to name your organic cat? ");
        String name = input.nextLine();
        System.out.println("What is the Organic cat age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("what is the boredom level of the dog? ");
        int boredom = input.nextInt();
        input.nextLine();
        System.out.println("what is the Thirst level of the pet? ");
        int thirst = input.nextInt();
        input.nextLine();
        System.out.println("what is the Hunger level of the pet? ");
        int hunger = input.nextInt();
        input.nextLine();
        return new OrganicCats(name,age);
    }

    private VirtualPet createRoboticCats() {
        System.out.println("What would you like to name your mechanical cat? ");
        String name = input.nextLine();
        System.out.println("What is the mechanical cat age? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("what is the battery level of the dog? ");
        int batteryLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the oil level of the pet? ");
        int oilLevel = input.nextInt();
        input.nextLine();
        System.out.println("what is the maintenance level of the pet? ");
        int maintenance = input.nextInt();
        input.nextLine();
        return new RoboticCats(name,age);

    }
}

