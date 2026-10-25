import java.util.*;

public class IterationThroughCollections {

    public static void main(String[] args) {

        /*
        * ArrayList
        *
        * */

        List<String> iterateArrayListUsingStream = Arrays.asList("Sagar", "Santosh", "More");
        List<String> iterateArrayListUsingLoops = Arrays.asList("element1", "element2", "element3");

        iterateArrayList(iterateArrayListUsingStream);
        iterateArrayListUsingLoops(iterateArrayListUsingLoops);

        /*
        * MAP
        *
        * */

        Map<String,String> map = new HashMap<String, String>();
        map.put("interateMapUsingIterator-1","Val1");
        map.put("interateMapUsingIterator-2","Val2");

        Map<String,String> map2 = new HashMap<String, String>();
        map2.put("interateMapUsinEnhancedForLoop-1","Val3");
        map2.put("interateMapUsinEnhancedForLoop-2","Val4");

        Map<String,String> map3 = new HashMap<String, String>();
        map3.put("iterateMapUsingStream-1","Val5");
        map3.put("iterateMapUsingStream-2","Val6");

        Map<String,String> map4 = new HashMap<String, String>();
        map3.put("iterateMapUsingBuiltInForEach-1","Val7");
        map3.put("iterateMapUsingBuiltInForEach-2","Val8");

        interateMapUsingIterator(map);
        interateMapUsingEnhancedForLoop(map2);
        iterateMapUsingStream(map3);
        iterateMapUsingBuiltInForEach(map4);
    }


    /*
     * ArrayList
     *
     * */

    public static void iterateArrayList(List<String> arrayList){
        arrayList.forEach(System.out::println);
    }

    public static void iterateArrayListUsingLoops(List<String>arrayList){

        for (int i = 0; i< arrayList.size();i++){
            System.out.println("For loop :: "+arrayList.get(i));
        }

        for (String element : arrayList){
            System.out.println("Enhanced For loop :: "+element);
        }
        int i = 0;
        while (i<arrayList.size()){
            System.out.println("While loop :: "+arrayList.get(i));
            i++;
        }

    }











    /*
     * MAP
     *
     * */
    public static void interateMapUsingIterator(Map<String,String>mapToIterate){
        Iterator<Map.Entry<String,String>> iterator = mapToIterate.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> "+ entry.getValue()+"\n");
        }
    }

    public static void interateMapUsingEnhancedForLoop(Map<String,String>mapToIterate){
        for(Map.Entry<String,String> entry : mapToIterate.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue()+"\n");
        }

    }

    public static void iterateMapUsingStream(Map<String,String>mapToIterate){
        mapToIterate.entrySet().stream().forEach(map -> System.out.println(map.getKey()+" -> "+map.getValue()));
    }

    public static void iterateMapUsingBuiltInForEach(Map<String,String>mapToIterate){
        mapToIterate.forEach((key,value) -> System.out.println(key+" -> "+value+"\n"));
    }
}
