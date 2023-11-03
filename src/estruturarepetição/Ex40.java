package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex40 {
    public static void main(String args[]){
        int a, b;
        int sit = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número."));
        
        if (a > b){
            for(int i = b; i <= a; i++){
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
                if((sit == 1)
                ){
                    JOptionPane.showMessageDialog(null, i);
                }
            }
        }
        else if(b > a){
            for(int i = a; i <= b; i++){
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
                if((sit == 1)){
                    JOptionPane.showMessageDialog(null, i);
                }
            }
        }
    }
}