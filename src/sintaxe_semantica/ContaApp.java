package sintaxe_semantica;

public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta();  // Criando a conta

        conta.sacar(1.2);           // Sacando 2 reais
        conta.imprimirSaldo();      // Imprimindo o saldo atualizado
    }
}