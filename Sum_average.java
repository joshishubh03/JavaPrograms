import java.util.*;
class Sum_average{
    private int sum=0;
    private int average=0;
    public void sum_av(int arr[])
    {        
        for(int i=0;i<arr.length;i++)
        {
            sum= sum+arr[i];
                }
                average = sum/arr.length;

    }
    public int Getsum()
    {
        return sum;
    }
    public int Getaverage()
    {
        return average;
    }
}
        class TestMain {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values of array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
     Sum_average sum_av = new Sum_average();
      sum_av.sum_av(arr);
      int sum = sum_av.Getsum();
      int average = sum_av.Getaverage();
      System.out.println("Sum is :  "+sum);
      System.out.println("Average is :  "+average);
          }
}