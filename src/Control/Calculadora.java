package Control;

import Model.*;

public class Calculadora {
	PilhaException exception = new PilhaException();
	
	public String Calcular(String expressao, int tipoLista) {
		if(tipoLista == 1) {
			return CalcularPilhaVetor(expressao);
		}
		else {
			return CalcularPilhaLista(expressao);
		}
	}
	
	private String CalcularPilhaVetor(String expressao) {
		String array[] = expressao.split(" ");
		PilhaVetor<Double> pilha = new PilhaVetor<Double>(array.length);
		double a = 0;
		double b = 0;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "+":
				a = (double) pilha.pop();
				b = (double) pilha.pop();
				total = Double.sum(a, b);
				pilha.push(total);
				break;
			case "-":
				a = (double) pilha.pop();
				b = (double) pilha.pop();
				total = Subtrai(a, b);
				pilha.push(total);
				break;
			case "*":
				a = (double) pilha.pop();
				b = (double) pilha.pop();
				total = Multiplica(a, b);
				pilha.push(total);
				break;
			case "/":
				a = (double) pilha.pop();
				b = (double) pilha.pop();
				total = Divide(a, b);
				pilha.push(total);
				break;
			default:
				if(pilha.peek() instanceof Double || pilha.vazia()) {					
				pilha.push(Double.parseDouble(array[i]));
				}
				else {
					//exception
				}
				break;
			}
		}
		return pilha.pop().toString();
	}
	
	private String CalcularPilhaLista(String expressao) {
		String array[] = expressao.split(" ");
		PilhaLista<Double> pilha = new PilhaLista<Double>();
		double a = 0;
		double b = 0;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "+":
				a = pilha.pop();
				b = pilha.pop();
				total = Soma(a, b);
				pilha.push(total);
				break;
			case "-":
				a = pilha.pop();
				b = pilha.pop();
				total = Subtrai(a, b);
				pilha.push(total);
				break;
			case "*":
				a = pilha.pop();
				b = pilha.pop();
				total = Multiplica(a, b);
				pilha.push(total);
				break;
			case "/":
				a = pilha.pop();
				b = pilha.pop();
				total = Divide(a, b);
				pilha.push(total);
				break;
			default:
				if(pilha.peek() instanceof Double || pilha.vazia()) {
				pilha.push(Double.parseDouble(array[i]));
				}
				break;
			}
		}
		return pilha.pop().toString();
	}
	
	private double Soma(double a, double b) {
		return a + b;
	}
	
	private double Subtrai(double a, double b) {
		return a - b;
	}
	
	private double Multiplica(double a, double b) {
		return a * b;
	}
	
	private double Divide(double a, double b) {
		return a / b;
	}
}
