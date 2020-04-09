package Model;

public class PilhaVetor<T> implements Pilha<T> {
	private int numero;
	private int tamanho;
	private T[] vetor;
	
	public PilhaVetor(int tamVet) {
		vetor =  (T[]) new Object[tamVet];
	}
	
	public String toString() {
		return "";
	}

	@Override
	public void push(T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void libera() {
		// TODO Auto-generated method stub
		
	}
}
