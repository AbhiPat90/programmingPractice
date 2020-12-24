public class Palindrome {
    // Logic includes comparision of fist and last index including ASCII values
    // complexity of the code is: n/2
    public static void main(String[] args) {
        String strPalindrome = "madaM";
        int startIndex = 0;
        int endIndex = strPalindrome.length()-1;
        while(startIndex!=endIndex){
            if(strPalindrome.charAt(startIndex)==strPalindrome.charAt(endIndex)
            || ((int)strPalindrome.charAt(startIndex) - (int)strPalindrome.charAt(endIndex)) == 32
            || ((int)strPalindrome.charAt(startIndex) - (int)strPalindrome.charAt(endIndex)) == -32){
                startIndex++;
                endIndex--;
            } else{
                System.out.println("String: "+strPalindrome+" --> Is not a Palindrome");
                break;
            }
        }
    }
}
