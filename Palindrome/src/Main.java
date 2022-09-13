
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String word = "a@zza";

         System.out.println( isPalindrome(word));
       
    }
            public static boolean isSpecial(char c){
         return (!Character.isDigit(c)
                && !Character.isLetter(c)
                && !Character.isWhitespace(c)) ;
    }
    public static boolean isPalindrome(String word){
            int start = 0 ;
        int end = word.length()-1;

        while(start<end){
            if(isSpecial(word.charAt(start))){
                start++;
                continue;
            }
            if(isSpecial(word.charAt(end))){
                end--;
                continue;
            }
            if(word.charAt(start) != word.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;

	}

}
