import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		double num1, num2, soma, sub, mult, div;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero: "));
		
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero: "));
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		JOptionPane.showMessageDialog(null,
						 num1+  "+"  +num2+" = " +soma + 
				"\n" + num1+  "-"  +num2+" = " +sub +
				"\n" + num1+  "*"  +num2+" = " +mult +
				"\n" + num1+  "/"  +num2+" = " +div);
	}

}
