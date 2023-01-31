package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.EstoqueBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pc1 = JOptionPane.showInputDialog("Digite a primeira peça:");
		String pc2 = JOptionPane.showInputDialog("Digite a segunda peça:");
		String pc3 = JOptionPane.showInputDialog("Digite a terceira peça:");
		String pc4 = JOptionPane.showInputDialog("Digite a quarta peça:");
		String pc5 = JOptionPane.showInputDialog("Digite a quinta peça:");
		
		// Convertendo
		double p1,p2,p3,p4,p5;
		p1 = Double.parseDouble(pc1);
		p2 = Double.parseDouble(pc2);
		p3 = Double.parseDouble(pc3);
		p4 = Double.parseDouble(pc4);
		p5 = Double.parseDouble(pc5);
		
		
		// instanciando objetos
		EstoqueBO objeto = new EstoqueBO();
		
		JOptionPane.showMessageDialog(null, objeto.somarPecas(p1, p2, p3, p4, p5));

	}

}
