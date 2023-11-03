package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex33 {
    public static void main(String args[]){
        int num;
        double serie;
        serie = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));

        for (int i = 1; i <= num; i++){
            serie = serie + (1/(double)i);
        }
        JOptionPane.showMessageDialog(null, "A série deu: " + serie);
    }
}
