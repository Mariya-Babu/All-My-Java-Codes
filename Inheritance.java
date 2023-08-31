class Parent{
    int a,b;  //instance variables
    // Parent(int a,int b){
    //     this.a = a;
    //     this.b = b;
    // }
    void display(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class Child extends Parent{
    int c,d;
    void show(){
        System.out.println(this.c);
        System.out.println(this.d);
    }
}
class Inheritance{
    public static void main(String args[]){
        System.out.println("Hello World!");
        Inherit in = new Inherit(10,5);
        in.display();
    }
}