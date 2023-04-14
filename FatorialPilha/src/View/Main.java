package View;

import javax.swing.JOptionPane;
import Controller.FatController;

public class Main {
	public static void main(String[] args) {
		int J = 11;
		while (J<0 || J>10) {
			J = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero de 0 a 10"));
			if (J<0 || J>10) {
				JOptionPane.showMessageDialog(null, "O valor deve ser de 0 a 10");
			}else {
				if(J==0) {
					System.out.println("1");
				}else {
					FatController fat = new FatController();
					System.out.println(fat.fatorial(J));
				}
			}
		}	
	}
}
