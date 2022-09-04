/*
Q.97. Find the first non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
*/
import java.util.*;
class Nonrepeating{
    private  int repeatingele=2147483647;
             public void Findrep(int arr[])
             {
                 int k=0;
                 for(int i=0;i<arr.length;i++)
                 {

                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[i]==arr[j])
                        {    k++;
                            break;
                            
                        }
                        
                        }
                        if(k==0){repeatingele=arr[i];
                            break;
                    }
                    k=0;
                 }
             }
             public int  getrepeating()
             {
                 return repeatingele;
             }

}
class TestMain{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Array size ");
        int n1=sc.nextInt();
        int arr1[]= new int[n1];
        System.out.println(" ");
        System.out.println("Enter the values of the array :");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
                }
       Nonrepeating nonrep = new Nonrepeating();
          nonrep.Findrep(arr1);
           System.out.println("First  Non Repeating Element is : " +nonrep.getrepeating());
               
    }

}