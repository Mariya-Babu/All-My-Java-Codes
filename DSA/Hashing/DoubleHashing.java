import java.util.*;
//Hashing implementation using division method & open addressing
public class DoubleHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Double Hashing implementation in java (Hashing)");

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
        int[] HashTable = new int[m];

        for(int i=0;i<m;i++){
            HashTable[i] = -1;
        }

        for(int i=0;i<n;i++){
            int u = (2 * A[i] + 3)%m;   // h(k) = (2k+3) %m 
            
            for(int j=0;j<m;j++){
                int v = (3 * A[i] + 1)%m;
                if(HashTable[(u+v*j)%m] == -1){
                    HashTable[(u+v*j)%m] = A[i];
                    probe[i] = j+1;
                    break;
                }
            }
        }


        //Printing HashTable
        System.out.println("Hash Table");
        for(int i=0;i<m;i++){
            if(HashTable[i] != -1){
                System.out.print(HashTable[i]+" ");
            }else{
                System.out.print("_ ");
            }
        }

        //key and number of probes
        System.out.println("Key and no.of Probes");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(probe[i]+" ");
            total_probes += probe[i];
        }

        System.out.println("Total no.of probes = "+total_probes);
    }
}

//Array
// A = 3 2 9 6 11 13 7 12

//HashTable
// _ 9 _ 11 12 6 _ 2 _ 3

//I want to learn about the hashing data structure as much as possible 