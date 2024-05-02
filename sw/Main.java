package sw;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Lemmei", "Lemuel");
        PetFood petEat = new PetFood();
        PetSound petSound=  new PetSound();

        petEat.eat(cat, "chicken");
        petSound.makeSound(cat, "Meow Meow");
    }
}
