package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex11 {
    public static void main(String args[]){
        double c, r, pi;
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio"));
        pi = 3.14;
        c = (2*pi*r);

        JOptionPane.showMessageDialog(null, "O comprimento é:" + c);
    }
}
