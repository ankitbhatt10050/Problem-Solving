package Recurrsion;
import java.util.*;

public class StringSubsequence {

    public static void Subsq(String str,String x,int i,int len)
    {
        if(i==len)
        {
            System.out.print(x+" ")
        }
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Subsq(str,"",0,str.length());
    }
}