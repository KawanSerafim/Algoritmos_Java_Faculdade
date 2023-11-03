package função;

import javax.swing.JOptionPane;
public class QFunction_Ex34 {
    public static void main(String args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        for (int i = 1; i <= 10; i++){
            JOptionPane.showMessageDialog(null, n + " x " + i + " = " + FunçãoTab(n, i));
        }
    }
    static int FunçãoTab(int num, int index){
        num = num*index;
        return num;
    }
}
