// Pattern - 6

import java.util.*;
class Pattern6{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Pattern - 6");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }

    }
}