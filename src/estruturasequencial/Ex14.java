package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex14 {
    public static void main(String args[]){
        int a1, a2, a3;
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º ângulo"));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º ângulo"));
        a3 = (180-(a1+a2));

        JOptionPane.showMessageDialog(null, "O 3º ângulo é: " + a3);
    }
}
