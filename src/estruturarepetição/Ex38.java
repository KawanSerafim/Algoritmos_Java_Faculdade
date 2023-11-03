package estruturarepetição;

import javax.swing.JOptionPane;
public class Ex38 {
    public static void main(String args[]){
        int num, maior, menor;
        maior = 0;
        menor = 1000000000;

        for (int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (num >= 0){
                if (i == 1){
                    maior = num;
                    menor = num;
                }
                else{
                    if (num > maior){
                        maior = num;
                    }
                    else if (num < menor){
                        menor = num;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
    }
}