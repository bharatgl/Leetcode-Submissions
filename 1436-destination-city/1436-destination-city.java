class Solution {
    public String destCity(List<List<String>> paths) {
        
       String starts ="";
        for(int i=0;i<paths.size();i++){
           starts+=paths.get(i).get(0);
        }
        for(int  i = 0;i<paths.size();i++){
            if(!starts.contains(paths.get(i).get(1))){
                 return paths.get(i).get(1);
                 
            }
        }
        return null;
    }
}