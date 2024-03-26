package AbstractClassMethods;

abstract class Animal {
    //abstract method
    abstract void makeSound();
}

class Dog extends Animal {
    //implemets the abstract method

    @Override
    void makeSound() {
        System.out.println("WOOF WOOF");
    }
}

class Main {
    public static void main(String[] args) {
        //create object of Dog
        Dog dog1 = new Dog();
        //acces the abstract method
        dog1.makeSound();
    }
}
