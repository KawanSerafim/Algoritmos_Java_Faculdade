package função;

import javax.swing.JOptionPane;
public class QFunction_Ex40 {
    static int tipo;
    public static void main(String args[]){
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número."));
        
        if(a > b){
            tipo = 1;
            for(int i = b; i <= a; i++){
                if((FunçãoOrg(i))==1){
                    JOptionPane.showMessageDialog(null, i);
                }
            }
        }
        else if(b > a){
            tipo = 2;
            for(int i = a; i <= b; i++){
                if((FunçãoOrg(i))==1){
                    JOptionPane.showMessageDialog(null, i);
                }
            }
        }
    }
    static int FunçãoOrg (int i){
        int sit = 0;
        if (tipo == 1){
            if(i == 2){
                JOptionPane.showMessageDialog(null, i);
            }
            else{
                if((i%2)==0){
                    sit = 0;
                }
                else{
                    for(int j = 2; j <= i; j++){
                        if(i!=j){
                            if((i%j)==0){
                                sit = 0;
                                break;
                            }
                        }
                        else{
                            sit = 1;
                        }
                    }
                }
            }
            return sit;
        }
        else{
            if(i == 2){
                JOptionPane.showMessageDialog(null, i);
            }
            else{
                if((i%2)==0){
                    sit = 0;
                }
                else{
                    for(int j = 2; j <= i; j++){
                        if(i!=j){
                            if((i%j)==0){
                                sit = 0;
                                break;
                            }
                        }
                        else{
                            sit = 1;
                        }
                    }
                }
            }
            return sit;
        }
    }
}
