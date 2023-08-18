// Pattern - 14 
import java.util.*;
class Pattern14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 14");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();


        for(int i=0;i<n;i++){
            int x = 65;
            for(int j=0;j<=i;j++){
                System.out.print(" "+(char)(x+j)+" ");
            }
            System.out.println();
        }
    }
}