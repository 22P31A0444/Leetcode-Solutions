class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int su = 0;
        int c=0;
        for(int i = 0;i<costs.length;i++){
            if(su+costs[i]<=coins){
                su = su +costs[i];
                c++;
            }else{
                break;
            }
        }
        return c;
        

        
    }
}