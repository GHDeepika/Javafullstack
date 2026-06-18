package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CC {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);
       /*Comparator<Integer> com = new Comparator<Integer>() {
          public   int compare(Integer a,Integer b){
                if(a%10 >b%10){    //custom implementation
                    return 1;
                }
                return -1;
            }
        };
*/
      Comparator<Integer> com=(a,b)-> a%10 > b%10?1:-1;
        Collections.sort(list,com);  //it will swap and sort
        System.out.println(list);
    }
}
