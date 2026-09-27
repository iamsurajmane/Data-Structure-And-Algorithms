public class BestTimeToBuyAndSellThStock {
    public static int maxProfit(int prices[]){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int currProfit = prices[i] - min;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {8,7,2,3,4,5,6,7};

        System.out.println(maxProfit(prices));
    }
}
