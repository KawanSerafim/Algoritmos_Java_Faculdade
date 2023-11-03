package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex6 {
    public static void main(String args[]){
        int x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor y"));
        aux = y;
        y = x;
        x = aux;

        JOptionPane.showMessageDialog(null, "O valor x agora é: " + x);
        JOptionPane.showMessageDialog(null, "O valor y agora é: " + y);
    }
    
}
