// Pattern - 21
import java.util.*;
class Pattern21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 21");
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==(n-1) || j==0 || j==(n-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}