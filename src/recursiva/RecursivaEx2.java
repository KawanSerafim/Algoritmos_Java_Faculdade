package recursiva;

import javax.swing.JOptionPane;
public class RecursivaEx2 {
    public static void main(String args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, RecursivaSom(n));
    }
    static int RecursivaSom(int num){
        if (num >= 1){
            return num + RecursivaSom(num-1);
        }
        return 0;
    }
}
