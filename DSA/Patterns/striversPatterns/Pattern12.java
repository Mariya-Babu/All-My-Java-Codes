// Pattern - 12
import java.util.*;
class Pattern12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 12");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0; j<2*n;j++){
                if(j<=i){
                    System.out.print(" "+(j+1)+" ");
                }
                else if((2*n-j-1)<=i){
                    System.out.print(" "+(2*n-j)+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}