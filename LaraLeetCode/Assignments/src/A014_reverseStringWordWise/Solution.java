package A014_reverseStringWordWise;

public class Solution {
   public static void main(String[] args) {
            System.out.println(reverseWords("  abc xyz hello test"));
   }   
   public static String reverseWords(String s) {
       String arr[] = s.split("[\\s]+");
       StringBuffer sb = new StringBuffer();

       for(int i = arr.length-1; i >= 0; i--){
           sb.append(arr[i]);
           sb.append(" ");
       }
       return sb.toString().trim();
   }
}
