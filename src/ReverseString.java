public class ReverseString {

    public static void main(String [] args){


        String reverseString = reverseWithoutBuildInMethod("HELOOPUNE");
        String reverseTwoPointer = reverseStringTwoPointer("PUNE");
        String reverseStringBuiltIn = reverseStringBuiltIn("SAGARMORE");
        System.out.println(reverseString);
        System.out.println(reverseTwoPointer);
        System.out.println(reverseStringBuiltIn);

    }

    public static String reverseWithoutBuildInMethod(String str){
        String reverse = "";
        for (int i= str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringTwoPointer(String str){
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length-1;

        while (i<j){
            char temp = chars[i];
            chars[i]  = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static String reverseStringBuiltIn(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
