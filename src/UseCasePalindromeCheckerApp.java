public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam"; // hardcoded string

        boolean isPalindrome = true;

        int start = 0;
        int end = input.length() - 1;

        // Compare from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
