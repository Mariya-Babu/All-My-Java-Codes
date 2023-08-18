// Pattern - 13
import java.util.*;
class Pattern13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 13");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        int k = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+(k++)+" ");
            }
            System.out.println();
        }
    }
}