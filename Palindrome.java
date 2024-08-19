import java.util.Scanner;

class Pal{
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to check for Palindrome: ");
        String str = sc.next();
        sc.close();
        if (Pal.isPalindrome(str)) {
            System.out.println("The input is a Palindrome");
        } else {
            System.out.println("The input is not a Palindrome");
        }

    }
}