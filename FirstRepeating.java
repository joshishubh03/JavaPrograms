import java.util.*;
class FirstRepeating{
    private  int repeatingele=2147483647;
             public void Findrep(int arr[])
             {
                 for(int i=0;i<arr.length;i++)
                 {

                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[i]==arr[j])
                        {
                        repeatingele=arr[i];
                        break;
                        }
                    }
                    if(repeatingele!=2147483647)
                    break;
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
        FirstRepeating firstrep = new FirstRepeating();
           firstrep.Findrep(arr1);
           System.out.println("First Repeating Element is : " +firstrep.getrepeating());
               
    }

}