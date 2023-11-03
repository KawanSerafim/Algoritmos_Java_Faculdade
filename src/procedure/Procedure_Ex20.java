package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex20 {
    static int A, B, C, Delta;
    static double r1, r2;
    
    public static void main(String args[]){
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite C"));
        Bhaskara();
        RaizesR();
    }
    static void Bhaskara(){
        Delta = ((B*B)+(-4*A*C));
    }
    static void RaizesR(){
        if (Delta > 0){
            r1 = ((-(B)+(Math.sqrt(Delta)))/(2*A));
            r2 = ((-(B)-(Math.sqrt(Delta)))/(2*A));
            
            JOptionPane.showMessageDialog(null, "A 1º raiz é: " + r1);
            JOptionPane.showMessageDialog(null, "A 2º raiz é: " + r2);
        }
        else if (Delta == 0){
            r1 = ((-(B)+(Math.sqrt(Delta)))/(2*A));
            r2 = r1;
            
            JOptionPane.showMessageDialog(null, "As duas raízes são " + r1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há raízes reais");
        }
    }
}
