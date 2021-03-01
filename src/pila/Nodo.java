package pila;

public class Nodo<T> {
	
	private Nodo<T> next;
	private T info;
	
	public Nodo(T e) {
		this.info = e;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}
	
	public String toString() {
		return info.toString();
	}	

}
