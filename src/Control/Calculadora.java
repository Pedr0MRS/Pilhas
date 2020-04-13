package Control;

import Model.*;

public class Calculadora {
	
	public String Calcular(String expressao, int tipoLista) throws Exception {
		
		
		if(tipoLista == 0) {
			return CalcularPilhaVetor(expressao);
		}
		else {
			return CalcularPilhaLista(expressao);
		}
	}
	
	private String CalcularPilhaVetor(String expressao) throws Exception {
		String array[] = expressao.split(" ");
		PilhaVetor<Double> pilha = new PilhaVetor<Double>(array.length);
		double a = 0;
		double b = 0;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "+":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Soma(b, a);
				pilha.push(total);
				break;
			case "-":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Subtrai(b, a);
				pilha.push(total);
				break;
			case "*":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Multiplica(b, a);
				pilha.push(total);
				break;
			case "/":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Divide(b, a);
				pilha.push(total);
				break;
			default:
				if(pilha.vazia() || ((pilha.toString()).split(",")).length < 2) {	
					String f[] = pilha.toString().split(",");
					pilha.push(Double.parseDouble(array[i]));
				}
				else {
					throw new PilhaException("Não pode ser inserido mais que dois números em sequência");
				}
				break;
			}
		}
		return pilha.pop().toString();
	}
	
	private String CalcularPilhaLista(String expressao) throws Exception {
		String array[] = expressao.split(" ");
		PilhaLista<Double> pilha = new PilhaLista<Double>();
		double a = 0;
		double b = 0;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case "+":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Soma(b, a);
				pilha.push(total);
				break;
			case "-":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Subtrai(b, a);
				pilha.push(total);
				break;
			case "*":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Multiplica(b, a);
				pilha.push(total);
				break;
			case "/":
				ValidateOperand(pilha.toString());
				a = pilha.pop();
				b = pilha.pop();
				total = Divide(b, a);
				pilha.push(total);
				break;
			default:
				if(pilha.vazia() || pilha.toString().split(",").length < 2) {
					pilha.push(Double.parseDouble(array[i]));
				}
				else {
					throw new PilhaException("Não pode ser inserido mais que dois números em sequência");
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
	
	private void ValidateOperand(String pilha) throws Exception {
		String array[] = pilha.split(",");
		if(array.length == 1) {
			throw new PilhaException("Não há números o suficiente para realizar a operação.");
		}
	}
}
