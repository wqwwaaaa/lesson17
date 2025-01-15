package zad4;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String w1 = "казак";
        String w2 = "комок";
        String w3 = "помидор";

        System.out.println(w1 + " - " + palindrome.isPalindromeWord(w1));
        System.out.println(w2 + " - " + palindrome.isPalindromeWord(w2));
        System.out.println(w3 + " - " + palindrome.isPalindromeWord(w3));
    }
}