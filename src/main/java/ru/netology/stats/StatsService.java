package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long sum = 0; // переменная для подсчета суммы продаж массива
        for (long monthSum : sales) { // monthSum - количество продаж в месяц
            sum = sum + monthSum; // складываем количество продаж в месяц с суммой предыдущих значений
        }
        return sum;
    }

    public long averageOfSales(long[] sales) {
        long sum = 0;
        for (long monthSum : sales) {
            sum = sum + monthSum;
        }
        // sales.length - длина массива sales
        // average - среднее количество продаж
        long average = sum / sales.length;
        return average;
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
}