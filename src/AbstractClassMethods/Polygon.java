package AbstractClassMethods;

import java.util.Scanner;

interface  Polygon {
    //abstract method
    abstract public void getArea(double base, double height);
}

//implement Polygon
class Triangle implements Polygon {
    @Override
    public void getArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area is "  + area);
    }
}
class Main1 {
    public static void main(String[] args) {
        //create obj of Triangle
        Triangle obj = new Triangle();
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        // the area of triangle
        obj.getArea(base, height);

    }
}
