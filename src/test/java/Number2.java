public class Number2 {
    /*   /* Task #4:
    Create a function that accepts any numbers, it should check for each number should be able to be divided by 2 then it should count numbers that are divided by 2 without Remainder.
    For example:
    Input: 14589
    Output: 2 (Because only 4 and 8 can be divided by 2)*/
    public static void main(String[]args){
        System.out.println(countNumberDivisibleBy2(14589));
    }
    public static int countNumberDivisibleBy2(int number) {
        int count = 0;

        while (number > 0) {

            int singleDigit = number % 10;

            if (singleDigit % 2 == 0) {
                count++;
            }
            number = number / 10;

        }
        return count;

    }
}
