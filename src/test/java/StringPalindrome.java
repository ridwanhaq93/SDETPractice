public class StringPalindrome {



    //String palindrome
   /* Task #2:
    Palindrome Strings
    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. This includes capital letters, punctuation, and word dividers.
    Implement a function that checks if something is a palindrome. If the input is a number, convert it to string first.
    Examples:
            "anna"   ==> true
            "walter" ==> false
            12321	==> true
            123456   ==> false*/



        public static boolean isPalindrome(String word) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Check if the reversed string is equal to the original word
            return word.equals(reversed);
        }

        public static void main(String[] args) {
            String word = "racecar";
            boolean isPalindrome = isPalindrome(word);

            if (isPalindrome) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is not a palindrome");
            }
        }
    }
