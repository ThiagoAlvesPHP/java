package POO;

public class SistemaEnum {
    public static void main(String[] args) {

//        EstadosBrasileiros estado = EstadosBrasileiros.SAO_PAULO;
        String nomeString = "SAO_PAULO";
        EstadosBrasileiros estado = EstadosBrasileiros.valueOf(nomeString);
        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
        System.out.println(estado.getNomeMaiusculo());

        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println(e.getNome() + " - " + e.getSigla());
        }
    }
}
