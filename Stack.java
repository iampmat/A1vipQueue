package assignment1;

import java.util.NoSuchElementException;

public class Stack<T>{
	private Node top;
	public Stack() {
		top = null;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public T peek(){
		if (top == null) { throw new NoSuchElementException(); }
        return (T) top.item;
	}
	public T pop(){
		 T next = peek();
	     top = top.next;
	     return next;
	}
	public void push(T element){
		top = new Node(element, top);
	}
}
