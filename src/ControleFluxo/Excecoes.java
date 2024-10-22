package ControleFluxo;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        scanner();

//        try {
//            Number valor = NumberFormat.getInstance().parse("1.75");
//            Double d = valor.doubleValue();
//            System.out.println(d);
//        } catch (ParseException e) {
//            System.err.println("Número invalido");
//        }
    }

    static void scanner() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " m");
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}