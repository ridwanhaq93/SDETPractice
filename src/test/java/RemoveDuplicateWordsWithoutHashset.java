public class RemoveDuplicateWordsWithoutHashset {
    public static void main(String[] args) {
        String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String output = removeDuplicateWords(input);
        System.out.println(output);
    }

    public static String removeDuplicateWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (currentWord.equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.append(currentWord);
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}