package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex19 {
    static double a, b;
    public static void main(String args[]){
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número."));
        CalcMaior();
    }
    static void CalcMaior(){
        if (a > b){
            JOptionPane.showMessageDialog(null, "O maior entre eles é: " + a);
        }
        else if (b > a){
            JOptionPane.showMessageDialog(null, "O maior entre eles é: " + b);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
    }
}
