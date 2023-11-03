package procedure;

import javax.swing.JOptionPane;
public class Procedure_Ex25 {
    static int hi, mi, hf, mf, hj, mj;
    public static void main(String args[]){
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
        CalcTempo();
        JOptionPane.showMessageDialog(null, "O tempo de jogo foi de: " + hj + "h e " + mj + "m");
    }
    static void CalcTempo(){
        if (hf < hi){
            hj = ((hf + 24) - hi);
        }
        else{
            hj = hf - hi;
        }
        if (mf < mi){
            mj = ((mf + 60) - mi);
            hj = hj-1;
        }
        else{
            mj = mf - mi;
        }
    }
}
