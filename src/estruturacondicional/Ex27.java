package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex27 {
    public static void main(String args[]){
        double V, D, T, Vm;
        V = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de voltas da corrida"));
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite a extenção da pista de corrida (em metros)"));
        T = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da corrida (em minutos)"));
        
        D = ((D/1000)*V);
        T = T/60;
        Vm = D/T;
        JOptionPane.showMessageDialog(null, Vm + " km/h");
    }
}
