import java.util.*;
interface Vehical{
    void seatCapacity();
    void ac();
}
//Car
class Car implements Vehical{
     public void seatCapacity(){
        System.out.println("car has 6 seat's ");
    }
    public void ac(){
        System.out.println("AC is required ");
    }
}
//Lorry 
class Lorry implements Vehical{
    public void seatCapacity(){
        System.out.println("Lorry has 3 seat's ");
    }
    public void ac(){
        System.out.println("AC is not required");
    }
}
//Bus 
abstract class Bus implements Vehical{
    public void seatCapacity(){
        System.out.println("Bus has 46 seat's ");
    }
    public abstract void ac();
}
//NonAcBus
class NonAcBus{
    public void ac(){
        System.out.println("Ac is not required ");
    }
}
//AcBus
class AcBus extends Bus{
    public  void ac(){
        System.out.println("Ac is required ");
    }
}
class InterfaceDemo{
    public static void main(String args[]){
        Vehical v;
        //Lorry Detail's
        v = new Lorry();
        v.seatCapacity();
        v.ac();
        //Car Detail's 
        v =new  Car();
        v.seatCapacity();
        v.ac();
        //Bus Detail's 
        //NonAcBus
        // v =new  NonAcBus();
        // v.seatCapacity();
        // v.ac();
        // //AcBus
        // v = new AcBus();
        // v.seatCapacity();
        // v.ac();



    }
}