package estruturasequencial;

import javax.swing.JOptionPane;
public class Ex12 {
    public static void main(String args[]){
        int yi, ya, id;
        yi = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        ya = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        id = ya - yi;

        JOptionPane.showMessageDialog(null, "Sua idade é: " + id);
        id = id + 17;
        JOptionPane.showMessageDialog(null, "Sua idade daqui 17 anos é: " + id);
    }
}
