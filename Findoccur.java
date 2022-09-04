
// Find occurance of an integer number in array.
import java.util.*;

class Findoccur {
    private int ar[];
    private int count;

    public Findoccur(int arr[]) {
        ar = arr;
    }

    public void Find(int ele) {
        int temp;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == ele) {
                count++;
            }
        }
    }

    public void getoccur() {
        System.out.println(" ");
        if(count>0)
        System.out.print("Occurance is : " + count);
        else System.out.print("Element does not Exists in array");

    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of Array ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of Array \n");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        int occur;
        System.out.println("Enter the element to find occurance");
        occur = sc.nextInt();
        Findoccur s = new Findoccur(arr);
        s.Find(occur);
        s.getoccur();
    }
}
