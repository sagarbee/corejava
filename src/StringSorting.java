import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        sortAndconcatenateCommaSeparatedString("watermelon,apple,banana,orange");
    }

    public static void sortAndconcatenateCommaSeparatedString(String str){
       String [] strArray =  str.split(",");
       Arrays.sort(strArray);
       String t =  String.join("",strArray);
       System.out.println(t);
    }
}
