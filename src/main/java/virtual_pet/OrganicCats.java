package virtual_pet;

public class OrganicCats extends OrganicClass {

    public OrganicCats(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("Cats don't walk");
    }



    public boolean litterBoxRequiresCleaning() {
       if(soiledLevel > 50){
           return true;
       }
       return false;
    }


}
