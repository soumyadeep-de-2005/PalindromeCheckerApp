import java.util.Stack;

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeStrategy strategy = new StackStrategy();

        String input = "level";

        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("\nIs Palindrome? : " + isPalindrome);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}