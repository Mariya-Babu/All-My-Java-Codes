import java.util.*;
class Swap{
    int swaping(Main obj){
        int temp;
        temp = obj.A;
        obj.A = obj.B;
        obj.B = temp;
        return 0;
    }
}
class Main{
    int A;
    int B;
    Main(int A,int B){
        this.A = A;
        this.B = B;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        int a = sc.nextInt();
        System.out.println("Enter b value :");
        int b = sc.nextInt();
        Main m = new Main(a,b);
        System.out.println("A , B value's before swaping...");
        System.out.println("The a value is :"+m.A);
        System.out.println("The b value is :"+m.B);
        Swap s = new Swap();
        s.swaping(m);
        System.out.println("A,B value's after swaping...");
        System.out.println("The a value is :"+m.A);
        System.out.println("The b value is :"+m.B);

    }
}