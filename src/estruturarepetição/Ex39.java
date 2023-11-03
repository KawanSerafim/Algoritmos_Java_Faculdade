package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex39 {
    public static void main(String args[]){
        long qtd;
        qtd = 1;

        for (int i = 1; i <= 64; i++){
            if (i > 1){
                qtd = qtd*2;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade máxima é: " + qtd);
    }
}
