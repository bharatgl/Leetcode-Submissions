// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] arr, int n)
           {
           for(int i = 0; i < arr.length; i++){
               int temp = arr[i];
               int rslt  = 0;
               while(temp != 0){
                  int rem = temp % 10; 
                  rslt = (rslt * 10) + rem;
                  temp = temp / 10;
               }
               if(rslt != arr[i]){
                   
                   return 0;
               }
                 continue;

           }
           return 1;
           }
}