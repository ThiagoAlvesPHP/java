package variaveis;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");

        for (int x = 1; x < 5; x++) {
            System.out.println(x);

            if (x == 4)
                System.out.println("Elemento 04");
        }
    }
}
