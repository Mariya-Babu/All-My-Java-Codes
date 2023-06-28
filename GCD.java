import java.util.*;
class GCD{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        FindGcd  fgd = new FindGcd();
        int Gcd; //variable to store the Gcd of two number's 
        System.out.println("Programme to find the given two numbers GCD ");
        System.out.println("Enter a value : ");
        int a = in.nextInt();
        System.out.println("Enter b value : ");
        int b = in.nextInt();
        if(a>=b){
            Gcd = fgd.gcd(a,b);
        }
        else{
            Gcd = fgd.gcd(b,a);
        }
        System.out.println("The gcd of the given two number's is "+Gcd);
    }
}
class FindGcd{
    int gcd(int a,int b){
        int rem;
        if(b==0){
            return a;
        }
        rem = a%b;
        return gcd(b,rem);
    }
}