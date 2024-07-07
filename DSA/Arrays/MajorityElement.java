import java.util.*;

class MajorityElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.");

        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Array Elements ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // int[][] M = new int[2][1];
        int[][] M = majorityElement(a, 0, n - 1);

        System.out.println("The majority element in the given array is "+M[0][0]);

    }

    public static int[][] majorityElement(int[] arr, int start, int end) {
        if (start == end) {

            int[][] M = new int[2][1];
            M[0][0] = arr[start];
            M[1][0] = 1;

            return M;

        }

        int mid = start + (end - start) / 2;

       int[][] m1 =  majorityElement(arr, start, mid);
       int[][] m2 =  majorityElement(arr, mid + 1, end);

       int[][] sme = searchMajorityElement(m1,m2);

       return sme;
    }

    public static int[][] searchMajorityElement(int[][] m1, int[][] m2){
        int[][] M = merge(m1,m2);
        int[] mfc = findMaxFrequencyCount(M);  // mfc = max_frequency_count;

        if(mfc[1] == 1){
            int[][] m = new int[2][1];
            int max_element = -1;
            for(int i=0;i<M[0].length;i++){
                if(mfc[0]==M[1][i]){
                    max_element = M[0][i];
                    break;
                }
            }
            m[0][0] = max_element;
            m[1][0] = mfc[0];
            return m;


        }
        else if(mfc[1] == 2){

            int[][] m = new int[2][2];
            int max_element1 =-1, max_element2 = -1;
            for(int i=0;i<M[0].length;i++){
                if(mfc[0]==M[1][i]){
                    // max_element1 = M[0][i];
                    if(max_element1 == -1){
                        max_element1 = M[0][i];
                    }else{
                        max_element2 = M[0][i];
                    }
                }
            }

            m[0][0] = max_element1;
            m[0][1] = max_element2;
            m[1][0] = m[1][1] = mfc[0];
            return m;
        }

        int[][] m = new int[2][1];

        m[0][0] = m[1][0] = -1;
        return m;

    }

    public static int[][] merge(int[][] m1, int[][] m2){
        int n = m1[0].length + m2[0].length;
        int[][] temp = new int[2][n];
        int k = 0;

        for(int i=0;i<m1[0].length;i++){
            temp[0][k] = m1[0][i];
            temp[1][k] = m1[1][i];
            for(int j=0;j<m2[0].length;j++){
                if(temp[0][k] == m2[0][j]){
                    temp[1][k] += m2[1][j];
                    m2[0][j] = m2[1][j] = -1;
                }
            }
            k++;
        }

        for(int i=0;i<m2[0].length;i++){
            if(m2[0][i] != -1){
                temp[0][k] = m2[0][i];
                temp[1][k] = m2[1][i];
                k++;
            }
        }

        int[][] M = new int[2][k];
        for(int i=0;i<2;i++){
            for(int j=0;j<k;j++){
                M[i][j] = temp[i][j];
            }
        }

        return M;
    }


    public static int[] findMaxFrequencyCount(int[][] M){
        int[] mfc = new int[2];
        int max = Integer.MIN_VALUE;
        int max_count = 0;
        for(int i=0;i<M[1].length;i++){
            if(max < M[1][i]){
                max = M[1][i];
            }
        }


        for(int i=0;i<M[1].length;i++){
            if(M[1][i] == max){
                max_count++;
            }
        }

        mfc[0] = max;
        mfc[1] = max_count;

        return mfc;
    }
    public static void printArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


// 4,4,2,4,3,4,4,3,2,4

// 9
// 2 2 1 3 1 1 3 1 

// 5
// -53 75 56 56 56

