package Control;

import Model.*;

public class Teste {

	public static void main(String[] args) {
		//testeVetor();
		testeLista();
	}

	public static void testeLista() {
		PilhaLista<String> pilhaList = new PilhaLista<String>();

		System.out.println("---------------------------------------------push1--------------------------------------------------");
		pilhaList.push("A");
		pilhaList.push("B");
		pilhaList.push("C");
		pilhaList.push("D");
		pilhaList.push("E");
		pilhaList.push("F");
		pilhaList.push("G");
		pilhaList.push("H");
		pilhaList.push("I");
		pilhaList.push("J");
		System.out.println("OK");
		
		// Bloco de peek()
		System.out.println("-------------------------------------------peek-----------------------------------------------------");
		System.out.println(pilhaList.peek());
		System.out.println(pilhaList.peek());
		System.out.println("OK");

		// Bloco toString()
		System.out.println("-------------------------------------------toString1------------------------------------------------");
		System.out.println(pilhaList.toString());
		System.out.println("OK");

		// Bloco de pop()
		System.out.println("-----------------------------------------------pop--------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(pilhaList.pop());
		}
		System.out.println("OK");

		System.out.println("----------------------------------------libera1------------------------------------------------------");
		pilhaList.libera();
		System.out.println("OK");

		System.out.println("-------------------------------------------toString2------------------------------------------------");
		System.out.println(pilhaList.toString());
		System.out.println("OK");
		
		System.out.println("---------------------------------------------push2--------------------------------------------------");
		pilhaList.push("K");
		pilhaList.push("L");
		pilhaList.push("M");
		pilhaList.push("N");
		pilhaList.push("O");
		pilhaList.push("P");
		pilhaList.push("Q");
		pilhaList.push("R");
		pilhaList.push("S");
		pilhaList.push("T");
		System.out.println("OK");


		System.out.println("-------------------------------------------VerifVazia1------------------------------------------------");
		System.out.println("Vazia? " + pilhaList.vazia());
		System.out.println("OK");
		
		System.out.println("----------------------------------------libera2------------------------------------------------------");
		pilhaList.libera();
		System.out.println("OK");

		System.out.println("-------------------------------------------VerifVazia1------------------------------------------------");
		System.out.println("Vazia? " + pilhaList.vazia());
		System.out.println("OK");
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println(pilhaList.peek());
		System.out.println(pilhaList.pop());
		
	}

	public static void testeVetor() {
		PilhaVetor pilhaVet = new PilhaVetor<String>(10);

		pilhaVet.push("A");
		pilhaVet.push("B");
		pilhaVet.push("C");
		pilhaVet.push("D");
		pilhaVet.push("E");
		pilhaVet.push("F");
		pilhaVet.push("G");
		pilhaVet.push("H");
		pilhaVet.push("I");
		pilhaVet.push("J");

		// Bloco de peek()
		System.out.println(pilhaVet.peek());
		System.out.println(pilhaVet.peek());

		// Bloco toString()
		System.out.println(pilhaVet.toString());

		// Bloco de pop()
		for (int i = 0; i < 10; i++) {
			System.out.println(pilhaVet.pop());
		}

		pilhaVet.libera();

		pilhaVet.push("K");
		pilhaVet.push("L");
		pilhaVet.push("M");
		pilhaVet.push("N");
		pilhaVet.push("O");
		pilhaVet.push("P");
		pilhaVet.push("Q");
		pilhaVet.push("R");
		pilhaVet.push("S");
		pilhaVet.push("T");

		System.out.println(pilhaVet.toString());

		System.out.println("Vazia? " + pilhaVet.vazia());

		pilhaVet.libera();

		System.out.println("Vazia? " + pilhaVet.vazia());
	}
}
