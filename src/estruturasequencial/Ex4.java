package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex4 {
    public static void main(String args[]){
        int tc;
        double tf;
        tc = Integer.parseInt(JOptionPane.showInputDialog("Digite os graus Celcius"));
        tf = (((9*tc)+160)/5);
        
        JOptionPane.showMessageDialog(null, "A temperatura em F é: " + tf);
    }
}
