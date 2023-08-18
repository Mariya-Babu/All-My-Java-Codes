// Pattern - 4
//
import java.util.*;
class Pattern4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 4");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+(i+1)+" ");
            }
            System.out.println();
        }
        
    }
}