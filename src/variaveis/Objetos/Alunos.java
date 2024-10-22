package variaveis.Objetos;

public class Alunos {
    private String nome;
    private  int idade;

    /**
     * Return the name of this {@link Alunos} object.
     *
     * @return the name
     */
    public String getNome() {
        return nome;
    }
    /**
     * Set the name of this {@link Alunos} object.
     * @param nome the name to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Return the age of this {@link Alunos} object.
     * @return the age, as a positive integer
     */
    public int getIdade() {
        return idade;
    }
    /**
     * Set the age of this {@link Alunos} object.
     *
     * @param idade the age to set
     * @throws IllegalArgumentException if the age is negative
     */
    public void setIdade(int idade) {
        if (idade < 0)
            throw new IllegalArgumentException("Idade inválida");

        this.idade = idade;
    }
}
