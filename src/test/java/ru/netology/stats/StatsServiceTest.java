package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = 180;
        long actualSales = service.amountSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSales = 15;
        double actualAverageSales = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMax = 8;
        int actualMonthMax = service.monthMaxSales(sales);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMin = 9;
        int actualMonthMin = service.monthMinSales(sales);

        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    public void shouldCountMonthsMinAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.countMonthsMinAverageSalesAmount(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void shouldCountMonthsMaxAverageSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.countMonthsMaxAverageSalesAmount(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}
