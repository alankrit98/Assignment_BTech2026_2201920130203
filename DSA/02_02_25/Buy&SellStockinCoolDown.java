// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).




class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int buy = Integer.MIN_VALUE, sell = 0, cooldown = 0;
        for (int price : prices) {
            int prevBuy = buy, prevSell = sell, prevCooldown = cooldown;
            buy = Math.max(buy, prevCooldown - price);
            sell = Math.max(sell, prevBuy + price);
            cooldown = Math.max(cooldown, prevSell);
        }
        return sell;
    }
}