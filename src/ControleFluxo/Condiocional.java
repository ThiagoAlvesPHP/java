package ControleFluxo;

public class Condiocional {
    public static void main(String[] args) {
//        condicional();
//        encandeadas();
//        ternarias();
        ternariaEncadeada();
    }

    static void condicional()
    {
        double saldo = 25.0;
        double valorSolicitado = 24.53;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else
            System.out.println("Saldo insuficiente para saque.");


        System.out.println("Saldo atual: " + saldo);
    }

    /*
    * Condicionais encandeadas
    * */
    static void encandeadas()
    {
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }

    static void ternarias()
    {
        int nota = 6;
        String conceito = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(conceito);
    }

    static void ternariaEncadeada()
    {
        int nota = 4;
        String conceito = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperação" : "Reprovado";
        System.out.println(conceito);
    }
}
