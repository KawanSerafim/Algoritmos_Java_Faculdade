package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex8 {
    public static void main(String args[]){
        int dep;
        double poup;
        dep = Integer.parseInt(JOptionPane.showInputDialog("Digite o depósito"));
        poup = (dep + (dep*0.013));

        JOptionPane.showMessageDialog(null, "A poupança é: " + poup);
    }
}
