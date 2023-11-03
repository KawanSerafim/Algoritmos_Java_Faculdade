package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex2 {
    public static void main (String args[]){
        int sal;
        double saln;
        sal = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salário"));
        saln = (sal + (sal * 0.15));
        
        JOptionPane.showMessageDialog(null, "O novo salário é: " + saln);
    }            
}
