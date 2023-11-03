package função;

import javax.swing.JOptionPane;
public class QFunction_Ex42 {
    public static void main(String args[]){
        double s = 0;
        FunçãoSerie(s);
        JOptionPane.showMessageDialog(null, "A série deu: " + FunçãoSerie(s));
    }
    static double FunçãoSerie(double serie){
        int j = 2;
        for (int i = 2; i <= 99; i++){
            if (i == 2){
                serie = 1;
            }
            else {
                if ((i%2) != 0){
                    serie = serie + (j/(double)i);
                    j = j+1;
                }
            }
        }
        return serie;
    }
}
