package AbstractClassMethods;

interface MotorBike {
    //abstract method
    abstract void brake();
}

class SportsBike implements MotorBike {
    //implement the abstract method

    @Override
    public void brake() {
        System.out.println("Working of brake on Sports Bikes");
        System.out.println("Stopping Sports Bikes");
    }
}

class MountaiBike implements MotorBike {
    @Override
    public void brake() {
        System.out.println("Working of brake on Mountain Bikes");
        System.out.println("Stopping Mountain Bikes");
    }
}

class Main2 {
    public static void main(String[] args) {
        // acces brake od SportBike
        SportsBike obj1 = new SportsBike();
        obj1.brake();

        MountaiBike obj2 = new MountaiBike();
        obj2.brake();
    }
}