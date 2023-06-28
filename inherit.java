class Inherit{
    int a,b;
    Inherit(int a,int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class Inheritance{
    public static void main(String args[]){
        System.out.println("Hello World!");
        Inherit in = new Inherit(10,5);
        in.display();
    }
}