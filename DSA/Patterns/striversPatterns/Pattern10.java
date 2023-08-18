// Pattern - 10
import java.util.*;
class Pattern10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 10");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int m = 2 * n - 1;

        //Main Logic Start's Here
        for(int i=0;i<m;i++){
            if(i<n){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=i;j<m;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}