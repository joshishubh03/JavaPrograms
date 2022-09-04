/*  Longest consecutive sequence.
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
  */
import java.util.*;
 class Longconsecutive
       {
     Scanner sc = new Scanner(System.in);
     public int consecutive(int arr1[])
     { 
         Arrays.sort(arr1);
         int start=arr1[0];
         for(int i=0;i<arr1.length;i++)
         {  
             if(start!=arr1[i])
             return arr1[i-1];
             ++start;
         }
     return 0;
     }
 }
         class TestMain {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Array size ");
         int n=sc.nextInt();
         int arr[]= new int[n];
         System.out.println(" ");
         System.out.println("Enter the values of 1st array :");
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
                 }
                 Longconsecutive Longcon = new Longconsecutive();
           System.out.print("Sequence break from : "+Longcon.consecutive(arr));
     }   
 } 