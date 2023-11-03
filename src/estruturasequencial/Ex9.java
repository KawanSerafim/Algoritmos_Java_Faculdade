package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex9 {
    public static void main(String args[]){
        int x, y, som;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor y"));
        som = ((x*x)+(y*y));

        JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + som);
        }
}