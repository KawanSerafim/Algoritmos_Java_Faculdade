package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex18 {
    static int a, b;
    public static void main(String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número."));
        Dif();
        JOptionPane.showMessageDialog(null, "A diferença deu: " + a);
    }
    static void Dif(){
        if (a > b){
            a = a - b;
        }
        else {
            a = b - a;
        }
    } 
}
