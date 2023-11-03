package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex41 {
    public static void main(String args[]){
        int som, cont;
        cont = 0;
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                if ((i+j) == 7){
                    som = i+j;
                    JOptionPane.showMessageDialog(null, "A soma ('Lado " + i + "' do dado A) + ('Lado " + j + "' do dado B) = " + som);
                    cont = cont + 1;
                }
            }
        }
    }
}
