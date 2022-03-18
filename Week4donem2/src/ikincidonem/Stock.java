package ikincidonem;

public class Stock {
                
	private String sotre; 
	private int toplamUrun;
	private int totalCost;
	public Stock(String thestore) {
		if (thestore==null) {
			throw new NullPointerException();
             }
		sotre = thestore;
		toplamUrun= 0;
		totalCost= 0;
	    }
	public int getProfit(int Mevcutfiyat) {
	       if (Mevcutfiyat < 0 ) {
	    	   throw new IllegalArgumentException();   
	       }
	       int marketdegeri  = toplamUrun * Mevcutfiyat;
	       return marketdegeri - totalCost;
	}
	
	public void satinalma(int shares, int pricePerShare) {
		if (shares < 0 || pricePerShare<0) {
	    	   throw new IllegalArgumentException();   
             }
		toplamUrun +=shares;
		totalCost +=shares * pricePerShare;
			
	}
}

