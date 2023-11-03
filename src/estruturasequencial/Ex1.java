package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex1 {
    
    public static void main(String args[]){
        int L;
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
        L = (L*L);
        
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + L);
    }   
}