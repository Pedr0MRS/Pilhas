package Model;

public interface Pilha <T> {
	
	public void push(T valor);
	public T pop();
	public T peek();
	public boolean vazia();
	public void libera();
	
}
