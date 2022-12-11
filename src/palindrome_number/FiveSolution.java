package palindrome_number;

public class FiveSolution {
    /*
    * Given an integer x, return true if x is a palindrome, and false otherwise.
    * */
    public boolean isPalindrome(int x) {
        String num = x + "";
        StringBuilder numInverso = new StringBuilder();
        for (int i = num.length()-1 ; i>=0 ; i--){
            numInverso.append(num.charAt(i));
        }
        return num.equals(numInverso.toString());
    }
}
