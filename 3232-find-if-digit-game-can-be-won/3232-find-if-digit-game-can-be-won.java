class Solution {
    public boolean canAliceWin(int[] nums) {
        int singles = 0;
        int doubles = 0;
        int others = 0;

        for (int n : nums) {
            if (n < 10) {
                singles += n;      
            } else if (n < 100) {
                doubles += n;     
            } else {
                others += n;       
            }
        }

      
        int alice1 = singles;
        int bob1 = doubles + others;

  
        int alice2 = doubles;
        int bob2 = singles + others;

        return alice1 > bob1 || alice2 > bob2;
    }
}

