package Sorting;
public class Incdescstring1370{
    public static String fun1(String s)
    {
        int freq[]=new int[26];
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            sum++;
        }
      
            String x="";
        String z="abcdefghijklmnopqrstuvwxyz";
        String l="zyxwvutsrqponmlkjihgfedcba";
        while(sum!=0)
        {
        for(int i=0;i<z.length();i++)
        {
            if(freq[z.charAt(i)-'a']!=0)
            {
                x+=z.charAt(i);
                freq[z.charAt(i)-'a']--;
                sum--;
            }
        }
        
        for(int i=0;i<l.length();i++)
        {
            if(freq[l.charAt(i)-'a']!=0)
            {
                x+=l.charAt(i);
                freq[l.charAt(i)-'a']--;
                sum--;
            }
        }

    }
        System.out.println("sum= "+sum);
        return x;
    }
    public static void main(String[]args)
    {
        String s="aaaabbbbcccc";
        System.out.println(fun1(s));
        
    }
}