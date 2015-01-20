package assignment1;

import java.util.NoSuchElementException;

public class VipQueue<T> {
	private Node head, tail;
	public VipQueue() {
		head = null;
		tail = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public T peek() {
		if (head == null) { throw new NoSuchElementException(); }
        return (T) head.item;
	}
	public T dequeue() {
		if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = peek();
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item;
	}
	public void enqueue(T element) {
		Node newNode = new Node(element, null);
        if (isEmpty()){
        	head = newNode;
        }else {tail.next = newNode;}
        tail = newNode;
	}
	public void vipEnqueue(T element) {
		head = new Node(element, head);
	}
}
