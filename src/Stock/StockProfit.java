package Stock;

import java.util.*;


public class StockProfit {

    public static int maxProfit(int[] prices) {
        int firstSell = 0;
        int lastSell = 0;
        int maxProfit = 0;
        int firstProfit = 0;
        int lastProfit = 0;

        for (firstSell = 1; firstSell <= prices.length - 3; firstSell++) {
            for (int firstBuy = 0; firstBuy < firstSell; firstBuy++) {
                if (prices[firstSell] - prices[firstBuy] > firstProfit) {
                    firstProfit = prices[firstSell] - prices[firstBuy];
                }
            }

            for (lastSell = prices.length - 1 ; lastSell >= firstSell+2; lastSell--) {
                for (int lastBuy = lastSell - 1; lastBuy <= firstSell + 1; lastBuy--)
                {
                    if (prices[lastSell] - prices[lastBuy] > lastProfit)
                    {
                        lastProfit = prices[lastSell] - prices[lastBuy];
                    }
                }
            }

            if (lastProfit + firstProfit > maxProfit) {
                maxProfit = lastProfit + firstProfit;
            }


        }


        return maxProfit;
    }
}