package Recurrsion;
import java.util.*;

public class ReturnKeypadCode {

    public static int KeyCode(int n,ArrayList<String>x)
    {
        if(n==0)
        {
            x.add("");
            return 1;
        }

        int smallcount=KeyCode(n/10,x);
        String S="";
        switch(n%10)
        {
            case 2:
            S="abc";
            break;
          
            case 3:
            S="def";
            break;
            
            case 4:
            S="ghi";
            break;
            
            case 5:
            S="jkl";
            break;
            
            case 6:
            S="mno";
            break;
            
            case 7:
            S="pqrs";
            break;
            
            case 8:
            S="tuv";
            break;
            
              case 9:
            S="wxyz";
            break;
        }

        for(int i=0;i<S.length()-1;i++)
        {
            for(int j=0;j<smallcount;j++)
            {
                x.add(x.get(j));
            }
        }
        
        int m=0,c=0;
        for(;m<x.size();)
        {
            char z=S.charAt(c);
            for(int i=0;i<smallcount;i++)
            {
                x.set(m,x.get(m)+z);
                m++;
                if(i==smallcount-1)
                {
                    c++;
                }
            }
        }


        return x.size();

    }


    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String>x=new ArrayList<String>();
       int l= KeyCode(n,x);
       System.out.println("Count is "+l);
        System.out.println(x);
    } 
}