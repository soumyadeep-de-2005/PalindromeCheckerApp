public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // hardcoded string

        // Convert string to character array
        char[] charArray = word.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Palindrome Checker App");

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}