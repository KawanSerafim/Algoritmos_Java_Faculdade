package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex36 {
    public static void main(String args[]){
        int num, fat;
        double serie;
        serie = 1;
        fat = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 1; i <= num; i++){
            if (i == 1){
                serie = 1;
            }
            else{
                fat = fat*(i-1);
                serie = serie + (1/(double)fat);
            }
        }
        JOptionPane.showMessageDialog(null, "A série deu: " + serie);
    }
}
