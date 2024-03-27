//1)Create a base class Animal with a method makeSound(). Create two derived classes Dog and Cat that override the makeSound() method. Illustrate runtime polymorphism by creating objects of both derived classes and invoking the method.


class Animal {
    void makeSound() {
        System.out.println("Animals make  sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
