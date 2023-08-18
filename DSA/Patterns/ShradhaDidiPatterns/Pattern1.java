// Pattern - 1
import java.util.*;
class Pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                if(j<i-1){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}