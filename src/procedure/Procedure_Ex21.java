package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex21 {
    static double n1, n2, n3, n4, media;
    public static void main (String args[]){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N3"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a N4"));
        Media();
        Sit();
    }
    static void Media(){
        media = (n1 + n2 + n3 + n4) / 4;
    }
    static void Sit(){
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "A media do aluno é " + media + ". Portanto, a situação é de aprovado.");
        }
        else if (media >= 4){
            JOptionPane.showMessageDialog(null, "A media do aluno é " + media + ". Portanto, a situação é de exame.");
        }
        else
            JOptionPane.showMessageDialog(null, "A media do aluno é " + media + ". Portanto, a situação é de reprovado.");
    }
}
