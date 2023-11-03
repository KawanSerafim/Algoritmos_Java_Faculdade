package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex23 {
    public static void main(String args[]){
        int v1, v2, v3, v4;
        
        // coleta dos 4 valores.
        
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º valor"));
        v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º valor"));
        
        // organização em ordem crescente.
        
        if (v1 < v2 & v2 < v3){
            if (v4 <= v1){
                JOptionPane.showMessageDialog(null, v4 + ", " + v1 + ", " + v2 + ", " + v3);
            }
            else if (v4 <= v2){
                JOptionPane.showMessageDialog(null, v1 + ", " + v4 + ", " + v2 + ", " + v3);
            }
            else if (v4 <= v3){
                JOptionPane.showMessageDialog(null, v1 + ", " + v2 + ", " + v4 + ", " + v3);
            }
            else
                JOptionPane.showMessageDialog(null, v1 + ", " + v2 + ", " + v3 + ", " + v4);
        }
        else {
            JOptionPane.showMessageDialog(null, "Os 3 primeiros valores não estão em ordem");
        }
    }
}
