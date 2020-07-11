package Recurrsion;
import java.util.*;
class shin{
    public static String removeX(String X,String Z,int i,int c)
    {
        // String A="";
        if(i>X.length()-1)
        {
            
            return Z ;
        }
        if(X.charAt(i)=='x')
        {
            
            return removeX(X,Z,i+1);
        }
        else
        {
            
            Z=Z+X.charAt(i);
          return removeX(X, Z, i+1);
        }
        
        
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        String Z="";

        System.out.println(removeX(S,Z,0));
    


    }

}