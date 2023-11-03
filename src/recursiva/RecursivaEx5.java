package recursiva;

import javax.swing.JOptionPane;
public class RecursivaEx5 {
    public static void main(String args[]){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        JOptionPane.showMessageDialog(null, "A série deu: " + Recursiva05(num));
    }
    static int Recursiva05(int n){
        if (n == 1){
            return 1;
        }
        else{
            return Fatorial(n) + Recursiva05(n-1);
        }
    }
    static int Fatorial(int a){
        if (a == 1){
            return 1;
        }
        else{
            return a * Fatorial(a-1);
        }
    }       
}
