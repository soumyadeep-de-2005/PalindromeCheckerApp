public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeStrategy strategy = new StackStrategy();

        String input = "level";

        long startTime = System.nanoTime();

        boolean isPalindrome = strategy.check(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("\nIs Palindrome? : " + isPalindrome);
        System.out.println("\nExecution Time : " + executionTime + " ns");
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