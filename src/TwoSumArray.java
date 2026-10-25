import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int [] array = {10,2,34,5,3,24,5,456,7,5,234,45,7,89,52,4,5};
        twoSum(array,57);
    }

    public static void twoSum(int[] array,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i< array.length;i++){
           int complement = target - array[i];

            if(map.containsKey(complement)){
                System.out.println("Pair found at index:: "
                        + map.get(complement) + " AND " + i
                        + " VALUE: " + complement + " AND " + array[i]);
            }
                map.put(array[i],i);
        }

    }
}
