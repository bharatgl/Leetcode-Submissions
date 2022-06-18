class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String [] abc = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String> set = new HashSet<String>();
        for(String word: words){
            StringBuilder sr = new StringBuilder();
            for(int i = 0;i<word.length();i++){
                sr.append(abc[word.charAt(i)-'a']);
            }
            set.add(sr.toString());
        }
        return set.size();
    }
}