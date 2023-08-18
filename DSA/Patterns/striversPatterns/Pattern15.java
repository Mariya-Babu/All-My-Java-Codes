// Pattern - 15
import java.util.*;
class Pattern15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 15");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        int x = 65;
        
        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" "+((char)(x+j))+" ");
            }
            System.out.println();
        }
    }
}