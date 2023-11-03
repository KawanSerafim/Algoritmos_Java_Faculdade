package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex15 {
    public static void main(String args[]){
        int co, ca;
        double hip;
        co = Integer.parseInt(JOptionPane.showInputDialog("Digite cateto oposto"));
        ca = Integer.parseInt(JOptionPane.showInputDialog("Digite cateto adjacente"));
        hip = (Math.sqrt((co*co)+(ca*ca)));

        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + hip);
    }
}
