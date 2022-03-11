package ikincidonem;

public class pointMain {

	public static void main(String[] args) {
		Point point1 = new Point(); 
		point1.x =5 ;
		point1.y = -7;
		
		Point point2 = new Point(); 
		point2. x = -3 ;
		point2.y = 4;
		System.out.println("Point 1 = ("+point1.x+", "+point1.y+") ");
		double dist = Math.sqrt(point1.x * point1.x + point1.y * point1.y );
		System.out.println("Distance from orinji = "+ dist);
		
		
		System.out.println("Point 2 = ("+point2.x+", "+point2.y+") ");
		double dist2 = Math.sqrt(point2.x * point2.x + point2.y * point2.y );
		System.out.println("Distance from orinji = "+ dist2);
		
		point1.x += 10;
		point1.y += 6;
		point2.x += 1;
	}

}
