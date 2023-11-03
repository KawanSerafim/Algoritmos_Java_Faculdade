package recursiva;

import javax.swing.JOptionPane;
public class RecursivaEx3 {
    public static void main(String arg[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, RecursivaSerie3(n));
    }
    static double RecursivaSerie3(double num){
        if (num >= 1){
            num = 1/num + RecursivaSerie3(num - 1);
        }
        return num;
    }
}
