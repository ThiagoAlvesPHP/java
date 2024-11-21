package Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    public static void main(String[] args) {
//        manipulacaoTime();
//        comparacao();
        formatacao();
    }

    public static void manipulacaoTime()
    {
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);
    }

    public static void comparacao()
    {
        LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        boolean passado = horaAtual.isBefore(horaAtualMenos2Horas);

        System.out.println(passado);
    }

    public static void formatacao()
    {
        LocalTime hora = LocalTime.of(13,21,42);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada = hora.format(formatter);
        System.out.println(horaFormatada); // 42-21-13
    }

}
