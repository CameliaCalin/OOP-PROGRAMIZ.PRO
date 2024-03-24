package Inheritance;
/*Create a program to derive a Car class from the Vehicle class.*/

class Vehicle{
    //method of class
    void getFeatures(){
        System.out.println("Initializing vehicle features...");
    }
}

//derive class car from vehicle
class Car extends Vehicle{

}

class Main{
    public static void main(String[] args) {
        //create obj

        Car car1 = new Car();
        car1.getFeatures();
    }
}