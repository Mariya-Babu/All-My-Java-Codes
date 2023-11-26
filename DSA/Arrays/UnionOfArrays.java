import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int n = a.length;
        int m = b.length;
        int j = 0, k = 0;
        int i = 1;
        int Union[] = new int[m+n];
        Union[0] = a[0]<=b[0]?a[0]:b[0];

        while(j<n && k<m){
            while(a[j]<=b[k] && (j<n && k<m)){
                if(a[j]!=Union[i-1]){
                    Union[i++] = a[j];
                }
                j++;
            }

            while(b[k]<=a[j] && (j<n && k<m)){
                if(b[k]!=Union[i-1]){
                    Union[i++] = b[k];
                }
                k++;
            }
        }

        if(j<n){
            while(j<n){
                if(a[j] != Union[i-1]){
                    Union[i++] = a[j++];
                }
            }
        }
        else{
            while(k<m){
                if(b[k] != Union[i-1]){
                    Union[i++] = b[k++];
                }
            }
        }
         return  Union;

    }
}