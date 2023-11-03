package função;

import javax.swing.JOptionPane;
public class QFunction_Ex33 {
    public static void main(String args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        JOptionPane.showMessageDialog(null, "A série deu: " + FunçãoSerie(n));
    }
    static double FunçãoSerie(int num){
        double serie;
        serie = 1;
        for (int i = 1; i <= num; i++){
            if (i > 1){
                serie = serie + (1/(double)i);
            }
        }
        return serie;
    }
}
