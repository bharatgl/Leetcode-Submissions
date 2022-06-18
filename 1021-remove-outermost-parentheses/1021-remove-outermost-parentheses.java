class Solution {
    public String removeOuterParentheses(String S) {
         Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
             
                if (stack.size() > 0) {
                    sb.append(c);
                }
                stack.push(c);
            } else if (c == ')') {
                if (stack.size() > 1) {
                    sb.append(c);
                }
                stack.pop();
            }
        }
        return (sb.toString());
        
    }
}