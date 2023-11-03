package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex20 {
    public static void main(String args[]){
        int a, b, c, dt;
        double r1, r2;
        
        // Coleta dos coeficientes:
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite C"));
        
        // Cálculo do delta e coleta das raízes:
        
        dt = ((b*b)+(-4*a*c));
        if (dt > 0){
            r1 = (((-b)+(Math.sqrt(dt)))/(2*a));
            r2 = (((-b)-(Math.sqrt(dt)))/(2*a));
            JOptionPane.showMessageDialog(null, "x1 é: " + r1);
            JOptionPane.showMessageDialog(null, "x2 é: " + r2);
        }
        else if (dt == 0){
            r1 = (((-b)+(Math.sqrt(dt)))/(2*a));
            r2 = r1;
            JOptionPane.showMessageDialog(null, "x1 é: " + r1);
            JOptionPane.showMessageDialog(null, "x2 é: " + r2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não há raízes reais");
        }
    }
}
