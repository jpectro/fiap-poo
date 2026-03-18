package br.com.fiapride.model;

public class Veiculo {

    // Encapsulamento
    private String motorista;
    private String placa;
    private double nivelCombustivel;

    // Construtor vazio
    public Veiculo() {
    }

    // Getters e Setters
    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    // "setNivelCombustivel" público para evitar que o valor seja alterado . O controle é feito pelos métodos abaixo:

    public void adicionarCombustivel(double valor) {
        if (valor > 0) {
            this.nivelCombustivel += valor;
        } else {
            System.out.println("Erro: O valor de abastecimento deve ser positivo.");
        }
    }

    public void gastarCombustivel(double valor) {
        if (valor > 0 && valor <= this.nivelCombustivel) {
            this.nivelCombustivel -= valor;
        } else {
            System.out.println("Erro: Combustível insuficiente ou valor inválido.");
        }
    }
}