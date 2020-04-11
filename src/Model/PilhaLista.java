package Model;

public class PilhaLista<T> implements Pilha<T> {
	private ElementoLista<T> topo;
	String a = "";

	public String toString() {
		String result = "";
		boolean primeiro = true;
		
		if (!this.vazia()) {
			ElementoLista<T> atual = topo;

			while (atual != null) {
				if(primeiro) {
					result += (atual.getInfo().toString());
					primeiro = false;
				}else {					
					result += (", " + atual.getInfo().toString());
				}
				atual = atual.getAnter();
			}
		}
		return result;
	}

	@Override
	public void push(T valor) {
		ElementoLista<T> novoItem = null;		
		if (valor != null) {
			novoItem = new ElementoLista<T>(valor);
		} else {
			// TODO: Criar classe de Exception;
			System.out.println("Entrei Exc");
		}

		if (this.topo == null) {
			this.topo = novoItem;
		} else {
			this.topo.setProx(novoItem);
			novoItem.setAnter(this.topo);
			this.topo = novoItem;
		}
	}

	@Override
	public T pop() {
		ElementoLista<T> result = null;

		if (!this.vazia()) {
			if (this.topo.getAnter() == null) {
				result = this.topo;
				this.topo = null;
			} else {
				result = this.topo;
				this.topo = result.getAnter();
				this.topo.setProx(null);
			}
		} else {
			// TODO: Criar classe de Exception;
			System.out.println("Entrei Exc");
		}
		return result.getInfo();
	}

	@Override
	public T peek() {
		ElementoLista<T> result = null;

		if (!this.vazia()) {
			result = this.topo;
		} else {
			// TODO: Criar classe de Exception;
			System.out.println("Entrei Exc");
		}
		return result.getInfo();
	}

	@Override
	public boolean vazia() {
		return this.topo == null;
	}

	@Override
	public void libera() {
		if (!this.vazia()) {
			while (this.topo != null) {
				this.topo = this.topo.getAnter();					
				if(this.topo != null) {
					this.topo.setProx(null);					
				}
			}
		}
	}
}
