package Inheritance;

public class Polygon {
    //create method
    void displayInfo(){
        System.out.println("A polygon is a two dimensional shape with straight lines.");
    }
    int getPerimeter(int[] sides){
        int perimeter = 0;
        //find sum of all sides
        for(int side : sides){
            perimeter = perimeter + side;
        }
        return  perimeter;

    }

}

class Triangle extends Polygon{
    @Override
    void displayInfo() {
        System.out.println("A traingle is a polygon with 3 sides.");
    }
}

class Main6 {
    public static void main(String[] args) {
        //create an object of Triangle
        Triangle t1= new Triangle();

        //sides of triangle
        int[] triangleSides = {2, 5, 8};

        //call method
        int perimeter = t1.getPerimeter(triangleSides);
        System.out.println("Triangle perimeter: " + perimeter);

        //call displayInfo() ,ethod
        t1.displayInfo();
    }
}
