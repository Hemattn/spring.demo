package assignment1;
class Key{
    Gadgets gadget;
    Key(Gadgets gadget) {
        this.gadget = gadget;
        gadget.start();
    }
}
//interface with a method
interface Gadgets{
   void start();
}
class Mobile implements Gadgets{

    @Override
    public void start() {
        System.out.println("Mobile class");
    }
}

class Laptop implements Gadgets{

    @Override
    public void start() {
        System.out.println("Laptop class");
    }
}

class Computer implements Gadgets{

    @Override
    public void start() {
        System.out.println("Computer class");
    }
}
//Class where all the objects are made.
public class LooselyCoupled{
    public static void main(String[] args) {
        Key obj1=new Key(new Mobile());
        Key obj2=new Key(new Laptop());
        Key obj3=new Key(new Computer());

    }
}