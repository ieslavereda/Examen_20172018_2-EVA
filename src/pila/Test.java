package pila;

public class Test {

	public static void main(String[] args) {
		
		Pila<Integer> pila = new Pila<Integer>();
		Pila<Integer> pila2 = new Pila<Integer>();
		
		pila.insertar(4);
		pila.insertar(6);
		pila.insertar(7);
		
		Pila.copiaPila(pila, pila2);
		
		System.out.println(pila);
		System.out.println(pila2);
		

	}

}
