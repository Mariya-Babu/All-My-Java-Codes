//Abstract class Demo
abstract class Animal{
    abstract void sound();
    abstract void behaviour();
    void numberOfEyes(){
        System.out.println("The no.of eye's are : "+2);
    }
}
//Dog class 
class Dog extends Animal{
    void sound(){
        System.out.println("Dog sound");
    }
    void behaviour(){
        System.out.println("Dog friend's ");
    }
    void running(){
        System.out.println("Dog is running ");
    }
}
// Cat class
class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound ");
    }
    void behaviour(){
        System.out.println("Cat good animal ");
    }
}
//Goat class
class Goat extends Animal{
    void sound(){
        System.out.println("Goat sound ");
    }
    void behaviour(){
        System.out.println("Goat is helping nature ");
    }
}
class AbstractDemo{
    public static void main(String args[]){
        Animal a;
        //prompting the dog details 
        a = new Dog();
        a.sound();
        a.behaviour();
        a.numberOfEyes();
        a.running();
        //prompting the cat details
        // a = new Cat();
        // a.sound();
        // a.behaviour();
        // a.numberOfEyes();
        // //prompting the Goat details 
        // a = new Goat();
        // a.sound();
        // a.behaviour();
        // a.numberOfEyes();
    }
}