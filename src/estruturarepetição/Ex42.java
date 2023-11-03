package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex42 {
    public static void main(String args[]){
        double serie;
        serie = 0;
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
        JOptionPane.showMessageDialog(null, "A série deu: " + serie);
    }
}
