package br.com.fiapride.main;

// Importando a classe
import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        // Instanciando o objeto com o nome correto da classe
        Veiculo v1 = new Veiculo();

        // Setters em vez de acesso direto aos atributos
        v1.setMotorista("Carlos");
        v1.setPlaca("ABC-1234");

        // Não é mais possível fazer v1.gas = -10, O abastecimento e o gasto são feitos por métodos controlados:

        v1.adicionarCombustivel(50.0);
        v1.gastarCombustivel(10.0);

        // Tentativa de inserir valor negativo
        v1.adicionarCombustivel(-10.0);

        // Getters para exibir os dados
        System.out.println("Dono: " + v1.getMotorista());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Gasolina: " + v1.getNivelCombustivel());
    }
}