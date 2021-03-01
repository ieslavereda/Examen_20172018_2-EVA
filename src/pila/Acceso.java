package pila;

public interface Acceso<T>
{
	void insertar(T q);
	T obtener() throws Exception;
}