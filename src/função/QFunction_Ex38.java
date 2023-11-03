package função;

import javax.swing.JOptionPane;
public class QFunction_Ex38 {
    static int i;
    static double maior, menor;
    public static void main(String args[]){
        double n = 1;
        for (i = 1; i <= 10; i++){
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número."));
            FunçãoMaior(n);
            FunçãoMenor(n);
        }
        JOptionPane.showMessageDialog(null, "O maior número é: " + FunçãoMaior(n));
        JOptionPane.showMessageDialog(null, "O menor número é: " + FunçãoMenor(n));
    }
    static double FunçãoMaior(double num){
        if (i == 1){
            maior = num;
        }
        else{
            if (num > maior){
                maior = num;
            }
        }
        return maior;
    }
    static double FunçãoMenor(double num){
        if (i == 1){
            menor = num;
        }
        else{
            if (num < menor){
                menor = num;
            }
        }
        return menor;
    }
}
