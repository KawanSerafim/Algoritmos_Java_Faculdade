package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex27 {
    static double V, D, T, Vm;
    public static void main(String args[]){
        V = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de voltas da corrida"));
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite a extenção da pista de corrida (em metros)"));
        T = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da corrida (em minutos)"));
        CalcVM();
        JOptionPane.showMessageDialog(null, Vm + " km/h");
    }
    static void CalcVM(){
        D = ((D/1000)*V);
        T = T/60;
        Vm = D/T;
    }
}
