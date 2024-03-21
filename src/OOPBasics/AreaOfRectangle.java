package OOPBasics;

public class AreaOfRectangle {
    //fields
    int length;
    int breadth;

    //constructor
    AreaOfRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //method
    int areaOfRectangle(){
        int area = this.breadth * this.length;
        return  area;
    }


}

class Main1 {
    public static void main(String[] args) {
        //object
        AreaOfRectangle rectangle = new AreaOfRectangle(12, 13);

        //call method to calculate area
        int area = rectangle.areaOfRectangle();
        System.out.println("Area:" + area);
    }
}
