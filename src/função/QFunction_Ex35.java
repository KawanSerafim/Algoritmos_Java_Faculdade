package função;

import javax.swing.JOptionPane;
public class QFunction_Ex35 {
    public static void main(String args[]){
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        FunçãoCaso(a, b);
        if (FunçãoCaso(a, b) == 0){
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
        else{
            JOptionPane.showMessageDialog(null, "A somatória deu: " + FunçãoCaso(a, b));
        }
    }
    static int FunçãoCaso(int n1, int n2){
        int som = 0;
        if (n1 > n2){
            for (int i = n2; i <= n1; i++){
                if ((i%2) != 0){
                    som = som + i;
                }
            }
            return som;
        }
        else if (n2 > n1){
            for (int i = n1; i <= n2; i++){
                if ((i%2) != 0){
                    som = som + i;
                }
            }
            return som;
        }
        else{
            return 0;
        }
    }
}
