import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
        private int maxSize;
        private ArrayList<T> queue;
        public Queue(int size) {
            this.maxSize = size;
            this.queue = new ArrayList<T>(size);
        }
        public void enQueue(T value) {
            queue.add(value);
        }

        public T deQueue() {
            if (queue.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            T removeObj = queue.get(0);
            queue.remove(0);
            return removeObj;
        }

        @Override
        public String toString() {
            return "Queue{" +
                    "maxSize=" + maxSize +
                    ", queue=" + queue +
                    '}';
        }
    }

