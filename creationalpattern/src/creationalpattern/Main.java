package creationalpattern;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
      
        Animals animal1 = animal.getAnimal("dOg");
        animal1.eat();
      
        Animals animal2 = animal.getAnimal("CAT");
        animal2.eat();
      
        Animals animal3 = animal.getAnimal("raBbIt");
        animal3.eat();
    }
}
