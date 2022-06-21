class Solution {
    public boolean squareIsWhite(String s) {
        int c = s.charAt(0) ;   
        int r = s.charAt(1);
        if((c%2 == 0 && r%2 == 1) || (c%2 == 1 && r%2 == 0)) {
            return true;
        }
        return false;
    }
}