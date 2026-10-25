import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {

    public static void main(String[] args) {
        duplicateCharacterInString("SAGAR santosh More");
    }


    public static void duplicateCharacterInString(String str){

        Map<Character,Integer> countRecord = new  HashMap<Character, Integer>();

        for(char record : str.toUpperCase().toCharArray()){
            if(!Character.isWhitespace(record)){
                countRecord.put(record, countRecord.getOrDefault(record,0)+1);
            }
        }
        System.out.println(countRecord.entrySet());

        for (Map.Entry<Character,Integer> record : countRecord.entrySet()){
            if (record.getValue()>1){
                System.out.println(record.getKey() +"->" + record.getValue());
            }
        }
    }

}
