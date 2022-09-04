import java.util.*;
class Peak
{
    Scanner sc = new Scanner(System.in);
    private int arr[]= new int[0];
    public Peak(int i[])
    {
        arr=i;
    }
    // public void setter()
    // {
    //     System.out.println("Enter the elements of the array :");
    //     for(int i=0;i<arr[i];i++)
    //     {
    //         System.out.println("Enter the "+(i+1) + "Element");
    //        arr[i]=sc.nextInt();
    //     }
    // }
    public void setter1(int pos ,int ele)
    {
        arr[pos-1]=ele;
    }
    public int[] getter()
    {
        return arr;
    }
    public void peak()
    {
        int k=0,c,d=0;
        c=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(c<arr[j])
            {
             c=arr[j];
             d=j;
            break;
            }
            }   
            }
            System.out.println("Peak Element is "+arr[d]);
            } 
     
            public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int n=sc.nextInt();
        int arr1[]= new int[n];
        System.out.println("Enter the values of array :");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
     Peak p = new Peak(arr1);
      p.peak();
    //  System.out.print("Enter the position of the Array element you want to change : ");
    //  int pos=sc.nextInt();
    //  System.out.println("Enter the New element you want to add : ");
    //  int ele=sc.nextInt();
    //   p.setter1(pos,ele);
      int a[]=p.getter();
    for(int c : a)
    System.out.println(c);
      p.peak();
    }
}