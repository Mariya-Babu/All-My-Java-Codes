import java.util.*;
class Highest_Lowest_Frequency{
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

        int max = Integer.MIN_VALUE;
        int max_Key = -1;
        int min = Integer.MAX_VALUE;
        int min_Key = -1;

        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(max<entry.getValue()){
                max_Key = entry.getKey();
                max = entry.getValue();
            }

            if(min>entry.getValue()){
                min_Key = entry.getKey();
                min = entry.getValue();
            }
        }

        System.out.println("Hightest frequency key : "+max_Key+" with frequency : "+max);
        System.out.println("Lowest frequecny key : "+min_Key+" with frequency : "+min);
    }
}