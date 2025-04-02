package ru.netology.stats;

public class StatsService {
    public long amountSales (long[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum += s;
        }
        return sum;
    }

    public double averageSalesAmount (long[] sales) {
        long sum = amountSales(sales);
        return (double) sum / sales.length;
    }

    public int monthMaxSales (long[] sales) {
        int monthMax = 0;
        for (int m = 0; m < sales.length; m++) {
            if(sales[m] >= sales[monthMax]) {
                monthMax = m;
            }
        }
        return monthMax +1;
    }

    public int monthMinSales (long[] sales) {
        int monthMin = 0;
        for (int m = 0; m < sales.length; m++) {
            if (sales[m] <= sales[monthMin]) {
                monthMin = m;
            }
        }
        return monthMin + 1;
    }

    public int countMonthsMinAverageSalesAmount (long[] sales) {
        double average = averageSalesAmount(sales);
        int count = 0;
        for (int m = 0; m < sales.length; m++) {
            if ((double) sales[m] < average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsMaxAverageSalesAmount (long[] sales) {
        double average = averageSalesAmount(sales);
        int count = 0;
        for (int m = 0; m < sales.length; m++) {
            if ((double) sales[m] > average) {
                count++;
            }
        }
        return count;
    }
}
