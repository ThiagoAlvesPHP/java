package POO.pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
//        MSNMessenger msn = new MSNMessenger();
//        msn.enviarMensagem();
//        msn.receberMensagem();
//
//        //abrindo Facebook Messenger
//        FacebookMessenger fb = new FacebookMessenger();
//        fb.enviarMensagem();
//        fb.receberMensagem();
//
//        //abrindo Telegram
//        Telegram tg = new Telegram();
//        tg.enviarMensagem();
//        tg.receberMensagem();

        ServicoMensagemInstantanea smi = null;
        /*
          NÃO SE SABE QUAL APP
          MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
