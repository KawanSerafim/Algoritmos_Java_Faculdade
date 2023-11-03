package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex13 {
    public static void main(String args[]){
        int al;
        double t;
        al = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do alimento"));
        t = ((al*1000)/50);

        JOptionPane.showMessageDialog(null, "A quantidade de dias que durará é: " + t);
    }
}
