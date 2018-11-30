import org.junit.jupiter.api.Test;
import ru.itpark.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1_000, 1);
            assertEquals(50, bonus);
        }

        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1_000, 16_000);
            assertEquals(70, bonus);
        }

        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1_000, 160_000);
            assertEquals(100, bonus);
        }
    }
}