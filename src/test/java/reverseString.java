public class reverseString {
    public static void main(String[]args){
        String name ="redwan";
        int length = name.length();
        String empty= "";
        for (int i=length-1;i>=0;i--){
            empty = empty + name.charAt(i);
        }
        System.out.println(empty);
    }
}
