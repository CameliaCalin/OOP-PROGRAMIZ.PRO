package Poymorphism;

import java.util.Scanner;

/*Create a program to demonstrate polymorphism.*/
 class Greeting {
     public void greet(String name){
         System.out.println("Hello " + name);
     }
}

class LocalGreeting extends Greeting {
    @Override
    public void greet(String name) {
        System.out.println("Nasmaste " + name);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        Greeting greet1 = new Greeting();
        LocalGreeting greed2 = new LocalGreeting();

        greet1.greet(name);
        greed2.greet(name);
    }
}
