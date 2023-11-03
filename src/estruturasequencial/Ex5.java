package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex5 {
    public static void main(String args[]){
        int a, b, c, dt;
        double r1, r2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite C"));
        dt = ((b*b)+(-4*a*c));
        r1 = (((-b)+(Math.sqrt(dt)))/(2*a));
        r2 = (((-b)-(Math.sqrt(dt)))/(2*a));
        
        JOptionPane.showMessageDialog(null, "A 1º raiz é: " + r1 + " e a 2º raiz é: " + r2);
    }
}
