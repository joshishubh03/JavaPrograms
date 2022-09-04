/*}
109. Write a C program to find the largest and smallest element of an array.
 */
import java.util.*;
public class Largesmall {
    private int min=2147483647;
       private int max=-2147483648;
    public void Getlargesmall(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
              min=arr[i];
              if(max<arr[i])
              max=arr[i];
        }
    }
public int Getmax()
{
    return max;
}
public int Getmin()
{
    return min;
}
}

class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Largesmall ls = new Largesmall();
        ls.Getlargesmall(arr);
        System.out.println("Largest  Element in the array : "+ls.Getmax());
        System.out.println("Smallest Element in the array : "+ls.Getmin());
    }
}