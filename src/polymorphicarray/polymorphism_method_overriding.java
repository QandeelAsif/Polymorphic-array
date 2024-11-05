package polymorphicarray;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismMethodOverriding {

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myCat = new Cat(); // Animal reference but Cat object

        myAnimal.sound(); // Calls the method in Animal class
        myCat.sound(); // Calls the overridden method in Cat class
    }
}