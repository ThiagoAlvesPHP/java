package POO.pilares_poo;

public class MSNMessenger {
    private static final String PC_OFFLINE = "Computador Offline";

    public void enviarMensagem() {
        //primeiro confirmar se esta conectado a internet
        if (validarConectadoInternet()) {
            System.out.println("Enviando mensagem");
            //depois de enviada, salva o histórico da mensagem
            salvarHistoricoMensagem();
        }
        else
            System.out.println(PC_OFFLINE);
    }

    public void receberMensagem() {
        if (validarConectadoInternet()) {
            System.out.println("Recebendo mensagem");
        }
        else
            System.out.println(PC_OFFLINE);
    }

    //métodos privadas, visíveis somente na classe
    private boolean validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
        return true;
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
