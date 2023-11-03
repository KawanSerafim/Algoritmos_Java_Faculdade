package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex22 {
    static int a, b;
    public static void main(String args[]){
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor."));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor."));
       if (a != b){
            Ordenador();
       }
       else{
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
       }
    }
    static void Ordenador(){
        if (a > b){
            JOptionPane.showMessageDialog(null, "A ordem é: " + b + ", " + a);
        }
        else{
            JOptionPane.showMessageDialog(null, "A ordem é: " + a + ", " + b);
        }
    }
}
