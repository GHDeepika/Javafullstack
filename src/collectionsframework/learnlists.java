package collectionsframework;
import java.util.*;
public class learnlists {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(2);
        System.out.println(list.size());
        //to add elements
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("DeepuGowd");

        System.out.println(list);
        System.out.println(list.size());
        //to retrive
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //to add element at a specific index
        list.add(2,"100");
        System.out.println(list);
        System.out.println(list.contains("6"));
        System.out.println(list.isEmpty());
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf(5));
        System.out.println(list.lastIndexOf("4"));

    }
}
