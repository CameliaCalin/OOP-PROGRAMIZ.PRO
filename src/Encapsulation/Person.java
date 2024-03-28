package Encapsulation;

import java.util.Scanner;

/*Create a program to implement data hiding in Java.*/
 class Person {
    //craete private field
    private int age;

    //public method to set age
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        Person person = new Person();
        person.setAge(age);
        System.out.println(age);
    }
}
