package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex18 {
    public static void main(String args[]){
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y"));
        
        if (x > y) {
            x = x - y;
            JOptionPane.showMessageDialog(null, "A diferença deu: " + x);
        }    
        else {
            y = y - x;
            JOptionPane.showMessageDialog(null, "A diferença deu: " + y);
        }    
    }
}
