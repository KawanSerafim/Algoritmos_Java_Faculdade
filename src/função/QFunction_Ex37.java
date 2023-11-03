package função;

import javax.swing.JOptionPane;
public class QFunction_Ex37 {
    public static void main(String args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        JOptionPane.showMessageDialog(null, "O valor do " + n + "º lugar é: " + FunçãoFib(n));
    }
    static int FunçãoFib(int num){
        int a = 0, b = 1, prot = 0;
        for (int i = 1; i <= num; i++){
            if (i == 1){
                prot = 0;
            }
            else if ( i == 2){
                prot = 1;
            }
            else{
                prot = a+b;
                a = b;
                b = prot;
            }
        }
        return prot;
    }
}
