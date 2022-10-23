package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long sum = 0; // переменная для подсчета суммы продаж массива
        for (long sale : sales) { // monthSum - количество продаж в месяц
            sum = sum + sale; // складываем количество продаж в месяц с суммой предыдущих значений
        }
        return sum;
    }

    public long averageOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        // возвращаем среднее значение
        return sum / sales.length; // sales.length - длина массива sales
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale: sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long belowAverage(long[] sales) {
        long sumBelowAverage = 0;
        for (long sale : sales) {
            if (sale < averageOfSales(sales)) {
                sumBelowAverage++;
            }
        }
        return sumBelowAverage;
    }

    public long aboveAverage(long[] sales) {
        long sumAboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageOfSales(sales)) {
                sumAboveAverage++;
            }
        }
        return sumAboveAverage;
    }
}