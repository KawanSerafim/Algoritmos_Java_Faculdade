package vetor;

import java.util.Scanner;
public class VetoresEx1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[50], som = 0, c = 0;
        double media = 0;
        
        System.out.println("==================== Sistema Startou! ====================");
        for (int i = 0; i < 50; i++){
            System.out.print("\nDigite um numero inteiro: ");
            vet[i] = scanner.nextInt();
            
            if ((vet[i] > 10)&(vet[i] < 200)){
                media = media + vet[i];
                c++;
            }
            if ((vet[i]%2)!=0){
                som = som + vet[i];
            }
        }
        System.out.println("A media dos valores entre 10 e 200 deu: " + (media/c));
        System.out.println("A soma dos numeros impares deu: " + som);
    }
}