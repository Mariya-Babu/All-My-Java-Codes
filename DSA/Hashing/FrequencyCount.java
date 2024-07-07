import java.util.*;
class FreuencyCount{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("FrequencyCount implementation using java (using HashMap)");
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Array elements : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i])+1);
            }
            else{
                hashMap.put(a[i],1);
            }
        }

        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}