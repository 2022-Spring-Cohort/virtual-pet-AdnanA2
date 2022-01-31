package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public VirtualPetApplication(String name,String breed) {
    }

    //private VirtualPet bear = new VirtualPet("bear");
    public static void main(String[] args) {
        VirtualPetApplication myShelter = new VirtualPetApplication("","");

        myShelter.virtualTest();

    }
    public void virtualTest () {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Bluff Pet Shelter");
//        System.out.println("Whats the pets name? ");
        String name = input.nextLine();
//        System.out.println("Whats the pets breed? ");
        String breed = input.nextLine();
        System.out.println();
//        System.out.println("What is the pets age? ");
        int age = input.nextInt();
        input.nextLine();
//        System.out.println("what is the boredom level of the dog? ");
        int boredom = input.nextInt();
        input.nextLine();
//        System.out.println("what is the Thirst level of the dog? ");
        int thirst = input.nextInt();
        input.nextLine();
//        System.out.println("what is the Hunger level of the dog? ");
        int hunger = input.nextInt();
        input.nextLine();

        VirtualPet myPet = new VirtualPet(name, breed, hunger, thirst, boredom, age);

        PetShelter addPet = new PetShelter();
        while (myPet.isHungerLevel() > 0) {
            System.out.println("hunger: " + myPet.isHungerLevel() + " Thirst: " + myPet.isThirstLevel() + " Boredom: " + myPet.getBoredom());
            System.out.println("\n[0].quit " +
                    "\n[1].feed " +
                    "\n[2].play " +
                    "\n[3].watch tv"+
                    "\n[4].Adopt Pet");
            int choice = input.nextInt();
            input.nextLine();


            if (choice == 0) {
                break;
            }
            if (choice == 1) {

                if (hunger <= 4) {
                    System.out.println("I WANT MEAT!!!");
                    myPet.feed();

                } else if (hunger < 7) {
                    System.out.println("I want an apple ");

                } else if (hunger > 7) {
                    System.out.println("I want sweet potatoes ");

                }
            } else if (choice == 2) {

                if (hunger >= 4) {
                    System.out.println("I cant play anymore, I AM STARVING!");


                } else if (boredom <= 5) {
                    System.out.println("I want to play catch!");
                    myPet.sleep();


                }
            } else if (choice == 3) {

                if (boredom < 6) {
                    System.out.println("Im bored take me outside!");
                    myPet.sleep();

                } else if (hunger < 6) {
                    System.out.println("Get me food while im watching a movie");
                    myPet.hunger();
                }

            }
                if(choice > 4){
                    System.out.println("try again");
                }
                if(choice == 4) {

            }

            myPet.Tick();

            }
        }
    }




