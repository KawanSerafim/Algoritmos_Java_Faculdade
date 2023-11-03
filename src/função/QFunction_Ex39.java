package função;

import javax.swing.JOptionPane;
public class QFunction_Ex39 {
    static long som = 0;
    public static void main(String args[]){
        int casas;
        casas = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da casa de xadrez."));
        JOptionPane.showMessageDialog(null, "A quantia de grãos na " + casas + "ª casa é = " + FunçãoXadrez(casas));
        JOptionPane.showMessageDialog(null, "O total de grãos até a " + casas + "ª casa é = " + som);
    }
    static long FunçãoXadrez(int c){
        long graos = 1;
        for (int i = 1; i <= c; i++){
            if (i > 1){
                graos = graos*2;
                som = som + graos;
            }
        }
        return graos;
    }
}
