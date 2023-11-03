package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex37 {
    public static void main(String args[]){
        int n, a, b, prot;
        a = 0;
        b = 1;
        prot = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 1; i <= n; i++){
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
        JOptionPane.showMessageDialog(null, "O valor do " + n + "º lugar é: " + prot);
    }
}
