import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now(); //data de agora
        LocalDateTime d02 = LocalDateTime.now(); //data-hora de agora
        Instant d03 = Instant.now();//data-hora de agora horario de londres
        LocalDate d04 = LocalDate.parse("2024-11-27");//iso para data-hora
        LocalDateTime d05 = LocalDateTime.parse("2024-11-27T01:30:26");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d06 = LocalDate.parse("27/11/2024", fmt1);//texto formato customizado para data-hora
        LocalDateTime d07 = LocalDateTime.parse("27/11/2024 01:30", fmt2);

        LocalDate d08 = LocalDate.of(2024, 11, 27);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);

    }
}