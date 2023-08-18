// Pattern - 19
import java.util.*;
class Pattern19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pattern - 19");
        System.out.print("Enter n value : ");
        float n = sc.nextInt();

        System.out.println("n = "+(n));
        // System.out.println("nhc = "+(Math.ceil(n/2)));
        // System.out.println("nhf = "+(Math.floor(n/2)));

        double nhc = Math.ceil(n/2);    // nhc = Math.ceil(n/2);   h = half
        double nhf = Math.floor(n/2);   // nhf = Math.floor(n/2);  h = half
        System.out.println("nhc = "+(nhc));
        System.out.println("nhf = "+(nhf));
        //Main Logic Start's Here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<nhc){
                    if(j<(nhc-i) || j-i>=(nhf)){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }else{
                    if((j<=i-nhf) || (i+j+1)>=(n+nhf)){
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