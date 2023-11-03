package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex45 {
    public static void main(String args[]){
    double serie = 1;
        
        for (double i = 1; i <= 15; i++){
            if (i > 1){
                if ((i % 2) == 0){
                    serie = serie - (i/(i*i));
                }
                else{
                    serie = serie + (i/(i*i));
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A série deu: " + serie);
    }
}