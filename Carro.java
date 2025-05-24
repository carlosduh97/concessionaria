public class Carro {
    private static int totalCarros = 0;
    private int passageiros;
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.passageiros = 0;
        totalCarros++;
    }

    public void adicionarPassageiro() {
        passageiros++;
    }

    public void removerPassageiro() {
        if (passageiros > 0) {
            passageiros--;
        }
    }

    public int getPassageiros() {
        return passageiros;
    }

    public String getModelo() {
        return modelo;
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
} 