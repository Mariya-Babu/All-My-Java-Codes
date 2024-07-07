import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("KadanesAlgo Implementation ");

        System.out.println("Enter Array size ");
        int n = sc.nextInt();
        int[] a = new int[n];


        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }


        int m1,m2,s1,s2;
        m1 = m2 = s1 = s2 = 0;

        for(int i=0;i<n;i++){
            if(a[i]<0){
                m2 = m1;
                m1 = a[i];
                s2 = max(s1+s2+m2,s1,s2);
                s1 = 0;
            }
            else{
                s1 += a[i];
            }
        }

        s2 = max(s1+s2+m1,s1,s2);
    }

    public static int max(int a, int b, int c){
        if(a>=b){
            if(a>=c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>=c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    
}





