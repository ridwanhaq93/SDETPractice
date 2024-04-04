public class reverseEachWordInASentence {

   public static void main(String[] args) {

      String sentence = "Hey how is it going";
      System.out.println(revWords(sentence));
   }

   public static String revWords(String str){
      StringBuilder res= new StringBuilder();

      //split input string by " " space to get each word as String[]
      String []words= str.split(" ");

      //loop over the array from back
      for (int i=words.length-1;i>=-0;i--){
         res.append(words[i]).append(" ");
      }

      //trim needed to remove last space in the end
      return res.toString().trim();
   }
}
