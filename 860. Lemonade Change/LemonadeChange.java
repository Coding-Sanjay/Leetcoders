class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int amt5Count = 0;
        int amt10Count = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 10) {
                amt10Count += 1;

                if (amt5Count != 0) amt5Count -= 1;
                else return false;
                
            } else if (bills[i] == 20) {

                if (amt10Count != 0 && amt5Count != 0) {
                    amt10Count -= 1;
                    amt5Count -= 1;
                }
                else if (amt5Count >= 3) amt5Count -= 3;
                else return false;

            } else amt5Count += 1;
        }

        return true;
    }
}
