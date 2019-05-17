import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;
import java.util.Queue;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-10 11:04
 **/
public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new CircularFifoQueue<>(5);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(35);
        System.out.println(queue.toString());
        System.out.println("after peek " + queue.toString());
    }
}