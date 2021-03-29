package com.pavlo.data_structures.stacks_queues;

import com.pavlo.data_structures.stacks_queues.stack.MyArrStack;

public class QueueUsingStacks {

    private MyArrStack queue;
    private int length = 0;

    public QueueUsingStacks() {
        this.queue = new MyArrStack();
    }

    public Object peek() {
        return queue.peek();
    }

    public void enqueue(Object value) {
        MyArrStack newQueue = new MyArrStack();
        MyArrStack reordered = new MyArrStack();
        while (queue.getLength() != 0) {
            newQueue.push(queue.pop());
        }
        reordered.push(value);
        while (newQueue.getLength() != 0) {
            reordered.push(newQueue.pop());
        }
        queue = reordered;
        length++;
    }

    public void dequeue() {
        queue.pop();
        length--;
    }

    @Override
    public String toString() {
        return "QueueUsingStacks{" + queue.toString() + '}';
    }

    public static void main(String[] args) {
        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(2);
        queueUsingStacks.enqueue(3);

        System.out.println(queueUsingStacks);
        System.out.println(queueUsingStacks.peek());
        queueUsingStacks.dequeue();

        System.out.println(queueUsingStacks);
        System.out.println(queueUsingStacks.peek());
        queueUsingStacks.dequeue();
        System.out.println(queueUsingStacks);
    }

}
