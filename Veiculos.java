package br.com.veiculos;
public class Veiculos {
    String marca;
    String modelo;
    int ano;

    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public double calcularCustoManutencao() {
        // Método base (pode ser abstrato ou ter uma implementação padrão)
        return 0.0;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
