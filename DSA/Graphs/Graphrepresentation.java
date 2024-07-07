//Graph Representation in computer using java
//Graph is represented in computer using a matrix
package Graphs;
import java.util.*;
public class Graphrepresentation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println("Enter no.of nodes in the graph : ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        int[] visited = new int[n];
        System.out.println("Enter the Graph in Matrix formate ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = sc.nextInt();
            }
            visited[i] = 0;
        }

        System.out.println("\n Graph ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("BFS starts");
        //BFS Graph Traversal Main Logic Begin's Here
        q.offer(0);
        visited[0] = 1;
        System.out.print(0+" ");
        //Explore the node
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i=0;i<n;i++){
                if(graph[x][i]==1 && visited[i]==0){
                    q.offer(i);
                    visited[i] = 1;
                    System.out.print(i+" ");
                }
            }
        }
    }
}

//Graph
// 0 1 1 1 0 0 0 1
// 1 0 1 0 1 0 0 1 
// 1 1 0 0 0 0 1 0
// 1 0 0 0 0 1 0 0
// 0 1 0 0 0 0 1 0 
// 0 0 0 1 0 0 0 0 
// 0 0 1 0 1 0 0 0 
// 1 1 0 0 0 0 0 0 
