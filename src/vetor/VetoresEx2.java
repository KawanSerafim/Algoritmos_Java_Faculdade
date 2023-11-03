package vetor;
import java.util.Scanner;
public class VetoresEx2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[100], sit = 0, maior = 0, menor = 0, c = 0;
        double media = 0;
                
        System.out.println("==================== Sistema Começou! ====================");
        
        for (int i = 0; i < 10; i++){
            System.out.print("\nDigite um valor inteiro: ");
            
            if (scanner.hasNextInt()) {
                num[i] = scanner.nextInt();
                media = num[i] + media;
                c++;
                
                if(i == 0){
                    maior = num[i];
                    menor = num[i];
                }
                else if(maior < num[i]){
                    maior = num[i];
                }
                else if(menor > num[i]){
                    menor = num[i];
                }
            }
            else{
                System.out.println("\nIsso não é um número inteiro válido. Tente novamente.");
                scanner.next();
                i--;
            }
        }
        System.out.println("\nO maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
        System.out.println("A média dos números é: " + (media/c));
        
        System.out.println("==================== Sistema Acabou! ====================");
    }
}