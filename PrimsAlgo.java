import java.util.*;
class PrimsAlgo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vert;
        System.out.println("Enter no.of nodes : ");
        vert = sc.nextInt();
        int[][] g = new int[vert][vert];
        System.out.println("Enter the graph details with edge weights in adjacency matrix : ");
        for(int i=0;i<vert;i++){
            for(int j=0;j<vert;j++){
                System.out.print("g["+i+"]["+j+"] : ");
                g[i][j] = sc.nextInt();
                System.out.println();
            }
            g[i][i] = 0;
        }
        printMat(g,vert);
       // int minCost = primsAlgo(g,vert);
        //System.out.println("The minimum cost of the spanning tree is "+minCost);
    }

    //print matrix 
    public static void printMat(int[][] m, int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    //PrimsAlgo
    public static void primsAlgo(int[][] g,int n,int min){
        int[] key=new int[n];
        int[] pi=new int[n];
        int[] Q=new int[n];
        for(int i=0;i<n;i++){
            key[i] = 99999;
            pi[i] = 0;
            Q = i;
        }

    }
}