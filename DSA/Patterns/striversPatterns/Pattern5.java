// Pattern - 5

import java.util.*;
class Pattern5{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 5");
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        //Main Logic Start's Here
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}