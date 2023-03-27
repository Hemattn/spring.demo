package assignment1;

class Ignition {

    Bike a;
    Car b;

    Ignition(Bike a ,Car b){
        this.a=a;
        this.b=b;

    }

    public void run(){
        a.start();
        b.start();
    }


}

class Bike {
   public void start(){
       System.out.println("Bike is running");
   }
}

class Car{
    public void start(){
        System.out.println("Car is running");
    }
}

public class TightlyCoupled{
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        Ignition key = new Ignition(bike,car);
        key.run();
    }
}