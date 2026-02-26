public class UseCase8PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        String input = "madam";

        // Convert string to linked list
        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) head = tail = newNode;
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare halves
        Node first = head, second = prev;
        while (second != null) {
            if (first.data != second.data) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }
}