import java.util.Stack;

/**
 * -----------------------------------------------------------
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * -----------------------------------------------------------
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * The application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5
     */
    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}