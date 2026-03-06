
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        // Instantiate the service class
        PalindromeService service = new PalindromeService();

        // Define the input string
        String input = "racecar";

        // Check if the input is a palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        // Print the output 
        System.out.println("Input : " + input);
        System.out.println("\nIs Palindrome? : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                // If characters don't match, it's not a palindrome
                return false;
            }
            // Move pointers inward
            start++;
            end--;
        }

        // If the loop completes without returning false, it is a palindrome
        return true;
    }
}