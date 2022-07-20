class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='['||s.charAt(i)=='{')
                stk.push(s.charAt(i));
            else {
                if(stk.empty())
                    return false;
                switch(s.charAt(i)){
                        case ')' -> {
                            if(stk.pop()!='(') return false;
                        }
                        case ']' -> {
                            if(stk.pop()!='[') return false;
                        }
                        case '}' -> {
                            if(stk.pop()!='{') return false;
                        }
                 }
            }
          
    }
        return stk.empty();
 }
}