package br.com.veiculos;
public class GerenciamentoVeiculos{
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Yamaha", "YZF-R3", 2021, 321);

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + carro.calcularCustoManutencao());

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + moto.calcularCustoManutencao());
    }
}
