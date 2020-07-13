package Recurrsion;
import java.util.*;
public class PrintKeyPadCode {

    public static void printkeycode(int n,String output)
    {
        if(n==0)
        {
            System.out.print(output+" ");
            return;
        }

        char c[]=findchar(n%10);
        for(int i=0;i<c.length;i++)
        {
            printkeycode(n/10,c[i]+output);
        }




    }

    public static char[] findchar(int n)
    {
        switch(n)
        {
            case 2:
            return new char[] { 'a', 'b', 'c' };
            
        case 3:
            return new char[] { 'd', 'e', 'f' };
            
        case 4:
            return new char[] { 'g', 'h', 'i' };
            
        case 5:
            return new char[] { 'j', 'k', 'l' };
            
        case 6:
            return new char[] { 'm', 'n', 'o' };
            
        case 7:
            return new char[] { 'p', 'q', 'r', 's' };
            
        case 8:
            return new char[] { 't', 'u', 'v' };
            
        case 9:
            return new char[] { 'w', 'x', 'y', 'z' };
            
        }

        return null;

    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printkeycode(n,"");
    }

   



}