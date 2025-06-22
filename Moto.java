package br.com.veiculos;
public class Moto extends Veiculos {
    int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularCustoManutencao() {
        return 300.0; // Custo fixo para manutenção de moto
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
