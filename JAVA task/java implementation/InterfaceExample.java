public class InterfaceExample { 
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}

interface Animal { 
    void animalSound(); 
    void sleep();       
}

class Dog implements Animal { 
    
    public void animalSound() {
        System.out.println("Dog says: Bark");
    }

    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}