import java.util.Deque;
import java.util.ArrayDeque;

/**
 * -----------------------------------------------------------
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * -----------------------------------------------------------
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends.
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7
     */
    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}