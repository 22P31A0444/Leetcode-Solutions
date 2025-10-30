class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        int count = 0;
        for(int num:nums){
            if(count==0){
                k = num;
            }
            count+=(num==k)?1:-1;
            

        }
        return k;
        
    }
}