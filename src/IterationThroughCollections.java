import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterationThroughCollections {

    public static void main(String[] args) {

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
