package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex7 {
    public static void main(String args[]){
        int h, l, c, v;
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento"));
        v = (h*l*c);

        JOptionPane.showMessageDialog(null, "O volume é: " + v);
    }
}