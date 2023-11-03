package estruturacondicional;

import javax.swing.JOptionPane;
public class Ex25 {
    public static void main(String args[]){
        int hi, mi, hf, mf, hj, mj;
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
        
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
        JOptionPane.showMessageDialog(null, "O tempo de jogo foi de: " + hj + "h e " + mj + "m");
    }
}
