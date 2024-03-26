package Poymorphism;

/*Create a program to compute the area of rectangle and square.*/
 class Area {

    // calculate area of Rectangle
    void computeArea(double length, double breadth) {

        double area = length * breadth;
        System.out.println(area);
    }

    // compute area of Square
    void computeArea(double length) {

        double area = length * length;
        System.out.println(area);
    }
}

class Main2 {

    public void main(String[] args) {

        // create object of Area class
        Area a1 = new Area();

        // call method to calculate area of rectangle
        a1.computeArea(2, 2);

        // call method to calculate area of square
        a1.computeArea(3);
    }
}