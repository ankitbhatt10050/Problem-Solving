package Recurrsion;
import java.util.*;
public class MergeSort {

    public static void Merge(int arr[],int st,int mid,int ed)
    {
        int n1=mid-st+1;
        int n2=ed-mid;

        int x[]=new int[n1];
        int y[]=new int[n2];

        for(int i=0;i<n1;i++)
        {
            x[i]=arr[st+i];
        } 

        for(int i=0;i<n2;i++)
        {
            y[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=st;
        while(i<n1&&j<n2)
        {
            if(x[i]<=y[j])
            {
                arr[k]=x[i];
                i++;
            }
            else{
                arr[k]=y[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=x[i];
            k++;
            i++;
        }

        while(j<n2)
        {
            arr[k]=y[j];
            k++;
            j++;
        }





    }

    public static void MergeSort1(int arr[],int st,int ed)
    {
        if(st<ed)
        {
            int mid=(st+ed)/2;
            MergeSort1(arr,st,mid);
            MergeSort1(arr,mid+1,ed);

            Merge(arr,st,mid,ed);
        }

    }


    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        MergeSort1(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}