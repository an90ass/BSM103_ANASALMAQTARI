package Denemeler;

public class ChristmasTree {
public static final int Height = 6;
public static final int Segment = 3;

public static void main(String[] args) {
	// TODO Auto-generated method stub

	for ( int i=1 ; i <= Segment; i++) {
		tringle(); 
	}
}
	
		public static void tringle() {
			for (int line = 1 ; line <= Height; line++) {
			for ( int space = 1 ; space < Height - line ; space ++) {
				System.out.print(" ");
				
			}
			for (int star = 1 ; star <= 2 * line -1 ; star ++) {
				System.out.print("*");
				
			}
			
	System.out.println();
			}
					
				}	
}
		
		
		
		
