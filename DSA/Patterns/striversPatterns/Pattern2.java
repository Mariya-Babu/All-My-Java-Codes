// Pattern - 2
//Solid Triangle
import java.util.*;
class Pattern2{
    public static void main(String args[]){
        System.out.println("Pattern - 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}