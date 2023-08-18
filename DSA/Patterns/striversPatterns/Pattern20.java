// Pattern - 20
// Solid Butterfly Pattern
import java.util.*;
class Pattern20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 20");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<Math.round(n/2)){
                    if(j<=i || (n-j-1)<=i){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else{
                    if(j<=(n-i-1) || j>=i){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}