import java.util.*;
class selectionsort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();  
        }
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                min=j;
            }
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}