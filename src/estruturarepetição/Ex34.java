package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex34 {
    public static void main(String args[]){
        int num, tab;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (int i = 1; i <= 10; i++){
            tab = num * i;
            JOptionPane.showMessageDialog(null, num + "x" + i + " = " + tab);
        }
    }
}
