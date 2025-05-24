import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema de Concessionária ===\n");
        
        // Pergunta quantos carros serão criados
        System.out.print("Digite quantos carros você quer: ");
        int quantidadeCarros = scanner.nextInt();
        
        // Array para armazenar os carros
        Carro[] carros = new Carro[quantidadeCarros];
        
        // Criando os carros e adicionando passageiros
        for (int i = 0; i < quantidadeCarros; i++) {
            carros[i] = new Carro("Carro " + (i+1));
            
            System.out.print("Quantas pessoas tem no carro " + (i+1) + "? ");
            int numPassageiros = scanner.nextInt();
            
            // Adiciona os passageiros ao carro
            for (int j = 0; j < numPassageiros; j++) {
                carros[i].adicionarPassageiro();
            }
        }
        
        // Exibindo as informações
        System.out.println("\n=== ResultadoS ===");
        System.out.println("Total de carros: " + Carro.getTotalCarros());
        
        System.out.println("\nPassageiros em cada carro:");
        int totalPassageiros = 0;
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro " + (i+1) + ": " + carros[i].getPassageiros() + " pessoas");
            totalPassageiros += carros[i].getPassageiros();
        }
        
        System.out.println("\nTotal de pessoas em todos os carros: " + totalPassageiros);
        
        scanner.close();
    }
} 