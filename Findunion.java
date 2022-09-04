/*
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
If there are repetitions, then only one occurrence of element should be printed in the union.
*/

import java.util.*;
class Findunion
{
    Scanner sc = new Scanner(System.in);
    private int arr[]= new int[0];
    private int count=0;
    public Findunion(int i[])
    {
        arr=i;
    }
    public int getcount()
    {
        return count;
    }
    public void Find(int arr2[],int n)
    {
        ArrayList<Integer> arl = new ArrayList<Integer>();
        int arr1[] = new int[n];
        
        int j=0;
        Arrays.sort(arr2);
        for(int i=0;i<n;i++)
        {
            if(arl.contains(arr2[i]) == false)
            {
            arl.add(arr[i]);
            count++;
        }
            }
              }
            }

        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Array size ");
        int n=sc.nextInt();
        System.out.print("Enter the 2nd Array size ");
        int n1=sc.nextInt();
        int k=0;
        int arr[]= new int[n];
        int arr1[]= new int[n1];
        int arr2[]= new int[n1+n];
        System.out.println("Enter the values of 1st array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr2[k]=arr[i];k++;
        }
        System.out.println("Enter the values of 2nd array :");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[k]=arr1[i];k++;
        }
     Findunion Union = new Findunion(arr2);
      Union.Find(arr2,n+n1);
      int count = Union.getcount();
      System.out.println("Output is  : "+count);
    }
}