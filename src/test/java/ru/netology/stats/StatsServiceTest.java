package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/statistics.csv")
    public void minimumSalesMonthNumber(int expectedDay, long[] stat) {
        StatsService service = new StatsService();

        int actualDay = service.minSales(stat);

        assertEquals(expectedDay, actualDay);
    }
}