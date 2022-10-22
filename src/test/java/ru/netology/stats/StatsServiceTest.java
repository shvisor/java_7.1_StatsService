package ru.netology.stats;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

//    @ParameterizedTest
//    @CsvFileSource(resources = "/statistics.csv")
    @Test
    public void totalOfAllSales(/* long expected, long[] sales */) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        long actualSum = service.totalSales(sales);

        assertEquals(expectedSum, actualSum);
}

    @Test
    public void averageOfSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        long actualAverage = service.averageOfSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minimumSalesMonthNumber() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        assertEquals(expectedDay, actualDay);
    }
}