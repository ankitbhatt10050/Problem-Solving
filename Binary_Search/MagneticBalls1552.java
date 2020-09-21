package Binary_Search;
public class MagneticBalls1552{
    public static boolean check(long x,int m,int len)
    {
        int balls=1;
        int lastpos=0;
        for(int i=1;i<len;i++)
        {
            if(balls==m)
            {
                return true;
            }
            if(i-lastpos==x)
            {
                balls++;
                lastpos=i;
            }
        }
    
        return false;
    }

    // public static long maxDistance(int[] position, int m) {
        
    //     long st=1;
    //     long ed=-1;
    //     for(int i=0;i<position.length;i++)
    //     {
    //         if(position[i]>ed)
    //         {
    //             ed=position[i];
    //         }
    //     }
    //     long mid=-1;
    //     System.out.println("start:- "+st);
    //     System.out.println("end:- "+ed);
    //     while(st<=ed)
    //     {
    //          mid=st+(ed-st)/2;
    //          System.out.println("curr mid:- "+mid);
    //         if((check(mid,m,position.length)==true)&&(check(mid+1,m,position.length)==false))
    //         {
    //            return mid;
    //         }
    //         if(check(mid,m,position.length))
    //         {
    //             st=mid+1;
    //         }
    //         else
    //         {
    //             ed=mid-1;
    //             System.out.println("curr end:- "+ed);
    //         }
    //         System.out.println();
    //         System.out.println();
    //     }

        
    //     return mid;
    // }


    public static void main(String[]args)
    {
        //int arr[]={5,4,3,2,1,1000000000};
        int m=2;
       // System.out.println(maxDistance(arr,m));
       System.out.println(check(99999999,m,1000000000));
    }

}
