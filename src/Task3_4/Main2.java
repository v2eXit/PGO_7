package Task3_4;

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Cat cat = new Cat();
        Lion lion = new Lion();

        System.out.println("--- Dog ---");
        dog.makeNoise();
        dog.roam();
        dog.sleep();

        System.out.println("\n--- Wolf ---");
        wolf.makeNoise();
        wolf.roam();
        wolf.sleep();

        System.out.println("\n--- Cat ---");
        cat.makeNoise();
        cat.roam();
        cat.sleep();

        System.out.println("\n--- Lion ---");
        lion.makeNoise();
        lion.roam();
        lion.sleep();
    }
}
