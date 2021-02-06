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
    int minprice = Integer.MAX_VALUE;
    int maxprofit = 0;

    for (int i = 0 ; i < prices.length; i++) {
      if (prices[i] < minprice) {
        minprice = prices[i];
      } else if ( prices[i] - minprice > maxprofit) {
        maxprofit = prices[i] - minprice;
      }
    }
    return maxprofit;
  }

}
