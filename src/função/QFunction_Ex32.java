package função;

import javax.swing.JOptionPane;
public class QFunction_Ex32 {
    public static void main(String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " = " + FunçãoFat(num));
    }
    static int FunçãoFat(int n){
        int fat;
        fat = 1;
        for (int i = 1; i <= n; i++){
            fat = fat*i;
        }
        return fat;
    }
}
