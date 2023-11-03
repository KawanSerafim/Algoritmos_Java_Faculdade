package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex22 {
    public static void main(String args[]){
        int x, y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite Y"));
        
        if (x != y){
            if (x > y){
                JOptionPane.showMessageDialog(null, x + " e " + y);
            }
            else {
                JOptionPane.showMessageDialog(null, y + " e " + x);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
    }
}
