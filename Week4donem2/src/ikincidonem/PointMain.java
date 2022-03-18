package ikincidonem;

public class PointMain {

	public static void main(String[] args) {
                
	     Point p1 = new Point(8,11);
	     Point p2 = new Point(2,5);
	     // p1 origine uzakligi
		System.out.println("P1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi : " +p1.distanceFromOrigin());
		
		System.out.println("P2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakligi : " +p2.distanceFromOrigin());
		
		p1.translate(11,6);
		System.out.println("P1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi : " +p1.distanceFromOrigin());
		System.out.println("p1 = "+p1);
	}

}
   
