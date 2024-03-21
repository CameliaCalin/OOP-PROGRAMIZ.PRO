package OOPBasics;

import java.util.Scanner;

public class GetterAndSetterMethods {
    //create private field name
    private String name;

    //create setter method to set value of name
    public void setName( String name){
        this.name = name;
    }

    //create getter method to return value
    public String getName(){
        return this.name;
    }
}

class Main{
     void main(String[] args) {
         //create object person1 for class GetterandSetterMethods
         GetterAndSetterMethods person1 = new GetterAndSetterMethods();

         //get input name
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter a name: ");
         String name = input.nextLine();

         //set name
         person1.setName(name);

         //get name
         System.out.println(person1.getName());

         input.close();

    }
}
