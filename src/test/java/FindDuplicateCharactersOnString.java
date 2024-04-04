import java.util.HashSet;
import java.util.Set;
public class FindDuplicateCharactersOnString {
    public static void main(String[]args){
        String word = "laptop";
        Set<Character> duplicates = new HashSet<>(); // Using a Set to record duplicate characters 
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) { // Start from the next character
                if (word.charAt(i) == word.charAt(j)) {
                    // Check if it's already in duplicates to avoid printing the same character more than once
                    if (!duplicates.contains(word.charAt(i))) {
                        System.out.println("Duplicate character: " + word.charAt(i));
                        duplicates.add(word.charAt(i)); // Add to duplicates
                    }
                    break; // No need to look further, we found a duplicate
                }
            }
        }
    }
}