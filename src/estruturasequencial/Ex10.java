package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String args[]){
        double x, y, dif;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite y"));
        dif = x - y;

        JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
    }
}
