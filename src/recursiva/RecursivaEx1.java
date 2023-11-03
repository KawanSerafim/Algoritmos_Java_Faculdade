package recursiva;

import javax.swing.JOptionPane;
public class RecursivaEx1 {
    public static void main(String args[]){
        int n = 1;
        JOptionPane.showMessageDialog(null, RecursivaSom(n));
    }
    static int RecursivaSom(int num){
        if (num <= 100){
            return num+RecursivaSom(num+1);
        }
        return 0;
    }
}
