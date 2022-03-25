package thessarx2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueA<E> {
        private Queue<E> queueList;
        public QueueA() {
            queueList = new LinkedList<E>();
        }
        public void enqueue(E object) {
            queueList.add(object);
        }
        public E dequeue() throws NoSuchElementException {
            return queueList.remove();
        }
        public boolean isEmpty() {
            return queueList.isEmpty();
        }
        public void printQueue() {
            Iterator<E> iterator = queueList.iterator();
            while (iterator.hasNext()) {
                Object value = iterator.next();
                System.out.println(value + " ");
            }
        }
    }


