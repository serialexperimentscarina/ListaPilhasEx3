package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController conversor = new ConverteController();
		String input;
		int decimal = 0;
		
		// Permita ao usuário inserir um número decimal limitado a 1000
		do {
			input = JOptionPane.showInputDialog("Digite um decimal entre -1000 e 1000: ");
			if (input != null) {
				try {
					decimal = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					decimal = 1001;
				} finally {
					if (decimal < -1000 || decimal > 1000) {
						JOptionPane.showMessageDialog(null, "Entrada inválida, tente novamente.");
					} else {
						JOptionPane.showMessageDialog(null, decimal + " em binário: " + conversor.decToBin(decimal));
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Encerrando.");
				break;
			}
		} while (decimal < -1000 || decimal > 1000);
		
	}

}
