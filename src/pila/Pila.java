package pila;

public class Pila<T> implements Acceso<T> {

	private Nodo<T> cabeza;
	private int cantidad;

	@Override
	public void insertar(T q) {

		Nodo<T> nodo = new Nodo<T>(q);

		if (cabeza == null) {
			cabeza = nodo;
		} else {
			nodo.setNext(cabeza);
			cabeza = nodo;
		}

		cantidad++;
	}

	@Override
	public T obtener() throws Exception {

		if (cabeza == null)
			throw new Exception("No hay elementos");
		else {
			T auxiliar = cabeza.getInfo();
			cabeza = cabeza.getNext();
			cantidad--;
			return auxiliar;
		}

	}

	public static void copiaPila(Pila origen, Pila destino) {

		Pila<Object> aux = new Pila<Object>();
		Object o;

		try {
			while (true)
				aux.insertar(origen.obtener());

		} catch (Exception e) {}
		

		try {
			while (true) {
				o = aux.obtener();
				origen.insertar(o);
				destino.insertar(o);				
			}	

		} catch (Exception e) {}		

	}

	public String toString() {
		String salida = "Cantidad: " + cantidad + "\n";
		salida += "Valores: ";

		Nodo<T> aux = cabeza;
		while (aux != null) {
			salida += aux.getInfo() + " ";
			aux = aux.getNext();
		}

		return salida;
	}

}
