package Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.of(2023,1,24, 16,31, 27);

        esperaData(dataHora.toLocalDate());
        esperaTime(dataHora.toLocalTime());


    }

    static void esperaData(LocalDate dataHora)
    {
        System.out.println(dataHora);
    }

    static void esperaTime(LocalTime dataHora)
    {
        System.out.println(dataHora);
    }

}
