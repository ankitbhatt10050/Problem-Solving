package Recurrsion;

import java.util.*;

import javax.lang.model.util.ElementScanner6;


class QuickSort{

    public static int partition(int arr[],int st,int ed)
    {
        int pivot=arr[st];
        int count =0;
        for(int i=st+1;i<ed;i++)
        {
            if(arr[i]<pivot)
            {
                count++;
            }
        }

        int i=st;
        int j=ed;
        while(i<j)
        {
            while(arr[i]<=pivot && i<ed)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[st];
        arr[st]=arr[j];
        arr[j]=temp;


        return(st+count);
    }


    public static void Sort(int arr[],int st,int ed)
    {
        if(st<ed)
        {
            int pi=partition(arr,st,ed);
            Sort(arr,st,pi-1);
            Sort(arr,pi+1,ed);
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

        Sort(arr,0,n-1);

        System.out.println("Sorted Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}