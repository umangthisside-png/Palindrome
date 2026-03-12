/**
 * -----------------------------------------------------------
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * -----------------------------------------------------------
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * Measures and compares execution time of
 * palindrome validation algorithms.
 *
 * Uses System.nanoTime() for precise timing.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13
     */
    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    /**
     * Simple palindrome check method
     */
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}