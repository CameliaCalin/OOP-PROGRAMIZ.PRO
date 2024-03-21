package OOPBasics;

import java.util.Scanner;

class Employee{
    //fields
    String name;
    double currentSalary;
    private double newSalary;

    //initilizate value of name and current salary
    Employee(String name, double currentSalary){
        this.name = name;
        this.currentSalary = currentSalary;
    }

    //compute salary -> setter method

    public void setNewSalary(double percentage) {
        this.newSalary = this.currentSalary + (percentage / 100.0) * this.currentSalary;
    }

    //getter method


    public double getNewSalary() {
        return newSalary;
    }
}

class Main4 {
    public static void main(String[] args) {
        //create objcet
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your current sallary: ");
        double currentSalary = input.nextDouble();

        Employee employee1 = new Employee(name, currentSalary);

        employee1.setNewSalary(20.00);
        double newSalary = employee1.getNewSalary();
        System.out.println("Name: " + employee1.name + "\nNew Salary: " + newSalary);

    }
}
