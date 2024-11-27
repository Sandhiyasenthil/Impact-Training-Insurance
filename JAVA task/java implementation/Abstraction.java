public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}
abstract class Animal {
    public abstract void animalSound(); // Abstract method
    public  void sleep()
    {
        
    }      // Abstract method
}
class Dog extends Animal { 
    @Override
    public void animalSound() {
        System.out.println("Dog says: Bark");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}