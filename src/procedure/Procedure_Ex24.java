package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex24 {
    static int n;
    public static void main(String args[]){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        Analise();
    }
    static void Analise(){
        if (((n % 2)==0) & ((n%3)==0)){
            JOptionPane.showMessageDialog(null, "Divisível por 2 e 3");
        }
        else if ((n%2)==0){
            JOptionPane.showMessageDialog(null, "Divisível por apenas 2");
        }
        else if ((n%3)==0){
            JOptionPane.showMessageDialog(null, "Divisível por apenas 3");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não é divisível por 2 nem 3");
        }
    }
}
