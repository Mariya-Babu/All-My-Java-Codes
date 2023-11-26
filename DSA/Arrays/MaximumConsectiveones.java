class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int m = 0;
        int c = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                if(m<=c){
                    m = c;
                }
                c = 0;
            }
        }
        if(m<=c){
            m = c;
        }
        return m;
    }
}