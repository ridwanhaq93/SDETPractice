public class isNumberPalindrome {
    public static void main(String[]args){
        int number= 121;
        String numberToString = Integer.toString(number);
        String reversednumber= "";
        for (int i=numberToString.length()-1;i>=0;i--){
            reversednumber = reversednumber + numberToString.charAt(i);

        }
        System.out.println(reversednumber.equals(numberToString));
    }
}
