// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
    void zigZag(int arr[], int n) {
                
        int j =1;
        for(int i=0; i<n-1; i++){
            if((i % 2 == 0 && arr[i] > arr[j]) || (i % 2 != 0 && arr[i] < arr[j] ) ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        
    }
}



        
         





        // int j=1
        // for (int i = 0; i < array.length; i++) {
        //     if((i % 2 == 0 && array[i] > array[j] ) || (i % 2 != 0 && array[i] < array[j] )){
        //       int temp=array[i];
        //         array[i]=array[j];
        //         array[j]=temp;
        //     }
        //     j++;
        // }
        // return array;