package ikincidonem;
import java.util.*;
public class StockMain {

	public static void main(String[] args) {
                   Scanner console = new Scanner(System.in);
                    System.out.print("Ilk magaza ismi :");
		           String store1 = console.next(); 
		           Stock stock1 = new Stock(store1);
		           int profit1 = makePurchases(stock1,console);
		           
		           
		           System.out.print("ikinci magaza ismi :");
		           String store2 = console.next(); 
		           Stock stock2 = new Stock(store2);
		           int profit2 = makePurchases(stock2,console);
		           
		           if (profit1 > profit2) {
		        	   System.out.println(store1 + "daha yararlidir");
		           } else if (profit2 > profit1) {
		        	   System.out.println(store2 + "daha yararlidir");
		        	   
		           }else
		           System.out.println(store1 + "ve" + store2 + "essitir .");
	}

	
	           public static int makePurchases(Stock currentStock, Scanner console) {
	        	   System.out.println("kac kez satin alma yaptin ?");
	        	   int satinalma = console.nextInt();
	        	   
	        	   for (int i = 1 ; i <=satinalma ; i++) {
	        		   System.out.println(i + "alimda kac tane aldin? Birim fiyat nedir? ");
	        		   int numShares = console.nextInt();
	        		   int pricePerShare = console.nextInt();
	        		   currentStock.purchase(numShares , pricePerShare);
	        	   }
	        	   System.out.println("Guncel birim fiyat ?");
	        	   int crrentPrice = console.nextInt();
	        	   
	        	   int profit = currentStock.getProfit(crrentPrice);
	        	   System.out.println("Net kazanc/Kayip : " + profit + "TL");
	        	   System.out.println();
	        	   return profit;
	        	   
	           }
}
