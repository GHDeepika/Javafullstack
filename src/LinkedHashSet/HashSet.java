package LinkedHashSet;
import java.util.*;
public class HashSet {
  public static void main(String[] args){
      //Linkesdhashset
      LinkedHashSet<String> hs = new LinkedHashSet<>();
       hs.add("hello");
      hs.add("Deepu");
      hs.add("gowd");
      hs.add("Teja");
      System.out.println(hs);
      //remove
      hs.remove("gowd");
      System.out.println(hs);
      //contains
      System.out.println(hs.contains("gowd"));


  }
}
