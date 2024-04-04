public class countNumberofDigits {
    public static void main(String[]args){
      countNumber(44);
    }
    public static int countNumber(int number){
        if (number == 0){
            return 1;
        }
        int count= 0;
        while (number !=0){
            number = number /10;
            System.out.println(number);
            count++;
        }
        return count;
    }
}
