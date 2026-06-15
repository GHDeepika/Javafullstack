package collectionsframework.Queue;

import java.util.*;

public class Spotify {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 songs:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Song " + i + ": ");
            q.offer(sc.nextLine());
        }

        System.out.println("\nCurrently Playing: " + q.peek());

        System.out.println("Removed Song: " + q.poll());

        if (!q.isEmpty()) {
            System.out.println("Now Playing: " + q.peek());
        }

        System.out.println("\nRemaining Playlist:");
        for (String song : q) {
            System.out.println(song);
        }

        sc.close();
    }
}
