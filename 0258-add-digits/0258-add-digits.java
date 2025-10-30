class Solution {
    public int addDigits(int num) {
        if(num<=9){
            return num;
        }
        while(num>9){
            int k = num;
            int count = 0;
            while(k>0){
                int l = k%10;
                k = k/10;
                count = count+l;

            }
            num = count;
        }
        return num;      
    }
}