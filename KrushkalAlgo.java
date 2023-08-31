import java.util.*;
class KrushkalAlgo{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vert;
        System.out.println("Enter no.of nodes : ");
        vert = sc.nextInt();
        int[][] g1 = new int[vert][vert];
        int[][] g2 = new int[vert][vert];
        int n = ((vert-1)*(vert-2))/2;
        // weights w[n] = new  weights();
        System.out.println("Enter the graph details with edge weights in adjacency matrix : ");
        for(int i=0;i<vert;i++){
            for(int j=0;j<vert;j++){
                System.out.print("g["+i+"]["+j+"] : ");
                g1[i][j] = sc.nextInt();
                System.out.println();
            }
            g1[i][i] = 0;
        }
        printMat(g1,vert);
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
}
//class for storing the edge weight's in an array
class weights{
    int i,j,e;
    weights(){

    }
    public void weight(int i,int j,int e){
        this.i = i;
        this.j = j;
        this.e = e;
    }
}
