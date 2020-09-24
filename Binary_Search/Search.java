package Binary_Search;


import java.util.*;
import java.util.ArrayList;

public class Search {
public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
   ArrayList<ArrayList<Integer>> x=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer>z=new ArrayList<Integer>();
    for(int i=0;i<5;i++)
    {
        int a=s.nextInt();
        int b=s.nextInt();
        z.add(a);
        z.add(b);
        x.add(z);

    }
    z.add(1);
    x.add(z);
    System.out.print(x);
}
}
