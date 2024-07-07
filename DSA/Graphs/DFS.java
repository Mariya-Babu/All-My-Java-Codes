//Graph Traversal using Breath First Search
package Graphs;
import java.util.*;
public class DFS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
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


        System.out.println("DFS starts");
        //DFS Graph Traversal Main Logic Begin's Here
        boolean flag = false;
        s.push(0);
        visited[0] = 1;
        System.out.print(0+" ");
        while(!s.isEmpty()){
            int x = s.peek();
            for(int i=0;i<n;i++){
                flag = false;
                if(graph[x][i]==1 && visited[i]==0){
                    s.push(i);
                    visited[i] = 1;
                    System.out.print(i+" ");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                s.pop();
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
