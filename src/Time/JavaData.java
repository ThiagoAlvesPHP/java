package Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaData {
    public static void main(String[] args) {
//        LocalDate dataAtual = LocalDate.now();
//        System.out.println("Data Atual: " + dataAtual);
//
//        dataAtual = dataAtual.minusDays(1);
//        System.out.println("Data atual - 1 dia: " + dataAtual);
//
//        System.out.println("Meu Aniversário: "+LocalDate.of(2024, 10, 21));
//
//        String stringData = "2024-10-21";
//        LocalDate dataConcreta = LocalDate.parse(stringData);
//        System.out.println("Convertendo string em data: "+dataConcreta);
//

//        formatarDataStringBrasilAnsi();
//        funcoesData();
//        compararData();
//        aniversario50();
//        formatarDataBrasil();
//        formatacoesStyle();
        formatacaoPaises();
    }

    public static void formatarDataStringBrasilAnsi()
    {
        String stringDataBr = "17/01/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcretaAnsi = LocalDate.parse(stringDataBr,formatter);

        System.out.println("Formatando data padrão Brasil para o padrão ANSI: "+dataConcretaAnsi);
    }

    public static void funcoesData()
    {
        LocalDate data = LocalDate.of(2021,8,23);

        System.out.println(data.getDayOfMonth());   // retorna o dia do mês -> 23
        System.out.println(data.getYear());         // retorna o ano -> 2023
        System.out.println(data.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(data.getMonthValue());   // retorna o número do mês entre 1-12 -> 8
    }

    public static void compararData() {
        LocalDate data1 = LocalDate.of(2023,3,4);
        LocalDate data2 = LocalDate.of(2024,4,3);
        //data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));
        //data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));
        //data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1));
    }

    public static void aniversario50()
    {
        LocalDate aniversario = LocalDate.of(1985, 10, 21);
        LocalDate data50Anos = aniversario.plusYears(50);
        System.out.println(data50Anos);
    }

    public static void formatarDataBrasil()
    {
        LocalDate data = LocalDate.of(2023, 8, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        System.out.println(dataFormatada);
    }

    public static void formatacoesStyle()
    {
        LocalDate data = LocalDate.of(2023,1,13);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 13 de janeiro de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 13 de janeiro de 2023
        System.out.println(dataFormatada);
    }

    public static void formatacaoPaises()
    {
        LocalDate data = LocalDate.of(2021,8,23);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi","FI"),Locale.UK};

        for(Locale locale:locales){
            String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada);
        }

        // 2021-08-23
        // 8/23/21
        // 23.8.2021
        // 23/08/2021
    }
}
