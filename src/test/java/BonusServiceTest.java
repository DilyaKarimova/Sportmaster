import org.junit.jupiter.api.Test;
import ru.itpark.BonusService;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        {
            BonusService bonusService = new BonusService();
            int b = bonusService.calculateBonus(1000, 1);
            System.out.println(b);
        }

        {
            BonusService bonusService = new BonusService();
            int b = bonusService.calculateBonus(1000, 16000);
            System.out.println(b);
        }

        {
            BonusService bonusService = new BonusService();
            int b = bonusService.calculateBonus(1000, 160000);
            System.out.println(b);
        }
    }
}