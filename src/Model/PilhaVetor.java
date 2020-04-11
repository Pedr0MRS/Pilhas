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
		for(T item : vetor) {			
			if(controle == 0) {
				result+= item;
				controle++;
			}else {				
				result+= ","+ item;
			}
		}
		return result;
	}

	@Override
	public void push(T v) {
		if(numero < this.getTamanho()) {
			if(v != null) {
				numero++;	
				this.vetor[numero] = v;				
			}else{
				//TODO: Criar classe de Exception
				System.out.println("Entrei Exc");
			}
		}else{
			//TODO: Criar classe de Exception
			System.out.println("Entrei Exc");
		}
	}

	@Override
	public T pop() {
		T item = null;
		if(this.vetor[numero] != null) {			
			item = this.vetor[numero];
			this.vetor[numero] = null;
			this.numero--;
		}else {
			//TODO: Criar classe de Exception
			System.out.println("Entrei Exc");
		}
		return item;
	}

	@Override
	public T peek() {
		T item = null;
		if(this.vetor[numero] != null) {			
			item = this.vetor[numero];
		}else {
			//TODO: Criar classe de Exception
			System.out.println("Entrei Exc");
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
