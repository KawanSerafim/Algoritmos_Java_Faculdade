package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex32 {
    public static void main(String args[]){
        int fat, num;
        fat = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (int i = 1; i <= num; i++){
            fat = fat*i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + fat);
    }
}

