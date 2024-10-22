package ControleFluxo;

import java.util.Arrays;
import java.util.Random;

public class LacosRepeticoes {
    public static void main(String[] args) {
//        getFor();
//        getForSeparada();
//        getForArray();
//        getBreakContinue();
//        getWhile();
//        cart();
        getDisk();
    }

    static void getFor()
    {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++)
            System.out.println(carneirinhos + " - Carneirinhos");
    }

    static void getForSeparada()
    {
        int carneirinhos = 0;

        for (; carneirinhos <= 20; carneirinhos += 2)
            System.out.println(carneirinhos + " - Carneirinhos");
    }

    static void getForArray()
    {
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
//        for (int i = 0; i < cores.length; i++)
//            System.out.println("A cor no indice " + i + " é: " + cores[i]);

//        for (String cor : cores)
//            System.out.println(cor);

        for (String cor : cores) {
            System.out.println("Índice: " + Arrays.asList(cores).indexOf(cor) + ", Cor: " + cor);
        }
    }

    static void getBreakContinue()
    {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5)
//                break;
//            System.out.println("i = " + i);
//        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("i = " + i);
        }
    }

    static void getWhile()
    {
        boolean acordado = false;
        int valide = new Random().nextInt(10);
        int carneirinhos = 0;
        System.out.println("Valide: " + valide);

        while (!acordado) {
            System.out.println("Contando carneirinhos... "+(++carneirinhos));
            acordado = (valide == carneirinhos);
        }

        System.out.println("Dormiu...");

//        for (int i = 0; i <= 20; i++) {
//            System.out.println(i + " - Carneirinhos");
//
//            if (dormiu = valide == i) {
//                System.out.println("Dormiu...");
//                break;
//            }
//        }
    }

    static void cart()
    {
        double mesada = 50;

        System.out.println("Mesada Inicial: "+ mesada);

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: "+ valorDoce + "Adcionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: "+ mesada);
        System.out.println("Ana gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio()
    {
        return new Random().nextDouble(15, 20);
    }

    private static int numeroTentativas = 0;

    static void getDisk()
    {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        if (numeroTentativas < 5)
            System.out.println("Alô !!!");
        else
            System.out.println("Não atendeu.");
    }

    private static boolean tocando()
    {
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;
        if (numeroTentativas >=5)
            return false;
        else
            return !atendeu;
    }


}
