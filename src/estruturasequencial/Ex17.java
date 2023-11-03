package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex17 {
    public static void main(String args[]){
        int vm, tp;
        double l;

        vm = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média"));
        tp = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo do percurso"));
        l = vm * tp;
        l = l / 12;

        JOptionPane.showMessageDialog(null, "O tanto de litros gastos é: " + l);
    }
}
