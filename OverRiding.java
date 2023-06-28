class A{
    int x = 10;
    void show(){
        System.out.println("Hello world");
    }
}
class B extends A{
   final int x = 5;
    void show(){
        super.show();
        System.out.println("This is show method ");
        System.out.println(super.x);
    }
}
class OverRiding{
    public static void main(String args[]){
        B b = new B();
        b.show();
    }
}