package estruturasequencial;
import javax.swing.JOptionPane;
public class Ex3 {
    public static void main(String args[])
    {
        int b, h;
        double s;
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo"));
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        s = ((b*h)/2);
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + s);
    }        
}
