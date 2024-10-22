package variaveis.Objetos;

public class Objetos {
    /**
     * Executa o programa
     *
     * @param args parâmetros passados pela linha de comando
     */
    public static void main(String[] args) {
        Alunos alunos = new Alunos();

        alunos.setNome("Thiago Alves");
        alunos.setIdade(0);

        System.out.println(alunos.getNome());
        System.out.println(alunos.getIdade());
    }
}
