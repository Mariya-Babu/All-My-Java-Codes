// Pattern - 18
import java.util.*;
class Pattern18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 18");
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        int x = 65;
        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int k = (x+(n-i-1)+j);
                System.out.print(" "+((char)(k))+" ");
            }
            System.out.println();
        }
    }
}