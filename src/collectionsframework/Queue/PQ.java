package collectionsframework.Queue;
import java .util.*;
public class PQ {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(12);
        pq.offer(100);
        pq.offer(15);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
