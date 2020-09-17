package Binary_Search;
import java.util.*;
public class intersectionof2array {
    public static boolean fun(int arr[],int x)
    {
            int st=0;
            int ed=arr.length-1;
             
            while(st<=ed)
            {
                int mid=st+(ed-st)/2;
                if(arr[mid]==x)
                {
                    return true;
                }
                if(arr[mid]>x)
                {
                    ed=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            return false;
    }
    public static void main(String[]args)
    {
        int num1[]=new int[]{1,2,2,1};
        int num2[]=new int[]{2,2};

        Arrays.sort(num1);
        Arrays.sort(num2);

        HashSet<Integer>x=new HashSet<Integer>();

        for(int i=0;i<num1.length;i++)
        {
            if(fun(num2,num1[i]))
            {
                x.add(num1[i]);
            }
        }
       Object[]a= x.toArray();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

        
    }
}
