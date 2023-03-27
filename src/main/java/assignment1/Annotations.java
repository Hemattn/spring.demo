package assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class KeyOne{
    @Autowired
    GadgetsOne gadget;
    KeyOne(GadgetsOne gadget) {
        this.gadget=gadget;
        this.gadget.start();

    }

}
//interface with a method
interface GadgetsOne{
    void start();
}
@Component
class MobileOne implements GadgetsOne{

    @Override
    public void start() {
        System.out.println("Mobile class");
    }
}
@Component
class LaptopOne implements GadgetsOne{

    @Override
    public void start() {
        System.out.println("Laptop class");
    }
}
@Component
@Primary
class ComputerOne implements GadgetsOne{

    @Override
    public void start() {
        System.out.println("Computer class");
    }
}
//Class where all the objects are made.

@SpringBootApplication
public class Annotations{
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Annotations.class,args);
        KeyOne one = applicationContext.getBean(KeyOne.class);


    }
}