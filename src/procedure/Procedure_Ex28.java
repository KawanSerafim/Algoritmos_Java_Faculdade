package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex28 {
    static int pr;
    static double Vm, Pnovo;
    public static void main(String args[]){
        pr = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço atual."));
        Vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal."));
        CalcPreco();
    }
    static void CalcPreco(){
        if ((Vm < 500)&(pr < 30)){
            Pnovo = (pr + (pr*0.10));
            JOptionPane.showMessageDialog(null, "O preço novo é: R$" + Pnovo);
        }
        else if ((Vm >= 500 & Vm < 1000)&(pr >=30 & pr < 80)){
            Pnovo = (pr + (pr*0.15));
            JOptionPane.showMessageDialog(null, "O preço novo é: R$" + Pnovo);
        }
        else if ((Vm >= 1000)&(pr >= 80)){
            Pnovo = (pr - (pr*0.05));
            JOptionPane.showMessageDialog(null, "O preço novo é: R$" + Pnovo);
        }
        else{
            JOptionPane.showMessageDialog(null, "O preço mantém em: R$" + pr);
        }
    }
}
