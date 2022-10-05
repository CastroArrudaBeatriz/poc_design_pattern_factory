public class AnimalFactory {

    static Animal createAnimal(String name){
        if ("cat".equals(name)) {
            return new Cat();
        } else if ("dog".equals(name)) {
            return new Dog();
        } else if ("duck".equals(name)) {
            return new Duck();
        }

        return null;
    }
}
