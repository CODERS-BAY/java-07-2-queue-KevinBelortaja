import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> elements = new ArrayList<>();

    public void enqueue(int newElement) {
        elements.add(newElement);
    }

    public int size() {

        return elements.size();
    }

    public int dequeue() {
        if (elements.size() == 0) {
            throw new QueueTooSmallException();
        }

        int dequeueElements = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return dequeueElements;
    }

    public int[] dequeue2(int n) {
        int[] returnQueue = new int[elements.size()];
        for (int i = 0; i < n ; i++) {
            returnQueue[i] = dequeue();
        }
        return returnQueue;

    }
}
