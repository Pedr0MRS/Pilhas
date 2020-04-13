package Model;

import com.sun.istack.internal.Nullable;

public class ElementoLista<T> {
	@Nullable private T info;
	private ElementoLista<T> prox;
	private ElementoLista<T> anter;
	
	public ElementoLista(T info) {
		this.setInfo(info);
	}
	
	public T getInfo() {
		return this.info;	
	}

	public ElementoLista<T> getProx() {
		return this.prox;
	}

	public void setProx(ElementoLista<T> prox) {
		this.prox = prox;
	}
	
	public ElementoLista<T> getAnter() {
		return this.anter;
	}

	public void setAnter(ElementoLista<T> anter) {
		this.anter = anter;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public String toString() {
		return info.toString();
	}
		
}	
