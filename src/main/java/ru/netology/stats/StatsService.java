package ru.netology.stats;

public class StatsService {

    /**
     * Считаем общую сумму продаж за год
     * @param sales продажи за год по месяцам
     * @return общая сумма продаж
     */
    public long totalSales(long[] sales) {
        long sum = 0; // переменная для подсчета суммы продаж массива
        for (long sale : sales) {
            sum = sum + sale; // складываем количество продаж в месяц с суммой предыдущих значений
        }
        return sum;
    }

    /**
     * Считаем среднюю продажу за год используя сумму продаж из метода {@link #totalSales(long[]) totalSales}
     * @param sales продажи за год по месяцам
     * @return средняя продажа
     */
    public long averageOfSales(long[] sales) {
        long sum = totalSales(sales);
        return sum / sales.length;
    }

    /**
     * Считаем максимальную продажу за год.
     * @param sales продажи за год по месяцам
     * @return максимальная продажа
     */
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale: sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    /**
     * Считаем минимальную продажу за год.
     * @param sales продажи за год по месяцам
     * @return минимальная продажа
     */
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    /**
     * Считаем количество продаж ниже среднего значения, используя среднюю продажу из метода {@link #averageOfSales(long[]) averageOfSales}
     * @param sales продажи за год по месяцам
     * @return количество продаж ниже среднего
     */
    public long belowAverage(long[] sales) {
        long sumBelowAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    /**
     * Считаем количество продаж выше среднего значения, используя среднюю продажу из метода {@link #averageOfSales(long[]) averageOfSales}
     * @param sales продажи за год по месяцам
     * @return количество продаж выше среднего
     */
    public long aboveAverage(long[] sales) {
        long sumAboveAverage = 0;
        long average = averageOfSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                sumAboveAverage++;
            }
        }
        return sumAboveAverage;
    }
}
