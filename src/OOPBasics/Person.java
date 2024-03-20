package OOPBasics;

import java.util.Scanner;

/*Create a program to implement multiple objects.

Create a class named Person with a field name.
Inside the main() method, get two input values for variables name1 and name2.
Assign the value of name1 and name2 to person1 and person2 objects of the Person class.
Print the values.*/
public class Person {
    String name;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");

        // get input values for name1 and name2
        String name1 = input.nextLine();
        System.out.println("Please enter a name: ");
        String name2 = input.nextLine();

        // create objects person1 and person2
        Person person1 = new Person();
        Person person2 = new Person();

        // assign values of name for both objects
        person1.name = name1;
        person2.name = name2;

        System.out.println(person1.name + " " + person2.name);


    }
}
