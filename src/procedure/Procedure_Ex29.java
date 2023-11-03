package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex29 {
    static Double inv;
    public static void main(String args[]){
        inv = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento, sendo que: \n \n 1 = Poupança \n 2 = Renda fixa"));
        calcInv();
    }
    static void calcInv(){
        if (inv == 1){
            inv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
            inv = ((inv*0.03))+inv;
            JOptionPane.showMessageDialog(null, "O valor corrigido é de: R$" + inv);
        }
        else if (inv == 2){
            inv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
            inv = ((inv*0.05))+inv;
            JOptionPane.showMessageDialog(null, "O valor corrigido é de: R$" + inv);
        }
        else
            JOptionPane.showMessageDialog(null, "Tipo de investimento recusado");
    }
}
