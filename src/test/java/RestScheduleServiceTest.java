import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.RestSchedule.RestScheduleService;

public class RestScheduleServiceTest {
    @Test
    public void testLeaveCalculationAtLowerCost() {
        RestScheduleService service = new RestScheduleService();
        int expected = 3;
        int income = 10_000;
        int expense = 3000;
        int threshold = 20_000;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCalculationOfVacationsAtHighCosts() {
        RestScheduleService service = new RestScheduleService();
        int expected = 2;
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
