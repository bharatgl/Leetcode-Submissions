class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> Jewelset = new HashSet();
        for(char j: jewels.toCharArray())
            Jewelset.add(j);
        
        int ans = 0;
        for(char s: stones.toCharArray())
            if(Jewelset.contains(s))
                ans++;
        return ans;
    }
}