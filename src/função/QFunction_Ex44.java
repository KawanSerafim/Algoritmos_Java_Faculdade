package função;

import javax.swing.JOptionPane;

public class QFunction_Ex44 {
    public static void main(String args[]){
        int num, exp;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente do número"));
        JOptionPane.showMessageDialog(null, "O resultado da potência é: " + FunçãoPot(num, exp));
    }
    static int FunçãoPot(int n, int e){
        int aux = n;
        for (int i = 1; i <= e; i++){
            if (i > 1){
                n = n*aux;
            }
        }
        return n;
    }
}
