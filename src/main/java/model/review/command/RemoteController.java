package model.review.command;


import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.util.NoSuchElementException;
import java.util.Queue;


/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-10 23:13
 **/
public class RemoteController {
    // CircularFifoQueue 非源码队列 这是一个fifo 固定大小的队列
    private CircularFifoQueue<Command> commandQueue = new CircularFifoQueue(5);
    private int position = -1;

    // 执行这个方法
    void pressDown(Command command) {
        commandQueue.add(command);
        position++;
        command.execute();
    }

    // 执行上一次操作
    void backward() {
        try {
            Command command = commandQueue.get(position - 1);
            command.execute();
        } catch (NoSuchElementException e) {
            System.out.println("上一步操作追溯不到了哦~");
            position++;
        } finally {
            position--;
        }
    }

    // 执行下一次操作
    void forward() {
        try {
            Command command = commandQueue.get(position + 1);
            command.execute();
        } catch (NoSuchElementException e) {
            System.out.println("下一步操作追溯不到了哦~");
            position--;
        } finally {
            position++;
        }
    }
}
