package POO.pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //abrindo Facebook Messenger
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();

        //abrindo Telegram
        Telegram tg = new Telegram();
        tg.enviarMensagem();
        tg.receberMensagem();
    }
}
