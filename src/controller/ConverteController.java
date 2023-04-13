package controller;

import br.com.serialexperimentscarina.pilhaint.PilhaInt;

public class ConverteController {
	
	PilhaInt pilha = new PilhaInt();
	
	// Conversão de decimais para binários, a qual se dá dividindo, sucessivamente, o valor de entrada por 2 e
	// concatenando os restos da divisão do último para o primeiro.
	public String decToBin(int decimal) {
		StringBuffer res = new StringBuffer();
		
		// Caso decimal negativo
		if (decimal < 0) {
			res.append("-");
			decimal = Math.abs(decimal);
		}
		
		// Recebendo um número decimale realizando as operações, irá inserindo os restos das divisões na pilha.
		do {
			pilha.push(decimal % 2);
			decimal /= 2;
		} while (decimal > 0);

		// Ao término do empilhamento, deverá ser feita a operação de desempilhar, concatenando cada número
		// desempilhado (Convertendo para String) com o próximo, até a pilha esvaziar.
		while (!pilha.isEmpty()) {
			try {
				res.append(pilha.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return res.toString();
	}

}
