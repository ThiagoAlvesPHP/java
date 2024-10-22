package variaveis;

import java.util.Date;

public class Operadores {
    public static void main(String[] args)
    {
//        stribuicoes();
//        aritimeticos();
//        concatenacao();
//        relacionais();
//        unarios();
//        ternariosLogicos();
    }

    public static void stribuicoes()
    {
        // operador de atribuição que é (=)
        String nome = "Thiago";
        int idade = 39;
        double peso = 90.20;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        // concatenação
        String nomeCompleto = nome + " Alves";
        System.out.println(nomeCompleto);
    }

    public static void aritimeticos()
    {
        // operador aritméticos
        int numero = 1 + 1 * 2;
        double soma = 10.5 + 15.7;
        int modulo = 20 / 3;

        int n1 = 10;
        int n2 = 5;
//        n2 = n2 + n1;
        n2 += n1;

        System.out.println(n2);
    }

    public static void concatenacao()
    {
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }

    public static void relacionais()
    {
        int num1 = 2;
        int num2 = 2;

        if (num1 > num2)
            System.out.println("Número 1 é maior que número 2");

        if (num1 < num2)
            System.out.println("Número 1 é menor que número 2");

        if (num1 >= num2)
            System.out.println("Número 1 é maior ou igual que número 2");

        if (num1 <= num2)
            System.out.println("Número 1 é menor ou igual que número 2");

        if (num1 == num2)
            System.out.println("Número 1 é igual que número 2");

        if (num1 != num2)
            System.out.println("Número 1 é diferente que número 2");

        int idadeIza = 10;
        boolean maiorIdade = idadeIza >= 18;
        System.out.println("Iza é maior de idade? "+(maiorIdade ? "Sim" : "Não"));
    }
    /*
    * decrement e increment
    */
    public static void unarios()
    {
        int numero = +5;
        // reatribuição
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        int value = 0;
        System.out.println("Value inicio: "+value);
        for (int i = 1; i <= 10; i++)
            value++;

        System.out.println("Value final: "+value);

        boolean status = true;
        if (status)
            System.out.println("status verdadeiro");

        status = !status;
        if (!status)
            System.out.println("status false");
    }

    public static void ternariosLogicos()
    {
        String nome = "Iza";
        int idade = 1;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " é de maior" : " não é de maior");
        System.out.println(mensagem);

        // Logico
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.println("As duas precisam ser verdadeiras");

        if (condicao1 || condicao2)
            System.out.println("Umas das duas precisam ser veridadeiras");
    }
}
