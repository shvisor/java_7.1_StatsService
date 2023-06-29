package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    /**
     * Проверяем количество суммарных продаж в методе {@link StatsService#totalSales(long[]) totalSales}
     */
    @Test
    public void shouldTotalSales() {

        int expectedSum = 180;
        long actualSum = service.totalSales(sales);

        assertEquals(expectedSum, actualSum);
}

    /**
     * Проверяем среднюю продажу в методе {@link StatsService#averageOfSales(long[]) averageOfSales}
     */
    @Test
    public void shouldAverageSales() {

        int expectedAverage = 15;
        long actualAverage = service.averageOfSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    /**
     * Проверяем максимальную продажу в методе {@link StatsService#maxSales(long[]) maxSales}
     */
    @Test
    public void shouldMaxSalesMonth() {

        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    /**
     * Проверяем минимальную продажу в методе {@link StatsService#minSales(long[]) minSales}
     */
    @Test
    public void shouldMinSalesMonth() {

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }
    /**
     * Проверяем количество продаж ниже среднего в методе {@link StatsService#belowAverage(long[]) belowAverage}
     */
    @Test
    public void shouldNumberSalesBelowAverage() {

        int expectedSumMonth = 5;
        long actualSumMonth = service.belowAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }

    /**
     * Проверяем количество продаж выше среднего в методе {@link StatsService#aboveAverage(long[]) aboveAverage}
     */
    @Test
    public void shouldNumberSalesAboveAverage() {

        int expectedSumMonth = 5;
        long actualSumMonth = service.aboveAverage(sales);

        assertEquals(expectedSumMonth, actualSumMonth);
    }
}
