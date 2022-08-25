class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26]; // find occurence of each character in string magazine
        for (char i : magazine.toCharArray()) {
            a[i - 'a']++;
        }
        for (char i : ransomNote.toCharArray()) {
            if (a[i - 'a'] == 0) { // character is not found in magazine or a particular character doesn't have same or greater count than count in magazine
                return false;
            } else {
                a[i - 'a']--; // decrement if character exists
            }
        }
        return true;
    }
}