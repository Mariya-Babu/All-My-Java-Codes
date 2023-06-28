import java.util.*;
class FloyedWarshall{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vert;
        System.out.println("Enter no.of nodes : ");
        vert = sc.nextInt();
        int[][] g1 = new int[vert][vert];
        System.out.println("Enter the graph details with edge weights in adjacency matrix : ");
        for(int i=0;i<vert;i++){
            for(int j=0;j<vert;j++){
                //System.out.print("g["+i+"]["+j+"] : ");
                g1[i][j] = sc.nextInt();
               // System.out.println();
            }
            g1[i][i] = 0;
        }
        printMat(g1,vert);
        FWAlgo(g1,vert);
    }

    //print matrix 
    public static void printMat(int[][] m, int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
            //System.out.println();
        }
        System.out.println();
    }
    //Min Value
    public static int minVal(int i,int j){
        if(i<=j){
            return i;
        }
        else{
            return j;
        }
    }
    //FloyedWarshall Algorithm
    public static void FWAlgo(int[][] g,int n){
        int[][] d = new int[n][n];
        int[][] pi = new int[n][n];
        int[][] t = new int[n][n];
        d = g;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || d[i][j]==999){
                    pi[i][j] = 9999;
                }
                if(i!=j && d[i][j] < 999){
                    pi[i][j] = i+1;
                }
                if( i==j || d[i][j]<999){
                    t[i][j] = 1;
                }
                else{
                    t[i][j] = 0;
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.println("pi ["+k+"]");
            printMat(pi,n);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                        if(d[i][j]<=d[i][k]+d[k][j]){
                            pi[i][j] = pi[i][j];
                        }
                        if(d[i][j] > d[i][k]+d[k][j]){
                            pi[i][j] = pi[k][j];
                        }
                    d[i][j] = minVal(d[i][j],d[i][k]+d[k][j]);
                    t[i][j] = (t[i][j] || (t[i][j] && t[i][j]));
                }
            }
        }
        //disply
        System.out.println("Distance matrix is ");
        printMat(pi,n);
        System.out.println("After completing the algorithem ");
        printMat(d,n);
    }
}
