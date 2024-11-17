package programm;

public class stockprofit {

    public static int buyAndSellStock(int[] pricerate) {
        int buyPrice = Integer.MAX_VALUE; // Set to MAX_VALUE to find the minimum price
        int maxProfit = 0; // Variable to track the maximum profit

        for (int i = 0; i < pricerate.length; i++) {

            if(buyPrice <pricerate[i] ){
                int profite= pricerate[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profite);
            }else{
                buyPrice=pricerate[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int pricerate[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + buyAndSellStock(pricerate));
    }
}
