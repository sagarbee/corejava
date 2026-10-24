import java.util.Arrays;

public class IsPalindromNumberAndString {

    public static void main(String [] args){
    boolean isPalindrome  = isNumberPalindorme(121);
    boolean isStringPalindrome =  isStringPalindrome("POP");
    System.out.println(isPalindrome);
    System.out.println(isStringPalindrome);

    }

    public static boolean isNumberPalindorme(int num){

        if(num < 0 || num % 10 == 0 && num != 0){
            return false;
        }

        int reverse = 0;
        while(num > reverse){
            reverse = reverse * 10 + num % 10;
            num/=10;
        }
        return  num == reverse || num == reverse / 10;
    }

 /*   public static boolean isStringPalindrome(String str){
        String reverse =  reverseStringTwoPointer(str);
        return str.equalsIgnoreCase(reverse);
    }*/

    public static String reverseStringTwoPointer(String str){
        char [] charsArray = str.toCharArray();
        int i =0;
        int j = charsArray.length-1;
        while(i<j){
            char temp = charsArray[i];
            charsArray[i] = charsArray[j];
            charsArray[j] = temp;
            i++;
            j--;
        }
        return new String(charsArray);
    }

    public static boolean isStringPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
