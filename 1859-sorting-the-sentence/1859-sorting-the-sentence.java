class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = Integer.parseInt(String.valueOf(arr[i].charAt(arr[i].length() - 1)));
            result[index - 1] = arr[i].substring(0, arr[i].length() - 1);
        }

        return String.join(" ", result);
    }
}