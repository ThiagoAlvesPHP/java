package POO.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = Integer.parseInt("129");
        // o equals compara objetos
        System.out.println(i1.equals(i2));

        String string = "Thiago";
        String string2 = new String("Thiago");
        System.out.println(string.equals(string2));
    }
}
