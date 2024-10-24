package POO.br.com.sofhouse;
import java.math.BigDecimal;

public class MInhaClass {
    public static void main(String[] args) {
        User user = new User();
        user.showName();

        POO.br.com.sofhouse.model.User user1 = new POO.br.com.sofhouse.model.User();
        user1.showName();

        POO.br.com.sofhouse.m2.User user2 = new POO.br.com.sofhouse.m2.User();
        user2.showName();
    }
}
