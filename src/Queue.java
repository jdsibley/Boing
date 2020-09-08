
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */

/**
 * This class is a practice for the coursework
 */

import java.util.NoSuchElementException;


public class Queue < T > {

    //head and tail elements of the queue
    private QueueElement < T > head = null;
    private QueueElement < T > tail = null;

    /**
     * Constructs an empty Queue.
     */
    public Queue() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Returns true if the queue is empty
     */
    public boolean isEmpty() {
        //checks tail as well to reduce bugs
        return ((head == null) && (tail == null));
    }


    /**
     * Returns the element at the head of the queue
     */
    public T peek() throws NoSuchElementException {
        if (isEmpty()) { //checks if there are elements in queue.
            throw new NoSuchElementException("Queue Underflow");
        } else {
            return head.getElement(); //returns element at head
        }
    }

    /**
     * Removes the head element of the queue
     */
    public void dequeue() throws NoSuchElementException {
        if (isEmpty()) { //checks if there are elements in queue.
            throw new NoSuchElementException("Queue Underflow");
        } else if(head.getNext() == null) {
            head = head.getNext(); //removes link from front
            tail = null;
        } else {
        	head = head.getNext();
        }
    }

    /**
     * Puts an element on the tail of the queue.
     */
    public void enqueue(T element) {
    	
        QueueElement < T > newElement = new QueueElement < T > (element, null);

        if (isEmpty()) {
            this.head = newElement;
            this.tail = newElement;
        } else {
            //move tail back one element
            tail.setNext(newElement);
            this.tail = newElement;
        }
    }

    /**
     * Method to print the full contents of the queue in order from head to tail.
     */
    public void print() {

       
            QueueElement<T> thisElement;
            thisElement = this.head;

            while (thisElement != null) {
                System.out.println(thisElement.getElement());
                thisElement = thisElement.getNext();
            
        }
    }
}