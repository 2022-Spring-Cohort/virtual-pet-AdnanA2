package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

     private Scanner input;

    public static void main(String[] args) {
        new VirtualPetApplication().game();
    }

    public void game() {
        input = new Scanner(System.in);
        System.out.println("\nwelcome to Bluff's Pet Shelter\n");
        PetShelter myShelter = new PetShelter();

        while (true) {
            System.out.printf(myShelter.showPetsHealth());
            System.out.println("---------------------------------------------");
            System.out.println("[0].Quit" +
                    " \n[1]. Feed all pets" +
                    " \n[2]. Add pet to the shelter" +
                    " \n[3]. Adopt a pet" +
                    " \n[4]. Play with a pet" +
                    " \n[5]. Water all pets" );
            System.out.println("---------------------------------------------");
            int choice = input.nextInt();
            input.nextLine();

                if (choice == 0) {
                    System.out.println("You quit! \nBYE!");
                    break;
                }
                if (choice == 1) {
//                    System.out.println("You fed all pets!");
                    myShelter.feedAllPets();

                }

                if (choice == 2) {
                    myShelter.addPet(createPet());

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
                    myShelter.waterAllPets();
                }
            myShelter.tickAll();
        }
    }

    private VirtualPet createPet() {
        System.out.println("Whats the pets name? ");
        String name = input.nextLine();
        System.out.println("What is the pets age? ");
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
        return new VirtualPet(name,hunger,thirst,boredom,age);
    }
}






