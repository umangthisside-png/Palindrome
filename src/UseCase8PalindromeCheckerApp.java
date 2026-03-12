import java.util.LinkedList;

/**
 * -----------------------------------------------------------
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * -----------------------------------------------------------
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList data structure.
 *
 * Characters are added to the list and compared
 * from both ends using removeFirst() and removeLast().
 *
 * @author Developer
 * @version 8.0
 */

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8
     */
    public static void main(String[] args) {

        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {

            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}