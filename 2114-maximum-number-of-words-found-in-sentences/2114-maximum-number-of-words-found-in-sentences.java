class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxLength = 0;
    for (int i = 0; i < sentences.length; i++) {
        maxLength = Math.max(maxLength,sentences[i].split(" ").length);        
    }
    return maxLength;
        
    }
}