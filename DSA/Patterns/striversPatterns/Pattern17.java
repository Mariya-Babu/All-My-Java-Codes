// Pattern - 17
import java.util.*;
// import java.Math.*;
class Pattern17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 17");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int x = 65;

        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            for(int j=0;j<i-1;j++){
                System.out.print("   ");
            }
            int k = (n-i)*2+1;
            for(int j=0;j<k;j++){
                int h = Math.round(k/2);
                if(j<h){
                    System.out.print(" "+(char)(x+j)+" ");
                }
                else{
                    System.out.print(" "+(char)(x+(k-j-1))+" ");
                }

            }
            System.out.println();
        }
    }
}