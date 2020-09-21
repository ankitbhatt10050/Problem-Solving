
package Binary_Search;
import java.util.*;
public class KokoEatingBananas {
    public static boolean isVal(int arr[],int cap,int h)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(cap>=arr[i])
            {
                sum++;
            }
            else
            {
              int curr_sum=arr[i];
                while(curr_sum>=0)
                {
                    sum++;
                    curr_sum=curr_sum-cap;
                }
            }
           
        }
        if(sum<=h)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }



    public static int minEatingSpeed(int[] piles, int H) {
        
        int st=Integer.MAX_VALUE;
        int ed=0;
        for(int i=0;i<piles.length;i++)
        {
            ed+=piles[i];
            if(piles[i]<st)
            {
                st=piles[i];
            }
            
        }
        
        int mid=0;
        while(st<=ed)
        {
            mid=st+(ed-st)/2;
            
            if((isVal(piles,mid,H)==true)&&(isVal(piles,mid-1,H)==false))
            {
                return mid;
            }
            
            if(isVal(piles,mid,H))
            {
                ed=mid-1;
            }
            else
            {
                st=mid+1;
            }
            
        }
       
        return -1;        
    }

    public static void main(String[]args)
    {
        int arr[]={312884470};
        System.out.println("The solution is:- " + minEatingSpeed(arr,312884469));
    }
}
