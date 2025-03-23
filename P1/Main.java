public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", "John Doe");
        PetActions petActions = new PetActions();

        System.out.println("Pet Name: " + myPet.getPetName());
        System.out.println("Owner: " + myPet.getOwner());
        System.out.println("Pet Sound: " + petActions.makeSound("Dog"));
        System.out.println("Eating: " + petActions.eat());
    }
}
