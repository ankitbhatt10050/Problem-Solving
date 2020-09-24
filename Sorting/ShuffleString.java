package Sorting;
import java.util.*;
 class Pairx{
    int x;
     String s;
    Pairx(int a,String b)
    {
        this.x=a;
        this.s=b;
    }


    public static Comparator<Pairx> StuNameComparator = new Comparator<Pairx>() {

        public int compare(Pairx s1, Pairx s2) {
           String StudentName1 = s1.s;
           String StudentName2 = s2.s;
           
    
           //ascending order
           return StudentName1.compareTo(StudentName2);
    
           //descending order
           //return StudentName2.compareTo(StudentName1);
        }
    };


}

//  class SortbyIndex implements Comparator<Pairx>
// {
//     public int compare(Pairx y,Pairx z)
//     {
//         return y.x-z.x;
//     }
// }

public class ShuffleString {
    
    public static void main(String[]args)
    {
        
       ArrayList<Pairx>l=new ArrayList<Pairx>();
       l.add(new Pairx(2,"b"));
       l.add(new Pairx(1,"a"));
       l.add(new Pairx(4,"d"));
       l.add(new Pairx(3,"c"));
       Collections.sort(l,Pairx.StuNameComparator);
       for(int i=0;i<l.size();i++)
       {
           System.out.print(l.get(i).x);
           System.out.print(l.get(i).s);
           System.out.println();
       }

       
        
       
        
    }
}
