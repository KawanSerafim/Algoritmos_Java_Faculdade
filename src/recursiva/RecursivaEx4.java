package recursiva;

import javax.swing.JOptionPane;
public class RecursivaEx4 {
    public static void main(String args[]){
        
        int N = Integer.parseInt(JOptionPane.showInputDialog(""));
        
        JOptionPane.showMessageDialog(null, serie4(N, 1));
        
    }
    
    public static double serie4(double n, double divid)
    {
        if(n == 1)
        {
            return n/divid;
        }
        
        
        return n / divid + serie4(n-1,divid+1);
    }
}
