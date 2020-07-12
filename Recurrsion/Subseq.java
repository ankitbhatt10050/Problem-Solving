package Recurrsion;
import java.util.*;
public class Subseq {

    public static int Subseq(String str,ArrayList<String>x)
    {
            if(str.length()==0)
            {
                x.add("");
                return 1;
            }
            
            String smallstr=str.substring(1);
            int ans=Subseq(smallstr, x);
            for(int i=0;i<ans;i++)
            {
                x.add(str.charAt(0)+x.get(i));
            }

            return 2*ans;
    }

    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        ArrayList<String>x=new ArrayList<String>();
        String str=s.nextLine();
        int sub=Subseq(str,x);
        for(int i=0;i<sub;i++)
        {
            System.out.println(x.get(i));
        }

    }
}