package função;

import javax.swing.JOptionPane;
public class QFunction_Ex41 {
    public static void main(String args[]){
        int lados;
        lados = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos lados tem os dois dados."));
        JOptionPane.showMessageDialog(null, "o Nº de possibilidades foi: " + FunçãoDado(lados));
    }
    static int FunçãoDado(int L){
        int cont = 0;
        for(int i = 1; i <= L; i++){
            for(int j = 1; j <= L; j++){
                if (i+j == 7){
                    cont = cont + 1;
                    JOptionPane.showMessageDialog(null, "('Lado " + i + "' do primeiro dado) + ('Lado " + j + "' do segundo dado) = " + (i+j));
                }
            }
        }
        return cont;
    }
}