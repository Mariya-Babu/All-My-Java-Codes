import java.lang.*;
interface Vehical{
    void seatCapacity();
    void ac();
}
//Car
class Car implements Vehical{
    void seatCapacity(){
        System.out.println("car has 6 seat's ");
    }
    void ac(){
        System.out.println("AC is required ");
    }
}
//Lorry 
class Lorry implements Vehical{
    void seatCapacity(){
        System.out.println("Lorry has 3 seat's ");
    }
    void ac(){
        System.out.println("AC is not required");
    }
}
//Bus 
abstract Bus implements Vehical{
    void seatCapacity(){
        System.out.println("Bus has 46 seat's ");
    }
    abstract ac();
}
//NonAcBus
class NonAcBus{
    void ac(){
        System.out.println("Ac is not required ");
    }
}
//AcBus
class AcBus extends Bus{
    void ac(){
        System.out.println("Ac is required ");
    }
}
class InterfacteDemo{
    public static void main(String args[]){
        interface f;
        f = new Car();
        f.seatCapacity();
        f.ac();
        
    }
}