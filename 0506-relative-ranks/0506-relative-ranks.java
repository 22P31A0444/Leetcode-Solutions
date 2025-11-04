class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] at = new int[n][2];
        for(int i =0;i<n;i++){
            at[i][0] = score[i];
            at[i][1] = i;
        }
        Arrays.sort(at,(a,b) -> b[0] - a[0]);

        String[] rank =new String[n];

        for(int i =0;i<n;i++){
            int indx = at[i][1];
            if(i==0) rank[indx] = "Gold Medal";
            else if(i==1) rank[indx] = "Silver Medal";
            else if(i==2) rank[indx] = "Bronze Medal";
            else rank[indx] = String.valueOf(i+1);
        }
        return rank;
        
    }
}