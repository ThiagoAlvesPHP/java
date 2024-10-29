package POO.pilares_poo;

public abstract class SistemaMensagem {
    private static final String PC_OFFLINE = "Computador Offline";

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    //métodos privadas, visíveis somente na classe
//    private boolean validarConectadoInternet() {
//        System.out.println("Validando se esta conectado a internet");
//        return true;
//    }
//
//    private void salvarHistoricoMensagem() {
//        System.out.println("Salvando o histórico da mensagem");
//    }
}
