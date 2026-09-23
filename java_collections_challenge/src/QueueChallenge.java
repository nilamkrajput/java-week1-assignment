import java.util.LinkedList;
import java.util.Queue;

public class QueueChallenge{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();   
    
        // 1. Add items to queue
        queue.add(401);
        queue.add(402);
        queue.add(403);
        queue.add(404);
        queue.add(405);

        System.out.println("Items in queue : "+ queue);

        // 2. Remove items from queue

        int itemToRemove = queue.remove();
        System.out.println("\n Removed Token : "+ itemToRemove);

        System.out.println("Queue after element removal :");
        System.out.println(queue);

        // 3. Peek at the front item

        int nextItem = queue.peek();
        System.out.println("\n Next item : "+ nextItem);

        // 4. Display queue contents

        System.out.println("Remaining Queue");
        
        for(int i : queue){
            System.out.println("Elements are : "+ i);
        }
    }
}