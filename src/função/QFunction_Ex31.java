package função;

import javax.swing.JOptionPane;
public class QFunction_Ex31 {
    public static void main(String args[]){
        for (int i = 1; i <= 10; i++){
            JOptionPane.showMessageDialog(null, "O quadrado de " + i + " é: " + FunçãoQuadrado(i));
        }
    }
    static int FunçãoQuadrado(int num){
        int q;
        q = num*num;
        return q;
    }    
}