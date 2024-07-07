class Solution {
    int[] memo = new int[101];
    public int rob(int[] nums) {
        for(int i=0;i<101;i++){
            memo[i] = -1;
        }
        memo[nums.length] = dp(nums,nums.length);
        return memo[nums.length];
    }
    public int dp(int[] a, int n){
        if(n<=0){
            return 0;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n] = Math.max(a[n-1]+dp(a,n-2),dp(a,n-1));
        return memo[n];
    }
}