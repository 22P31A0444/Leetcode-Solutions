class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int c = 0;
        int l = n*(n+1)/2;        
        for(int i = 0;i<n;i++){
             c+= nums[i];
        }
        return l-c;
        
    }
}