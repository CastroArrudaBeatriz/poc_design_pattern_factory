public class Main {
    public static void main(String[] args) {

        Animal cat = AnimalFactory.createAnimal("cat");
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal duck = AnimalFactory.createAnimal("duck");

        welcomeCeremony(cat);
        welcomeCeremony(dog);
        welcomeCeremony(duck);

    }

    private static void welcomeCeremony(Animal animal) {
        System.out.println(animal.sayHello());
        System.out.println(animal.makeSound());
    }

}
