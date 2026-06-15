package collectionsframework.Queue;
import java.util.*;
public class myQueue {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.offer(2);
        q.add(4);
        q.add(3);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        q.clear();
        //System.out.println(q.remove()); //throws exception
        System.out.println(q.poll());
        //System.out.println(q.element());// throw exception
        q.offer(6);
        q.offer(7);
        //System.out.println(q.element()); if element there it show top element

        System.out.println(q.peek());
    }
}
