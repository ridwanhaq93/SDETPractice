public class StringPoolAndEquals {
    public static void main(String[] args) {
        String str = "apple";
        String str1 = "apple";
        String str2 = new String("apple");

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}