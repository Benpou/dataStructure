package ArrayProblems;

public class BestTimeToBuyAndSell {

  public static void main(String[] args) {

      //int [] prices = {7,6,5,4,3,2,1};
      //int [] prices = {7,6,5,4,3,2,1, 10};
      int [] prices = {7,1,5,3,6,4};
    //int [] prices = {1,2};

    System.out.println(maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
    int maxprofit = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i; j < prices.length; j++) {
        int profit = prices[j] - prices[i];
        if (profit > maxprofit) {
          maxprofit = profit;
        }
      }
    }
    return maxprofit;
  }

}
