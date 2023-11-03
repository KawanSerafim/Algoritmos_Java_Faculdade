package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex19 {
    public static void main(String args[]){
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite y"));
        
        if (x > y){
            JOptionPane.showMessageDialog(null, "O maior é: " + x);
        }
        else if (y > x) {
            JOptionPane.showMessageDialog(null, "O maior é: " + y);
        }
        else {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
    }
}
