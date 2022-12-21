public class MainClass {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog("Tom");
         
        System.out.println();
        animal.sleep();
        animal.eat();
        bird.sleep();
        bird.eat();
        dog.sleep();
        dog.eat();
    }
}
