package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex31 {
    public static void main(String args[]){
        int q;
        for (int i = 11; i < 150; i++){
            q = i*i;
            JOptionPane.showMessageDialog(null, "O quadrado de " + i + " é: " + q);
        }
    }
}
