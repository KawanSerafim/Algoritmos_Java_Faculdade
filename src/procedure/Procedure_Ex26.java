package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex26 {
    static int a, b;
    public static void main(String args[]){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        Analise();
    }
    static void Analise(){
        if (a > b){
            if ((a%b) == 0){
                JOptionPane.showMessageDialog(null, "'A' é maior e também múltiplo de 'B'.");
            }
            else{
                JOptionPane.showMessageDialog(null, "'A' é maior que 'B' mas não é seu múltiplo.");
            }
        }
        else if (b > a){
            if ((b%a) == 0){
                JOptionPane.showMessageDialog(null, "'B' é maior e também múltiplo de 'A'");
            }
            else{
                JOptionPane.showMessageDialog(null, "'B' é maior que 'A' mas não é seu múltiplo.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os dois valores são iguais");
        }
    }
}
