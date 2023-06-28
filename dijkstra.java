//Dijkstra Algorithm to implement the shortest path between to nodes 
import java.util.*;
class Prims{
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
        int minCost = primsAlgo(g,vert);
        System.out.println("The minimum cost of the spanning tree is "+minCost);
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
    //Prim's Algo
    public static int primsAlgo(int[][] g,int n){
        int[] NotVisited = new int[n];
        int[] weights = new int[n];
        int[] sample = new int[n];
        int min=0,indx,minimum = 0;
        for(int i=0;i<n;i++){
            sample[i] = 99999;
            NotVisited[i] = 1;
            weights[i] = 0;
        }
        NotVisited[0] = 0;
        indx = 0;
        for(int i=0;i<n;i++){
            sample = fillSample(indx,sample,NotVisited,g,n,minimum);
            printArray(sample,n);
            indx = minVal(sample,n);
            minimum = sample[indx];
            if(i<n-1){
                weights[i] = sample[indx];
            }
            NotVisited[indx] = 0;
            sample[indx] = 99999;
        }
        System.out.println();
        printArray(weights,n);
        for(int i=0;i<n;i++){
            min +=  weights[i];
        }
        return min;
    }
    //to fill the sample with the given verticx associated edge weight's
    public static int[] fillSample(int indx,int[] sample,int[] NotVisited,int[][] g,int n,int minimum){
            boolean x = true;
            for(int i=0;i<n;i++){
                if(NotVisited[i]==0){
                    x = false;
                }
                else{
                    x = true;
                }
                if(g[indx][i]!=0 && x){
                    if(sample[i] > g[indx][i]){
                        sample[i] = g[indx][i]+minimum;
                    }
                }
                // else{
                //    sample[i] = 99999; 
                // }
            }
            return sample;
    }
    //minimum value from the array
    public static int minVal(int[] a,int n){
        int minIndx = 0;
        for(int i=0;i<n;i++){
            if(a[minIndx]>a[i]){
                minIndx = i;
            }
        }
        return minIndx;
    }
    //print array
    public static void printArray(int[] a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}