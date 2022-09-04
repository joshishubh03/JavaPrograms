/*  Write a java program to reverse each word of String.
	Sample Input: "Java Is Plateform Independent"
	Output: "avaJ sI mrofetalP tnednepednI"              */

import java.util.*;

class cheeku {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = new String("Java Is Plateform Independent");
        String string1[] = str.split(" ");
        int len = str.length();
        char arr[] = new char[len];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i]);
        }
    }
}