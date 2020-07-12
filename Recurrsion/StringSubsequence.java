package Recurrsion;
import java.util.*;

public class StringSubsequence {

    public static void Subsq(String str,int index,String curr)
    {
        int len=str.length();
        if(index==len)
        {
            System.out.print(curr+" ");
            return;
        }
        
            Subsq(str,index+1,curr+str.charAt(index));
            Subsq(str,index+1,curr);

       
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        Subsq(str,0,"");
       
    }
}