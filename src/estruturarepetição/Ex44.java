package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex44 {
    public static void main(String args[]){
        int num, exp, aux;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente do número"));

        aux = num;
        for (int i = 1; i <= exp; i++){
            if (i > 1){
                num = num*aux;
            }
        }
        JOptionPane.showMessageDialog(null, "O resultado da potência é: " + num);
    }
}
