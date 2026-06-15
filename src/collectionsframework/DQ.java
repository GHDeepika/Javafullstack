package collectionsframework;
import java.util.*;
public class DQ {
 public static void main(String[] args){
     Deque<Integer> dq=new ArrayDeque<>();
     dq.addFirst(5);
     dq.addFirst(4);
     dq.addLast(3);
     dq.addLast(2);
     dq.addLast(1);
     System.out.println(dq);
     dq.remove(3);//it delete entire reference not only value
     System.out.println(dq);
     dq.pollFirst(); //to delete 1st element
     System.out.println(dq);
     dq.pollLast(); //to delete last element
     System.out.println(dq);
 }
}
