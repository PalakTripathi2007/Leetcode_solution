class Solution {
    public boolean checkValidString(String s) {
        int minBalance = 0;
        int maxBalance = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                minBalance++;
                maxBalance++;
            }
            else if (ch == ')') {
                minBalance--;
                maxBalance--;
            }
            else { // '*'
                minBalance--;  // '*' ko ')' maan lo
                maxBalance++;  // '*' ko '(' maan lo
            }

         
            if (minBalance < 0) {
                minBalance = 0;
            }

            
            if (maxBalance < 0) {
                return false;
            }
        }

        return minBalance == 0;
    }
}