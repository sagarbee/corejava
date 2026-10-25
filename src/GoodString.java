import java.util.HashMap;
import java.util.Map;

public class GoodString {

    public static void main(String[] args) {
        goodString("aabbccdd");
        goodStringUsingFrequency("aabbccdd");
    }

    //for lowercase alphabets
    public static void goodStringUsingFrequency(String str){
        if(str == null || str.isBlank()){
            System.out.println("Bad String");
            return;
        }
        int[] count = new int[26];
        for(char ch : str.toCharArray()){
            count[ch - 'a']++;
        }
        int frequency = 0;
        for (int ct : count) {
            if (ct != 0) {
                if (frequency == 0) {
                    frequency = ct;
                } else if (frequency != ct) {
                    System.out.println("Bad String");
                    return;
                }
            }
        }

        System.out.println("Good String");

    }

    public static void goodString(String str){

        if(str == null || str.isBlank()) return;

        Map<Character,Integer> map = new HashMap<>();

        for (char entry : str.toCharArray() ){
            map.put(entry,map.getOrDefault(entry,0)+1);
        }
        int count = map.get(str.charAt(0));
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() != count){
                System.out.println("Bad String");
                return;
            }

        }
        System.out.println("Good String");
    }

}