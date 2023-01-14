class Solution {
    public void dfs(List<Character>[] adj, char node, char minCharacter, char [] visited)
    {
        // to this character, replace it with it's minimum character
        visited[node - 'a'] = minCharacter;
        
         // travel in neighbor of this character,
        // i.e travel in component of this character
        for(char near: adj[node - 'a'])
        {
            // if this character is not visited, call dfs for it
            if(visited[near - 'a'] == '#')
            {
                dfs(adj, near, minCharacter, visited);
            }
        }
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length(); // extract size
        
        List<Character>[] adj = new List[26]; // declaring adjacency matrix
        for (int i = 0; i < 26; i++) 
        {
            adj[i] = new ArrayList<>();
        }
        
        // travel through strings and establish connection
        for(int i = 0; i < n; i++)
        {
            adj[s1.charAt(i) - 'a'].add(s2.charAt(i));
            adj[s2.charAt(i) - 'a'].add(s1.charAt(i));
        }
        
        // make a visited vector of size 26
        // and symbol,'#' denotes that this particular character is not visited yet
        char [] visited = new char[26];
        for(int i = 0; i < 26; i++)
        {
            visited[i] = '#';
        }
        
         // now, travel through each character
        for(char c = 'a'; c <= 'z'; c++)
        {
            // if this character is not visited yet, call dfs here 
            if(visited[c - 'a'] == '#')
            {
                 // as we are calling dfs for each character, so
                // it will minimum value for that component.
                dfs(adj, c, c, visited);
            }
        }
        
        // Now lastly, replace each baseStr character with their 
        // minimum found out character in their component,
        String ans = "";
        for(int i = 0; i < baseStr.length(); i++)
        {
            ans += visited[baseStr.charAt(i) - 'a'];
        }
        
        // finally return ans string
        return ans;
    }
}