package Binary_Search;
import java.util.*;
public class CoinProblem {
    public static int arrangeCoins(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++)
        {
            arr[i]=arr[i-1]+i;
        }
        
        int st=0,ed=n;
        int ans=-1;
        while(st<=ed)
        {
            int mid=st+(ed-st)/2;
            if(arr[mid]>n)
            {
                ed=mid-1;
            }
            else{
                ans=mid;
                st=mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[]args)
    {
        System.out.print("The answer is"+arrangeCoins(8));
    }
  
}