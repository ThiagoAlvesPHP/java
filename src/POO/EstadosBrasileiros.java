package POO;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA","Maranhão") ;

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    /**
     * Returns the abbreviation (sigla) of the Brazilian state.
     *
     * @return the sigla of the state
     */
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
