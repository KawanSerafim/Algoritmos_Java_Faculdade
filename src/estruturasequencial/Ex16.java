package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex16 {
    public static void main(String args[]){
        int ht, nd;
        double vh, pd, s;

        ht = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o porcentual de desconto"));
        nd = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de dependentes"));

        s = ht * vh;
        pd = pd/100;
        s = s - (s*pd);
        s = s + (nd*100);

        JOptionPane.showMessageDialog(null, "O salário líquido é: " + s);
    }
}
