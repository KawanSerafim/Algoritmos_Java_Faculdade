package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex21 {
    public static void main(String args[]){
        double n1, n2, n3, n4, med;
        
        // Coleta das notas:
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3º nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4º nota"));
        med = ((n1+n2+n3+n4)/4);
        
        // Cálculo da média aritmética e avaliação da situação:
        
        if (med >= 6){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if (med >= 4){
            JOptionPane.showMessageDialog(null, "Exame");
        }
        else {
            JOptionPane.showMessageDialog(null, "Retido");
        }
    }
}
