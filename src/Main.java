import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Are the strings exactly equal? " + str.equals(str2));
        System.out.println("Are the strings equal ignoring case? " + str.equalsIgnoreCase(str2));
        System.out.println("Do the strings contain exactly the same characters? " + str.contentEquals(str2));
        System.out.println("Does the first string contain the second string? " + str.contains(str2));
        System.out.println("Does the first string start with the second string? " + str.startsWith(str2));
        System.out.println("Does the first string end with the second string? " + str.endsWith(str2));
    }
}