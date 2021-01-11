import java.util.Scanner;
// Complexity of the code is reduced to n/2 from n
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("is String "+str+"a palindrome? -->" + isPalindrome(str));

    }

    public static boolean isPalindrome(String str){
        int startIndex = 0;
        int endIndex = str.length()-1;
        while(str.charAt(startIndex)!=str.charAt(endIndex)){
            if(str.charAt(startIndex) == str.charAt(endIndex)
            || (str.charAt(startIndex)-str.charAt(endIndex)==32)
            || (str.charAt(startIndex)-str.charAt(endIndex)==-32)){
                startIndex++;
                endIndex--;
            }else{
                System.out.println("String "+str+ ": is not palindrome");
                return false;
            }
        }
        return true;
    }
}
