
public class Stock {
	
	static int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	static int min(int a,int b)
	{
		return (a<b)?a:b;
	}
	
	public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
	
	public static void main(String args[])
	{
		int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(maxProfit(prices));
	}

}
