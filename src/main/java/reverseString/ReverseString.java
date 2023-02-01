package reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        reverse("AHMAD HELAL");
    }

    public static void reverse(String word) {
        String reverse = "";
        for (int i = word.length()-1; i>=0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
