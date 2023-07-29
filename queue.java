
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args){
        LinkedList<String> queue = new LinkedList<String>();

        queue.offer("lain");
        queue.offer("luis");
        queue.offer("janc");
        queue.offer("sheyn");
        queue.offer("ced");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peekFirst());
        System.out.println(queue);
        System.out.println(queue.peekLast());
        System.out.println(queue);
        

        Queue<String> prioQueue = new PriorityQueue<String>(Collections.reverseOrder()); //Collections.reverseOrder()

        prioQueue.offer("Luis");
        prioQueue.offer("Janc");
        prioQueue.offer("Ced");

        System.out.println(prioQueue);
        var size = prioQueue.size();
        for (int i = 0; i < size;i++){
            System.out.println(prioQueue.poll());
        }
    }
}
