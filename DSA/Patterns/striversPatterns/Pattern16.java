// Pattern - 16 
import java.util.*;
class Pattern16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 16");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        int x = 65;
        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+((char)(x+i))+" ");
            }
            System.out.println();
        }
    }
}