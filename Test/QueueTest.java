import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

public class QueueTest {

    @Test
    public void addAndCheckSize() {
        Queue myQueue = new Queue();
        myQueue.enqueue(2);
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        Assertions.assertEquals(3,myQueue.size());
    }

    @Test
    public void giveFirstElementBackAndRemove() {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(9);
        myQueue.dequeue();
        Assertions.assertEquals(2,myQueue.size());

    }

    @Test
    public void giveFirstElementBackAddNewAndRemove() {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(9);
        myQueue.dequeue();
        myQueue.enqueue(7);
        Assertions.assertEquals(3,myQueue.size());
    }

    @Test
    public void giveSomeElementsBackAndRemove() {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(9);
        myQueue.enqueue(7);
        myQueue.enqueue(2);
        myQueue.dequeue2(2);
        Assertions.assertEquals(3,myQueue.size());
    }

    @Test
    public void giveSomeElementsBackAddNewAndRemove() {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(4);
        myQueue.enqueue(9);
        myQueue.enqueue(7);
        myQueue.enqueue(2);
        myQueue.dequeue2(2);
        myQueue.enqueue(5);
        myQueue.enqueue(1);
        Assertions.assertEquals(5,myQueue.size());
    }

    @Test
    public void exceptionTest () {
        Queue myQueue = new Queue();
        Assertions.assertThrows(QueueTooSmallException.class, () -> { (new Queue()).dequeue(); });
    }

}
