package Time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        manipulacao();
        comparacao();
        formatacao();
    }

    public static void manipulacao()
    {
        LocalDateTime dataHora = LocalDateTime.of(2023,6,25, 16,25);
        System.out.println(dataHora);
        LocalDateTime proximoMes = dataHora.plusMonths(1);
        System.out.println(proximoMes);
        LocalDateTime dataHoraComMenos15Minutos = dataHora.minusMinutes(15);
        System.out.println(dataHoraComMenos15Minutos);
        LocalDateTime dataHoraDefinindoSegundoZero = dataHora.withSecond(33);
        System.out.println(dataHoraDefinindoSegundoZero);
    }

    public static void comparacao()
    {
        LocalDateTime dataHora1 = LocalDateTime.of(2023,6,25, 16,25);
        LocalDateTime dataHora2 = LocalDateTime.of(2023,6,25, 16,25,17);

        // comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora1.equals(dataHora2); //false

        // comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth()==dataHora2.getDayOfMonth(); //true

        System.out.println(dataHoraIgual);
        System.out.println(dataHoraDigitoIgual);
    }

    public static void formatacao()
    {
        LocalDateTime dataHora = LocalDateTime.of(2023,7,22,17,33);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00
    }
}
