import java.util.*;

class SeperateChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seperate Chaining implementation using java (Hashing)");

        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] probe = new int[n];
        int total_probes = 0;


        System.out.println("Enter Array elements ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
            probe[i] = 0;
        }

        System.out.println("Enter hash table length : ");
        int m = sc.nextInt();
        int[][] HashTable = new int[m][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                HashTable[i][j]  = -1;
            }
        }

        for(int i=0;i<n;i++){
            int loc = (2 * A[i] + 3) % m;   // h(k) = (2k+3) %m 

            for(int j=0;j<m;j++){
                if(HashTable[loc][j] == -1){
                    HashTable[loc][j] = A[i];
                    probe[i] = j;
                    break;
                }
            }
        }


        //Printing HashTable
        for(int i=0;i<m;i++){
            System.out.print(i+"   ");
            for(int j=0;j<m;j++){
                if(HashTable[i][j] != -1){
                    System.out.print(" ---> "+HashTable[i][j]);
                }
            }
            System.out.println();
        }
    }
}