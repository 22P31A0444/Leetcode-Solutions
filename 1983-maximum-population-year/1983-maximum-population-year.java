class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        
        for (int[] log : logs) {
            year[log[0]]++;
            year[log[1]]--;
        }
        
        int maxPop = 0;
        int maxYear = 1950;
        int currentPop = 0;

        for (int y = 1950; y <= 2050; y++) {
            currentPop += year[y];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                maxYear = y;
            }
        }

        return maxYear;
    }
}
