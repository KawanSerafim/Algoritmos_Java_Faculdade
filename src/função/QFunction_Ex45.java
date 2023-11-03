package função;

import javax.swing.JOptionPane;
public class QFunction_Ex45 {
    public static void main(String args[]){
        double serie = 1;
        JOptionPane.showMessageDialog(null, "A série deu: " + FunçãoSerie(serie));
    }
    static double FunçãoSerie(double s){
        for (double i = 1; i <= 15; i++){
            if (i > 1){
                if ((i % 2) == 0){
                    s = s - (i/(i*i));
                }
                else{
                    s = s + (i/(i*i));
                }
            }
        }
        return s;
    }
}
