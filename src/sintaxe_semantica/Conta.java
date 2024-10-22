package sintaxe_semantica;

public class Conta {
    double saldo = 10;

    // Método para sacar um valor
    public void sacar(Double valor) {
        saldo = saldo - valor;  // Atualizando o saldo
    }

    // Método para imprimir o saldo
    public void imprimirSaldo() {
        System.out.println(saldo);
    }
}
