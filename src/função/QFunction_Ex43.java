package função;

import javax.swing.JOptionPane;
public class QFunction_Ex43 {
    public static void main(String args[]){
        double A = 1.10, M = 1.50;
        FunçãoTam(A, M);
        JOptionPane.showMessageDialog(null, "Em " + FunçãoTam(A, M) + " anos, Ana ficou maior que Maria.");
    }
    static int FunçãoTam(double Ana, Double Maria){
        int i = 0;
        int j = 0;
        while (j != -1 ){
            if (Ana < Maria){
                Ana = Ana + 0.03;
                Maria = Maria + 0.02;
                i = i + 1;
            }
            else{
                j = -1;
            }
        }
        return i;
    }
}
