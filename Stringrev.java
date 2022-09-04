import java.util.*;

class check {
    public void reverse() {
        String str = new String("Java Is Platform Independent");
        String part[] = str.split(" ");
        System.out.println("\nOriginal String is ");
        System.out.println(" " + str + "\n");
        String s;
        str = "";
        for (String demo : part) {
            s = demo + " ";
            for (int j = s.length() - 1; j >= 0; j--) {
                str = str + s.charAt(j);
            }
        }
        System.out.println("Reverse String is ");
        System.out.println(str);

    }
}

class Test {
    public static void main(String[] args) {
        check rev = new check();
        rev.reverse();
    }
}