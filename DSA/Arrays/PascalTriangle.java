import java.util.*;
class PascalTriangle{
    public static void main(String args[]){
        System.out.println("Hello World!");
        
        int n = 5;
        
        int nf = 1;
        int rf = 1;
        int nrf = 1;

        List<List<Integer>> matrix = new ArrayList<>();

        for(int i=1;i<=n;i++){
            List<Integer> list = new ArrayList<>();

            nf = nf *i;
            rf = 1;
            nrf = nf;

            list.add(1);
            for(int j=1;j<i;j++){ 
                if((i-j)!=0){
                    nrf = nrf/(i-j);
                }
                rf = rf * j;

                int ans = nf/(rf*nrf);
                list.add(ans);
                System.out.print(ans+" ");
                
            }
            System.out.println();
            matrix.add(list);
        }
    }
}