package com.myorg.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuySellTest {

    private final BestTimeToBuySell solution = new BestTimeToBuySell();

    @Test
    void shouldReturnFiveWhenBuyingAtLowestPriceAndSellingAtHighestLaterPrice() {
        assertEquals(5,
                solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void shouldReturnZeroWhenPricesContinuouslyDecline() {
        assertEquals(0,
                solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void shouldReturnZeroForSingleTradingDay() {
        assertEquals(0,
                solution.maxProfit(new int[]{5}));
    }

    @Test
    void shouldReturnMaximumProfitForIncreasingPrices() {
        assertEquals(4,
                solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void shouldReturnZeroWhenPricesRemainConstant() {
        assertEquals(0,
                solution.maxProfit(new int[]{3, 3, 3, 3}));
    }

    @Test
    void shouldIdentifyBestBuyAndSellOpportunityInMiddleOfArray() {
        assertEquals(8,
                solution.maxProfit(new int[]{8, 6, 2, 5, 10}));
    }
}

