// Pattern - 9
import java.util.*;
class Pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 9");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

    }
}