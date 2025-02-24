// Program to Check if a Given Text is a Palindrome
// Problem Statement: Create a PalindromeCheck class with an attribute `text`. 
// - Add a method to check if the text is a palindrome.
// - Display the result accordingly.

// Class to check if a string is a palindrome
class PalindromeCheck {
    String text;  // Variable to store the input text

    // Constructor to initialize the text
    PalindromeCheck(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Using StringBuilder for better performance instead of string concatenation
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    // Method to display the result
    public void display() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}

// Main class to execute the program
public class Palindrome {
    public static void main(String[] args) {
        // Creating objects with different text inputs
        PalindromeCheck p1 = new PalindromeCheck("madam");
        PalindromeCheck p2 = new PalindromeCheck("hello");

        // Displaying results
        p1.display();
        p2.display();
    }
}
