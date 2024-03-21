package OOPBasics;

import java.util.Scanner;

class Triangle {
    // create two fields
    int base;
    int height;

    // initialize value of base and height
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // compute the area of the right-angled triangle
    double computeArea() {
        double area = 0.5 * (base * height);
        return area;
    }
}

class Main2 {
    public static void main(String[] args) {

        // get input values for base and height
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();

        // object of Triangle
        Triangle triangle = new Triangle(base, height);

        // call the method to compute area
        double area = triangle.computeArea();
        System.out.println(area);

        input.close();
    }
}
