package Recurrsion;
import java.util.*;

public class PermutationOfString {

    public static String swap(String s,int i,int j)
    {
        char temp;
        char[] arr=s.toCharArray();
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }

    public static void permute(String s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
            return ;
        }
        else
        {
            for(int i=l;i<=r;i++ )
            {
                s=swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }
        }



    }


    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        permute(str,0,str.length()-1);
    }
}