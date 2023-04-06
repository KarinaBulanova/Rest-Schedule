import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.RestSchedule.RestScheduleService;

public class RestScheduleServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testLeaveCalculationAtLowerCost(int expected,int income,int expense,int threshold) {
        RestScheduleService service = new RestScheduleService();
     //   int expected = 3;
     //   int income = 10_000;
     //   int expense = 3000;
     //   int threshold = 20_000;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

    //  @Test
    //public void testCalculationOfVacationsAtHighCosts() {
    //  RestScheduleService service = new RestScheduleService();
    //int expected = 2;
    //int income = 100_000;
    //int expense = 60_000;
    //int threshold = 150_000;
    //int actual = service.calculate(income, expense, threshold);

    //Assertions.assertEquals(expected, actual);
}

