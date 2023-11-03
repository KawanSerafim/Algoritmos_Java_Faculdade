package função;

import javax.swing.JOptionPane;
public class QFunction_Ex36 {
    public static void main(String args[]){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        JOptionPane.showMessageDialog(null, "A série deu: " + FunçãoSerie(n));
    }
    static double FunçãoSerie(int num){
        double serie = 1;
        for (int i = 1; i <= num; i++){
            if (i == 1){
                serie = 1;
            }
            else{
                serie = serie + (1/FunçãoFat(i-1));
            }
        }
        return serie;
    }
    static double FunçãoFat(int index){
        int fat = 1;
        for (int j = 1; j <= index; j++){
            fat = fat * j;
        }
        return fat;
    }
}
