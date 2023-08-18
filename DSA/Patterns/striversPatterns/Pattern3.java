// Pattern - 3
// Solid Right Angled Triangle with (Numbers)
import java.util.*;
class Pattern3{
    public static void main(String args[]){
        System.out.println("Pattern - 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
}