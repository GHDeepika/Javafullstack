package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args){

        HashMap<String , Integer> map=new HashMap<>();

        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);

        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }


        for(Map.Entry<String,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+":" +entry.getValue());

        }



    }







}