import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWordFromString {

    public static void main(String [] args){

        int count = countWordFromString("Hello Sagar from Pune !  ! !");
        System.out.println(count);

        //Count frequency of each word in given string
        Map<String,Integer> countMap = countUsingMap("JAVA PYTHON JS JAVA PYTHON");
        System.out.println(countMap.toString());
    }

    public static int countWordFromString(String str){
        String [] word = str.trim().split("\\s+");
        int count = 0;
        for(int i=0;i<word.length;i++){
            count++;
        }
        return count;
    }

    public static Map<String,Integer> countUsingMap(String str){
        String [] wordArray = str.trim().split("\\s+");
        Map<String,Integer> wordCount = new HashMap<>();
/*
        for(int i= 0; i< wordArray.length;i++){
            wordCount.put(wordArray[i],wordCount.getOrDefault(wordArray[i],0)+1);
        }
*/
        for(String word : wordArray){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
    return wordCount;
    }

}
