package Model;

public class PilhaVetor<T> implements Pilha<T> {
	private int numero = -1;
	private int tamanho;
	private T[] vetor;
	
	public PilhaVetor(int tamVet) {
		this.vetor =  (T[]) new Object[tamVet];
		this.setTamanho(tamVet);
	}
	
	public String toString() {
		String result = ""; 
		int controle = 0;
		
		for (int i = 0; i < numero + 1; i++) {
			if(controle == 0) {
				result+= vetor[i];
				controle++;
			}else {				
				result+= ","+ vetor[i];
			}
		}
		
		return result;
	}

	@Override
	public void push(T v) throws Exception {
		if(numero < this.getTamanho()) {
			if(v != null) {
				numero++;	
				this.vetor[numero] = v;				
			}else{
				throw new PilhaException("Insira um valor válido");
			}
		}else{
			throw new PilhaException("Posição inválida.");
		}
	}

	@Override
	public T pop() throws Exception {
		T item = null;
		if(this.vetor[numero] != null) {			
			item = this.vetor[numero];
			this.vetor[numero] = null;
			this.numero--;
		}else {
			throw new PilhaException("A pilha está vazia.");
		}
		return item;
	}

	@Override
	public T peek() {
		T item = null;
		if(this.numero == -1 && this.vetor[numero] != null) {			
			item = this.vetor[numero];
		}
		return item;
	}

	@Override
	public boolean vazia() {		
		return (this.vetor[0] == null);
	}

	@Override
	public void libera() {
		this.vetor = (T[]) new Object[tamanho];
	}

	private int getTamanho() {
		return tamanho;
	}

	private void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}		
}
