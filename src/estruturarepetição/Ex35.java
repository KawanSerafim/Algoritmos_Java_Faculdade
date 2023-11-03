package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex35 {
    public static void main(String args[]){
        int a, b, som;
        som = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));

        if (a>b){
            for (int i = b; i <= a; i++){
                if ((i%2) != 0){
                    som = som + i;
                }
            }
            JOptionPane.showMessageDialog(null, "A somatória deu: " + som);
        }
        else if (b>a){
            for (int i = a; i <= b; i++){
                if ((i%2) != 0){
                    som = som + i;
                }
            }
            JOptionPane.showMessageDialog(null, "A somatória deu: " + som);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os valores são iguais.");
        }
    }
}