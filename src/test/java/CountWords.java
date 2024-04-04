public class CountWords {
    public static void main(String[] args) {

        String str = "I am learning java java java programming";
        String[] words = str.split("\\s+");

        System.out.println("The number of words is: " + words.length);
    }
}

