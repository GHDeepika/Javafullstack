import java.util.HashMap;
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("House1",1);
        map.put("House2",0);
        map.put("House3",2);
        map.put("House4",1);
        for(String key : map.keySet())
        System.out.println(key  + " :" + map.get(key));
        //to print key and value  2nd method
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
