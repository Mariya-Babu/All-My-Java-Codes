// Pattern - 2
import java.util.*;
class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 2");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("   ");
            }
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}