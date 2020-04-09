package Model;

public class ElementoLista<T> {
	private T info;
	private ElementoLista<T> prox;
	
	public T getInfo() {
		return this.info;	
	}

	public ElementoLista<T> getProx() {
		return this.prox;
	}

	public void setProx(ElementoLista<T> prox) {
		this.prox = prox;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public String toString() {
		return "";
	}
		
}	
