class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for(int i=0;i<image.length;i++){
            int low=0;
            int high = image[i].length-1;
            while(low< high){
                int temp = image[i][high];
                image[i][high] = image[i][low];
                image[i][low] = temp;
                low++;
                high--;
            }
            for(int j =0;j<image.length;j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}