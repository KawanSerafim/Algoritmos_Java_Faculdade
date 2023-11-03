package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex43 {
    public static void main(String args[]){
        double A, M;
        int i = 0;
        A = 1.10;
        M = 1.50;

        while (i != -1 ){
            if (A < M){
                A = A + 0.03;
                M = M + 0.02;
                i = i + 1;
            }
            else{
                JOptionPane.showMessageDialog(null, "Em " + i + " anos, Ana ficou maior que Maria.");
                i = -1;
            }
        }
    }
}
