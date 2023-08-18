// Pattern - 7
//Pascal's Triangle
import java.util.*;
class Pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 7");
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            // For printing Spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // For printing Number's
            for(int j=0;j<=i;j++){
                System.out.print(+(nCr(i,j))+" ");
            }
            System.out.println();
        }
    }

    // factorial of a number
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }

    //nCr = n!/(r! * (n-r)!)
    public static int nCr(int n, int r){
        int res = fact(n) / (fact(r) * fact(n-r));
        return res;
    }

}