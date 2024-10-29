package POO.ClassesEssenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        //imprimiendo na tela
//        System.out.println("Thiago");
        //exibição de erro
//        System.err.println("Error");

        // entrada de dados
//        Scanner scan = new Scanner(System.in);
//        System.out.println ("Digite seu nome: ");
//        String nome = scan.next();
//
//        System.out.println ("Digite sua idade: ");
//        Integer idade = scan.nextInt();
//
//        System.out.println ("Seu nome é : " + nome);
//        System.out.println ("Sua idade é : " + idade);

//        delimiter();
//        printStream();
//        StringBuilder();
//        Strings();
//        bigDecimal();

    }

    static void delimiter()
    {
        String nome = null;
        Integer idade = null;
        Double peso=null;

        // simulando uma linha existente em um arquivo txt
        String stringLinhaArquivo = "gleyson sampaio;32;1.59";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";"); // definindo um delimitador

        // conhecendo novos recursos
        int index = 0;
        while (scan.hasNext()){ // olha um conceito de controle de repetição sendo aplicado, tudo está mais claro agora hein??
            if(index == 0) // Uuufa, sorte que eu aprendi sobre controle de fluxo e operadores anteriormente
                nome = scan.next();
            else if( index == 1)
                idade  = Integer.valueOf(scan.next());
            else
                peso = Double.valueOf(scan.next());

            index ++; // mais um conceito escondido bem aqui !!
        }

        System.out.println ("Seu nome é : " + nome);
        System.out.println ("Sua idade é : " + idade);
        System.out.println ("Sua peso é : " + peso);
    }

    static void printStream()
    {
        String nome = "gleyson";
        int idade = 32;
        double peso = 1.58;
        double renda = 3234.56;

        // vamos imprimir os dados acima aplicando uma formatação no console

        // System.out.printf(formato, array de parâmetros (,,,) );

        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", nome, idade, peso, renda);

        // Resultado no console: Nome: gleyson Idade: 32 Peso: 1,58 Renda: R$ 3.234,56

        //%s ->     parâmetros do tipo String
        //%d ->     parâmetros do tipo Integer / Long
        //%f ->     parâmetros do tipo Double / Float
        //.2 ->     quer dizer que serão dois dígitos decimais
        //,.2 ->    quer dizer que serão dois dígitos decimais e informando o (.) de milhar
    }

    static void StringBuilder()
    {
        String nome = "gleyson";
        int idade = 32;
        double peso = 1.58;
        double renda = 3234.56;

        // concatenações com string builder
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ")
                .append(nome)
                .append(" Idade: ")
                .append(idade)
                .append(" Peso: ")
                .append(peso)
                .append(" Renda: R$ ")
                .append(renda);
        System.out.println(sb.toString());
    }

    static void Strings()
    {
        String nome = "Thiago Alves";
//        name.toLowerCase();
        String nomeMinusculo = nome.toLowerCase();
        String nomeMaisculo = nome.toUpperCase();

        System.out.println(nomeMinusculo);
        System.out.println(nomeMaisculo);
    }

    static void bigDecimal()
    {
//        BigDecimal zero = BigDecimal.ZERO;
//        BigDecimal dez = BigDecimal.valueOf(10);
//        BigDecimal decimal = BigDecimal.valueOf(1234.5678);
//        BigDecimal novoDecimal = new BigDecimal("1234.5678");
//        System.out.println(zero +" - "+ dez + " - "+ decimal + " - "+ novoDecimal);

        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));

        System.out.println(resultado);

        resultado = resultado.subtract(new BigDecimal("60"));
        System.out.println(resultado);

        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultadoDivisao = BigDecimal.TEN.divide(divisor, 3, RoundingMode.HALF_UP);
        System.out.println(resultadoDivisao);

        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litros = BigDecimal.valueOf(21.752);
        BigDecimal valorTotal = litros.multiply(precoLitro);
        System.out.println(valorTotal);

        // arredondadndo
        BigDecimal arredondamento = valorTotal.setScale(2, RoundingMode.HALF_UP);
        System.out.println(arredondamento);
    }
}
