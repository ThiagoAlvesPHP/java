package variaveis;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo;

    Double consultarSaldo()
    {
        return saldo;
    }

//    List consultarExtrato(LocalDate dataInicial,
//                          LocalDate dataFinal){
//        return [{}];
//    }

    void cancelar(String justificativa) {}

    void transferir (ContaCorrente contaDestino,
                     Double valorTransferido) {}

    void sacar (Double valorSolicitado) {}
}
